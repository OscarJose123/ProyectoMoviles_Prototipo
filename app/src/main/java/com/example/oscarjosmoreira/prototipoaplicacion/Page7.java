package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Page7 extends AppCompatActivity {

Page1 pr = new Page1();
    private Button menu, siguiente;
    private RadioButton r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);


        r1 = (RadioButton) findViewById(R.id.radioButton19);
        r2 = (RadioButton) findViewById(R.id.radioButton20);
        r3 = (RadioButton) findViewById(R.id.radioButton21);

        menu = (Button) findViewById(R.id.button29);
        siguiente = (Button) findViewById(R.id.button30);

        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Page7.this, MainActivity.class);
                startActivity(intent);
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operar();
                Intent intent2 = new Intent(Page7.this, Page8.class);
                startActivity(intent2);
            }
        });

    }

    public void operar() {
        if (r1.isChecked() == true) {
            pr.correcto += 1;
        } else if (r2.isChecked() == true) {
            pr.incorrecto += 1;
        } else if (r3.isChecked() == true) {
            pr.incorrecto += 1;
        }
    }



}
