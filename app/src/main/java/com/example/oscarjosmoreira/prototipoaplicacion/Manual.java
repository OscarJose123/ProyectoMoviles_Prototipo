package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        Button button = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);

        button6.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Manual.this, vmaxima.class);
                startActivity(intent6);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Manual.this, dobleSentido.class);
                startActivity(intent5);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Manual.this, estacionar.class);
                startActivity(intent4);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Manual.this, circulacion.class);
                startActivity(intent3);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Manual.this, aventajar.class);
                startActivity(intent2);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual.this, Alto.class);
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Manual.this, Manual2.class);
                startActivity(intent7);
            }
        });

    }

}
