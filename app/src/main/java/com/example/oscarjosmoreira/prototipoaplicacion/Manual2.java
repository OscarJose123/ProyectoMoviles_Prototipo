package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manual2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual2);

        Button button8 = (Button) findViewById(R.id.button8);
        Button button9 = (Button) findViewById(R.id.button9);
        Button button10 = (Button) findViewById(R.id.button10);
        Button button11 = (Button) findViewById(R.id.button11);
        Button button12 = (Button) findViewById(R.id.button12);
        Button button13 = (Button) findViewById(R.id.button13);
        Button button14 = (Button) findViewById(R.id.button14);

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Manual2.this, curvaderecha.class);
                startActivity(intent1);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Manual2.this, cedaelpaso.class);
                startActivity(intent2);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Manual2.this, vminimo.class);
                startActivity(intent4);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Manual2.this, noGirar.class);
                startActivity(intent5);
            }
        });
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Manual2.this, cedaelpaso.class);
                startActivity(intent6);
            }
        });
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Manual2.this, pavimento.class);
                startActivity(intent7);
            }
        });
        button14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(Manual2.this, Manual3.class);
                startActivity(intent8);
            }
        });

    }

}
