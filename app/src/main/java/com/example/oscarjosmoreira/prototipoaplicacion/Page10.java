package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Page10 extends AppCompatActivity {

    private Button menu, siguiente;
    private RadioButton r1, r2, r3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page10);

        r1 = (RadioButton) findViewById(R.id.radioButton27);
        r2 = (RadioButton) findViewById(R.id.radioButton28);
        r3 = (RadioButton) findViewById(R.id.radioButton29);

        menu = (Button) findViewById(R.id.button35);
        siguiente = (Button) findViewById(R.id.button36);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page10.this, MainActivity.class);
                startActivity(intent);
            }
        });
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Page10.this, Page11.class);
                startActivity(intent2);
            }
        });
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
}
