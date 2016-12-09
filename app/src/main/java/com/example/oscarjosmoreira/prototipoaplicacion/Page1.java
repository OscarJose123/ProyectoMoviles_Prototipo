package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class Page1 extends AppCompatActivity {

   public int correcto, incorrecto;
    private Button menu, siguiente;
    private RadioButton r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        r1 = (RadioButton) findViewById(R.id.radioButton);
        r2 = (RadioButton) findViewById(R.id.radioButton2);
        r3 = (RadioButton) findViewById(R.id.radioButton3);

        menu = (Button) findViewById(R.id.button19);
        siguiente = (Button) findViewById(R.id.button20);

        menu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Page1.this, MainActivity.class);
                startActivity(intent);
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operar();
                Intent intent2 = new Intent(Page1.this, Page2.class);
                startActivity(intent2);
            }
        });

    }

    public void operar() {
        if (r1.isChecked() == true) {
           correcto+= 1;
        } else if (r2.isChecked() == true) {
            incorrecto+= 1;
        } else if (r3.isChecked() == true) {
            incorrecto +=1;
        }


    }
}