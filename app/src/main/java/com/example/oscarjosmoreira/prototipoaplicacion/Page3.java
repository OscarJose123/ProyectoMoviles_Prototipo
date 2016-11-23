package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Page3 extends AppCompatActivity {


    private Button menu, siguiente;
    private RadioButton r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        r1 = (RadioButton) findViewById(R.id.radioButton7);
        r2 = (RadioButton) findViewById(R.id.radioButton8);
        r3 = (RadioButton) findViewById(R.id.radioButton9);

        menu = (Button) findViewById(R.id.button17);
        siguiente = (Button) findViewById(R.id.button18);

        menu.setOnClickListener((View.OnClickListener) this);
        siguiente.setOnClickListener((View.OnClickListener) this);

    }

    public void onCheckedTrue(){
        if(r1.isChecked() == true){
            Toast.makeText(this, "InCorrecto", Toast.LENGTH_LONG).show();
        }
    }

    public void onChecked(){
        if(r2.isChecked() == true){
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show();
        }
    }
    public void onChecked1(){
        if (r3.isChecked() == true){
            Toast.makeText(this, "InCorrecto", Toast.LENGTH_LONG).show();
        }
    }


    public void onClick2(View v){
        if(v.getId() == R.id.button17){
            Intent intent = new Intent(Page3.this, MainActivity.class);
            startActivity(intent);
        }
    }
    public void onClick3(View v){
        if (v.getId() == R.id.button18){
            Intent intent2 = new Intent(Page3.this, Page4.class);
            startActivity(intent2);
        }
    }

}
