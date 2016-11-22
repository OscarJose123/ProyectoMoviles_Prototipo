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

        button10.setOnClickListener((View.OnClickListener) this);
        button9.setOnClickListener((View.OnClickListener) this);
        button8.setOnClickListener((View.OnClickListener) this);
        button11.setOnClickListener((View.OnClickListener) this);
        button12.setOnClickListener((View.OnClickListener) this);
        button13.setOnClickListener((View.OnClickListener) this);
        button14.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick0(View  v){
        if (v.getId() == R.id.button10) {
            Intent intent1 = new Intent(Manual2.this, curvaderecha.class);
            startActivity(intent1);
        }
    }

    public void onClick1(View  v){
        if (v.getId() == R.id.button9) {
            Intent intent2 = new Intent(Manual2.this, cedaelpaso.class);
            startActivity(intent2);
        }
    }


    public void onClick(View  v){
        if (v.getId() == R.id.button8) {
            Intent intent4 = new Intent(Manual2.this, vminimo.class);
            startActivity(intent4);
        }
    }

    public void onClick2(View  v){
        if (v.getId() == R.id.button11) {
            Intent intent5 = new Intent(Manual2.this, noGirar.class);
            startActivity(intent5);
        }
    }
    public void onClick3(View  v){
        if (v.getId() == R.id.button12) {
            Intent intent6 = new Intent(Manual2.this, cedaelpaso.class);
            startActivity(intent6);
        }
    }
    public void onClick4(View  v){
        if (v.getId() == R.id.button13) {
            Intent intent7 = new Intent(Manual2.this, pavimento.class);
            startActivity(intent7);
        }
    }

    public void onClick5(View v){
        if (v.getId() == R.id.button14){
            Intent intent8 = new Intent(Manual2.this, Manual3.class);
            startActivity(intent8);
        }
    }


}
