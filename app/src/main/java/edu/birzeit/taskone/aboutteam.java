package edu.birzeit.taskone;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class aboutteam extends AppCompatActivity {
public ArrayList<jym> array = new ArrayList<>();
Spinner spr;
EditText txt;
Button save;
String msupplier;
Button sub;
EditText person;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setitem();
        setContentView(R.layout.activity_aboutteam);
        spr = findViewById(R.id.planets_spinner);
        txt = findViewById(R.id.txt);
        save = findViewById(R.id.save);
        person = findViewById(R.id.personalname);
        ArrayAdapter<jym> adapter =
                new ArrayAdapter<jym>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, array);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        spr.setAdapter(adapter);
        spr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                // TODO Auto-generated method stub
                 msupplier=spr.getSelectedItem().toString();
                for(int i = 0 ;i< array.size();i++){
                    if(array.get(i).getJymname().equalsIgnoreCase(msupplier)){
                        txt.setText(array.get(i).getJymname()+" Place : "+array.get(i).getPlace()+"\n price per month: "+array.get(i).getPrice());

                    }
                }
                Log.e("Selected item : ",msupplier);
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });

    }
public void savesub(){
    for(int i = 0 ;i< array.size();i++){
        if(array.get(i).getJymname().equalsIgnoreCase(msupplier)){
            array.get(i).setNameofperson(person.getText().toString());
        }

    }

}
public void setitem(){
array.add(new jym("Gym Heroes","Ramallah",150));
array.add(new jym("fitness GYM","Nablus",200));
array.add(new jym("Ramallah GYM","Ramallah",200));
array.add(new jym("Al-quds GYM","Al-quds",200));
array.add(new jym("Power Zone.","salfit",180));
array.add(new jym("Home of Fit Kids.","Hebron",180));
array.add(new jym("Total Body Gym.","Gaza",180));
array.add(new jym("Airdyne Fitness.","Bethlehem",250));
array.add(new jym("Bands Workout Center","Deir al-Balah",100));
array.add(new jym("Mettle Fitness Gym.","Jenin",120));
array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));
    array.add(new jym("Engage Fitness.","Tulkarm",170));

    Prefconfig.wraitlistInPref(getApplicationContext(),array);

}
public void saveitem(){

}
}