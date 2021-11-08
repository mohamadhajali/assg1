package edu.birzeit.taskone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button aboutteam;
    Button palayrteam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aboutteam =(Button)findViewById(R.id.button);
        aboutteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, edu.birzeit.taskone.aboutteam.class);
                startActivity(intent);
            }
        });

        palayrteam = (Button) findViewById(R.id.button2);
        palayrteam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, edu.birzeit.taskone.palayrteam.class);
                startActivity(intent);
            }
        });

    }
}
