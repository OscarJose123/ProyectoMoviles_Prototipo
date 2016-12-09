package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Page14 extends AppCompatActivity {
    Page1 pr = new Page1();
    private RadioButton r1, r2, r3;
    private Button menu, siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page14);

        r1 = (RadioButton) findViewById(R.id.radioButton39);
        r2 = (RadioButton) findViewById(R.id.radioButton40);
        r3 = (RadioButton) findViewById(R.id.radioButton41);

        menu = (Button) findViewById(R.id.button43);
        siguiente = (Button) findViewById(R.id.button44);

        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Page14.this, MainActivity.class);
                startActivity(intent);
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operar();
                Intent intent2 = new Intent(Page14.this, Page15.class);
                startActivity(intent2);
            }
        });

    }

    public void operar() {
        if (r1.isChecked() == true) {
            pr.incorrecto += 1;
        } else if (r2.isChecked() == true) {
            pr.correcto += 1;
        } else if (r3.isChecked() == true) {
            pr.incorrecto += 1;
        }
    }



}
