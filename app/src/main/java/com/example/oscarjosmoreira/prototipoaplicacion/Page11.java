package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Page11 extends AppCompatActivity {


    private Button menu, siguiente;
    private RadioButton r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page11);

        r1 = (RadioButton) findViewById(R.id.radioButton30);
        r2 = (RadioButton) findViewById(R.id.radioButton31);
        r3 = (RadioButton) findViewById(R.id.radioButton32);

        menu = (Button) findViewById(R.id.button37);
        siguiente = (Button) findViewById(R.id.button38);

        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page11.this, MainActivity.class);
                startActivity(intent);
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Page11.this, Page12.class);
                startActivity(intent2);
            }
        });

    }
}
