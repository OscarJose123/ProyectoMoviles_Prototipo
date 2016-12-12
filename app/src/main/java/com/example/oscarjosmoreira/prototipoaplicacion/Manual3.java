package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Manual3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual3);


        Button button15 = (Button) findViewById(R.id.button15);
        Button button16 = (Button) findViewById(R.id.button16);

        button15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual3.this, peatones.class);
                startActivity(intent);
            }
        });
        button16.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Manual3.this, pcostado.class);
                startActivity(intent);
            }
        });


    }


}
