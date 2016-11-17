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

    ImageView imageView = (ImageView) findViewById(R.id.imageView2);
    ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
    ImageView imageView3 = (ImageView) findViewById(R.id.imageView4);

    imageView.setOnClickListener(this);
    imageView2.setOnClickListener(this);
    imageView3.setOnClickListener(this);

    }
    public void OnClick (View v){

        if(v.getId() == R.id.imageView2){
            Intent intent = new Intent(this, Manual.class);
            startActivity(intent);
        }
    }

    public void onClick2 (View v2){
        if(v2.getId() == R.id.imageView3){
            Intent intent2 = new Intent(this, Juego.class);
            startActivity(intent2);
        }
    }
    public void onClick3 (View v3){
        if(v3.getId() == R.id.imageView4){
            Intent intent3 = new Intent(this, Page1.class);
            startActivity(intent3);
        }


    }








}
