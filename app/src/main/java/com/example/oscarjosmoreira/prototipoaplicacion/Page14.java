package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page14 extends AppCompatActivity {

    private Button menu, siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);

        menu = (Button) findViewById(R.id.button43);
        siguiente = (Button) findViewById(R.id.button44);

        menu.setOnClickListener((View.OnClickListener) this);
        siguiente.setOnClickListener((View.OnClickListener) this);

    }

    public void onClick2(View v){
        if(v.getId() == R.id.button43){
            Intent intent = new Intent(Page14.this, MainActivity.class);
            startActivity(intent);
        }
    }
    public void onClick3(View v){
        if (v.getId() == R.id.button44){
            Intent intent2 = new Intent(Page14.this, Page15.class);
            startActivity(intent2);
        }
    }


}
