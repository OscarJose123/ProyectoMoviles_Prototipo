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

        button6.setOnClickListener((View.OnClickListener) this);
        button5.setOnClickListener((View.OnClickListener) this);
        button4.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener((View.OnClickListener) this);
        button2.setOnClickListener((View.OnClickListener) this);
        button.setOnClickListener((View.OnClickListener) this);
        button7.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick(View  v){
        if (v.getId() == R.id.button7) {
            Intent intent7 = new Intent(Manual.this, Manual2.class);
            startActivity(intent7);
        }
    }

    public void onClick1(View  v){
        if (v.getId() == R.id.button) {
            Intent intent = new Intent(Manual.this, Alto.class);
            startActivity(intent);
        }
    }
    public void onClick2(View  v){
        if (v.getId() == R.id.button2) {
            Intent intent2 = new Intent(Manual.this, aventajar.class);
            startActivity(intent2);
        }
    }
    public void onClick3(View  v){
        if (v.getId() == R.id.button3) {
            Intent intent3 = new Intent(this, circulacion.class);
            startActivity(intent3);
        }
    }
    public void onClick4(View v){
        if (v.getId() == R.id.button4){
            Intent intent4 = new Intent(Manual.this, estacionar.class);
            startActivity(intent4);
        }
    }
    public void onClick5(View  v){
        if (v.getId() == R.id.button5) {
            Intent intent5 = new Intent(Manual.this, dobleSentido.class);
            startActivity(intent5);
        }
    }
    public void onClick6(View  v){
        if (v.getId() == R.id.button6) {
            Intent intent6 = new Intent(Manual.this, vmaxima.class);
            startActivity(intent6);
        }
    }




}
