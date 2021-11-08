package edu.birzeit.taskone;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class palayrteam extends AppCompatActivity {
        private ArrayList<jym> listofjym;
    ArrayAdapter ad;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listofjym =  Prefconfig.readlistFronpref(getApplicationContext());
        list = findViewById(R.id.listitem);
         ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listofjym);
        list.setAdapter(ad);


    }

}