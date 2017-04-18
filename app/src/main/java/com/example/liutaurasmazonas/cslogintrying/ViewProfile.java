package com.example.liutaurasmazonas.cslogintrying;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joe on 15/04/2017.
 */

public class ViewProfile extends AppCompatActivity{

    ListView listviewClients;
    List<Clients> clientsList;

    DatabaseReference databaseClients;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);

        listviewClients = (ListView) findViewById(R.id.listviewClients);
        databaseClients = FirebaseDatabase.getInstance().getReference("clients");

        clientsList = new ArrayList<>();
    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseClients.addValueEventListener (new ValueEventListener() {


            @Override
            public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
                clientsList.clear();

                for (com.google.firebase.database.DataSnapshot clientsSnapshot : dataSnapshot.getChildren()) {
                    Clients clients = clientsSnapshot.getValue(Clients.class);

                    clientsList.add(clients);
                }
                ClientsList adapter = new ClientsList(ViewProfile.this, clientsList);
                listviewClients.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }



//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                clientsList.clear();
//
//                for (DataSnapshot clientsSnapshot : dataSnapshot.getChildren()) {
//                    Clients clients = clientsSnapshot.getValue(Clients.class);
//
//                    clientsList.add(clients);
//                }
//                ClientsList adapter = new ClientsList(ViewProfile.this, clientsList);
//                listviewClients.setAdapter(adapter);
//            }
//
//            @Override
//            public void onCancelled(FirebaseError firebaseError) {
//
//            }

        });
    }
}