package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


public class Page2 extends AppCompatActivity {

    private Button menu, siguiente;
    private RadioButton r1, r2, r3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        r1 = (RadioButton) findViewById(R.id.radioButton4);
        r2 = (RadioButton) findViewById(R.id.radioButton5);
        r3 = (RadioButton) findViewById(R.id.radioButton6);

        menu = (Button) findViewById(R.id.button21);
        siguiente = (Button) findViewById(R.id.button22);

        menu.setOnClickListener((View.OnClickListener) this);
        siguiente.setOnClickListener((View.OnClickListener) this);
    }

    public void operar() {
        if (r1.isChecked()==true) {
            Toast.makeText(this, "Correcto",Toast.LENGTH_LONG).show();
        } else
        if (r2.isChecked()==true && r3.isChecked()==true) {
           Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show();
        }
    }



    public void onClick2(View v){
        if(v.getId() == R.id.button21){
            Intent intent = new Intent(Page2.this, MainActivity.class);
            startActivity(intent);
        }
    }
    public void onClick3(View v){
        if (v.getId() == R.id.button22){
            this.operar();
            Intent intent2 = new Intent(Page2.this, Page3.class);
            startActivity(intent2);
        }
    }
}
