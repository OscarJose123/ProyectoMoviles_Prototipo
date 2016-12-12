package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import static android.R.attr.button;
import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Button btnManual = (Button) findViewById(R.id.btnManual);
    Button btnExamen = (Button) findViewById(R.id.btnExamen);
    Button btnJuega = (Button) findViewById(R.id.btnJuega);


    btnManual.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Manual.class);
            startActivity(intent);
        }
    });
    btnExamen.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Juego.class);
            startActivity(intent);
        }
    });
    btnJuega.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, login.class);
            startActivity(intent);
        }
    });

    }


}
