package com.example.liutaurasmazonas.cslogintrying;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

import java.util.List;
import java.util.Objects;

import static com.example.liutaurasmazonas.cslogintrying.R.layout.activity_profile_listview;

/**
 * Created by Joe on 14/04/2017.
 */

public class ClientsList extends ArrayAdapter<Clients> {
    private Activity context;
    private List<Clients> clientsList;
    private Boolean tvTech;
    private Boolean tvMedicine;
    private Boolean tvRenewableEnergy;
    private Boolean tvGoogle;
    private Boolean tvNovartis;
    private Boolean tvTesla;
    private Boolean tvFacebook;
    private Boolean tvApple;
    private Boolean tvYahoo;
    private Boolean tvEURUSD;
    private Boolean tvUSDRUB;
    private Boolean tvSilver;
    private Boolean tvGold;
    private Boolean tvGBPUSD;
    private Boolean tvNASDAQ;
    private Boolean tvSP;
    private String tvID;

    Intent intent = getIntent();
    final String key = (String) getIntent().getExtras().get("key");

    public ClientsList(Activity context, List<Clients> clientsList){

        super(context, activity_profile_listview, clientsList);
        this.context = context;
        this.clientsList = clientsList;
        this.tvID = tvID;
        this.tvTech = tvTech;
        this.tvMedicine = tvMedicine;
        this.tvRenewableEnergy = tvRenewableEnergy;
        this.tvGoogle = tvGoogle;
        this.tvYahoo = tvYahoo;
        this.tvNovartis = tvNovartis;
        this.tvTesla = tvTesla;
        this.tvFacebook = tvFacebook;
        this.tvApple = tvApple;
        this.tvYahoo = tvYahoo;
        this.tvEURUSD = tvEURUSD;
        this.tvUSDRUB = tvUSDRUB;
        this.tvSilver = tvSilver;
        this.tvGold = tvGold;
        this.tvGBPUSD = tvGBPUSD;
        this.tvNASDAQ = tvNASDAQ;
        this.tvSP = tvSP;



    }

    @NonNull
    @Override
    public Activity getContext() {
        return context;
    }

    public List<Clients> getClientsList() {
        return clientsList;
    }

    public String getTvID() {
        return tvID;
    }

    public Boolean getTvTech() {
        return tvTech;
    }

    public Boolean getTvMedicine() {
        return tvMedicine;
    }

    public Boolean getTvRenewableEnergy() {
        return tvRenewableEnergy;
    }

    public Boolean getTvGoogle() {
        return tvGoogle;
    }

    public Boolean getTvNovartis() {
        return tvNovartis;
    }

    public Boolean getTvTesla() {
        return tvTesla;
    }

    public Boolean getTvFacebook() {
        return tvFacebook;
    }

    public Boolean getTvApple() {
        return tvApple;
    }

    public Boolean getTvYahoo() {
        return tvYahoo;
    }

    public Boolean getTvEURUSD() {
        return tvEURUSD;
    }

    public Boolean getTvUSDRUB() {
        return tvUSDRUB;
    }

    public Boolean getTvSilver() {
        return tvSilver;
    }

    public Boolean getTvGold() {
        return tvGold;
    }

    public Boolean getTvGBPUSD() {
        return tvGBPUSD;
    }

    public Boolean getTvNASDAQ() {
        return tvNASDAQ;
    }

    public Boolean getTvSP() {
        return tvSP;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(activity_profile_listview, null, true);

        TextView tvName = (TextView) listViewItem.findViewById(R.id.tvName);
        TextView tvCareer = (TextView) listViewItem.findViewById(R.id.tvCareer);
        TextView tvID = (TextView) listViewItem.findViewById(R.id.tvID);
        TextView tvTech = (TextView) listViewItem.findViewById(R.id.tvTech);
        TextView tvMedicine = (TextView) listViewItem.findViewById(R.id.tvMedicine);
        TextView tvRenewableEnergy = (TextView) listViewItem.findViewById(R.id.tvRenewableEnergy);
        TextView tvGoogle = (TextView) listViewItem.findViewById(R.id.tvGoogle);
        TextView tvNovartis = (TextView) listViewItem.findViewById(R.id.tvNovartis);
        TextView tvTesla = (TextView) listViewItem.findViewById(R.id.tvTesla);
        TextView tvFacebook = (TextView) listViewItem.findViewById(R.id.tvFacebook);
        TextView tvApple = (TextView) listViewItem.findViewById(R.id.tvApple);
        TextView tvYahoo = (TextView) listViewItem.findViewById(R.id.tvYahoo);
        TextView tvGBPUSD = (TextView) listViewItem.findViewById(R.id.tvGBPUSD);
        TextView tvUSDRUB = (TextView) listViewItem.findViewById(R.id.tvUSDRUB);
        TextView tvEURUSD = (TextView) listViewItem.findViewById(R.id.tvEURUSD);
        TextView tvGold = (TextView) listViewItem.findViewById(R.id.tvGold);
        TextView tvSilver = (TextView) listViewItem.findViewById(R.id.tvSilver);
        TextView tvNASDAQ = (TextView) listViewItem.findViewById(R.id.tvNASDAQ);
        TextView tvSP = (TextView) listViewItem.findViewById(R.id.tvSP);

        Clients clients = clientsList.get(position);

        tvName.setText(clients.getClientName());
        tvCareer.setText(clients.getClientCareer());
        tvTech.setText(String.valueOf(clients.getTechCB()));
        tvMedicine.setText(String.valueOf(clients.getMediCB()));
        tvRenewableEnergy.setText(String.valueOf(clients.getRenewableEnergyNF()));
        tvGoogle.setText(String.valueOf(clients.getGoogleNF()));
        tvNovartis.setText(String.valueOf(clients.getNovartisNF()));
        tvTesla.setText(String.valueOf(clients.getTeslaNF()));
        tvFacebook.setText(String.valueOf(clients.getFbLRS()));
        tvApple.setText(String.valueOf(clients.getApplLRS()));
        tvYahoo.setText(String.valueOf(clients.getYhooLRS()));
        tvGBPUSD.setText(String.valueOf(clients.getGbpusdCU()));
        tvUSDRUB.setText(String.valueOf(clients.getUsdrubCU()));
        tvEURUSD.setText(String.valueOf(clients.getEurusdCB()));
        tvGold.setText(String.valueOf(clients.getGoldCO()));
        tvSilver.setText(String.valueOf(clients.getSilverCO()));
        tvNASDAQ.setText(String.valueOf(clients.getNsdqI()));
        tvSP.setText(String.valueOf(clients.getSp500I()));
        tvID.setText()



        return listViewItem;
    }
}
