package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton3);
    ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton);
    ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);

    imageButton.setOnClickListener(this);
    imageButton1.setOnClickListener(this);
    imageButton2.setOnClickListener(this);

    }
    public void OnClick (View v){

        if(v.getId() == R.id.imageButton3){
            Intent intent = new Intent(this, Manual.class);
            startActivity(intent);
        }
    }

    public void onClick2 (View v2){
        if(v2.getId() == R.id.imageButton){
            Intent intent2 = new Intent(this, Juego.class);
            startActivity(intent2);
        }
    }
    public void onClick3 (View v3){
        if(v3.getId() == R.id.imageButton2){
            Intent intent3 = new Intent(this, Page1.class);
            startActivity(intent3);
        }


    }








}
