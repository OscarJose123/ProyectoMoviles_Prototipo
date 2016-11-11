package com.example.oscarjosmoreira.prototipoaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    ImageView imageView = (ImageView) findViewById(R.id.imageView2);
    ImageView imageView2 = (ImageView) findViewById(R.id.imageView3);
    ImageView imageView3 =(ImageView) findViewById(R.id.imageView4);



}
