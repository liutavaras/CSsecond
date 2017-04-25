package com.example.liutaurasmazonas.cslogintrying;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.DocumentsContract;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import static android.R.attr.data;

/**
 * Created by Joe on 04/03/2017.
 */
public class ReadRss extends AsyncTask<Void,Void,Void>{
    ArrayList<FeedItem>feedItems;

    RecyclerView recyclerView;
    Context context;
    static ArrayList<String>address;

    static {
        address=new ArrayList<>();
       address.add("https://feeds.finance.yahoo.com/rss/2.0/headline?s=yhoo,msft,tivo&region=US&lang=en-US");
       //address.add("https://www.bloomberg.com/politics/feeds/site.xml");
        //address.add("https://www.bloomberg.com/feeds/podcasts/etf_report.xml");
    }

    ProgressDialog progressDialog;
    URL url;
    public ReadRss(Context context, RecyclerView recyclerView){
        this.recyclerView=recyclerView;
        this.context=context;
        progressDialog=new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
    }

    @Override
    protected void onPreExecute() {
        progressDialog.show();
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Void aVoid) {

        super.onPostExecute(aVoid);
        progressDialog.dismiss();
        MyAdapter adapter=new MyAdapter(context,feedItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.addItemDecoration(new VerticalSpace(50));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected Void doInBackground(Void... params) {
        ProcessXml(Getdata());
        return null;
    }

    private void ProcessXml(ArrayList<Document> data) {
        if (data != null) {
            feedItems = new ArrayList<>();
            for (Document doc : data) {
                Element root = doc.getDocumentElement();
                Node channel = root.getChildNodes().item(1);
                NodeList items = channel.getChildNodes();
                for (int i = 0; i < items.getLength(); i++) {
                    Node currentchild = items.item(i);
                    if (currentchild.getNodeName().equalsIgnoreCase("item")) {
                        FeedItem item = new FeedItem();
                        NodeList itemchilds = currentchild.getChildNodes();
                        for (int j = 0; j < itemchilds.getLength(); j++) {
                            Node current = itemchilds.item(j);
                            if (current.getNodeName().equalsIgnoreCase("title")) {
                                item.setTitle(current.getTextContent());
                            } else if (current.getNodeName().equalsIgnoreCase("description")) {
                                item.setDescription(current.getTextContent());
                            } else if (current.getNodeName().equalsIgnoreCase("pubDate")) {
                                item.setPubDate(current.getTextContent());
                            } else if (current.getNodeName().equalsIgnoreCase("link")) {
                                item.setLink(current.getTextContent());
                            }

                        }
                        feedItems.add(item);
                        Log.d("itemTitle", item.getTitle());
                        Log.d("itemDescription", item.getTitle());
                        Log.d("itemLink", item.getTitle());
                        Log.d("itemPubDate", item.getTitle());
                    }
                }
            }
        }
    }

    public ArrayList<Document> Getdata(){
        ArrayList<Document> documents = new ArrayList<>();
        for (String addr: address) {
            try {
                url = new URL(addr);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                InputStream inputStream = connection.getInputStream();
                DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                Document xmlDoc = builder.parse(inputStream);
                documents.add(xmlDoc);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return documents;
    }
}





