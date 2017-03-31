package com.example.a55.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tvSaludo);
        tv.setText("hola mundo!");


        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setText("Botoncito");


    }
}
