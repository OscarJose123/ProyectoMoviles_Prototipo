package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener((View.OnClickListener) this);

    }
    public void onClick(View  v){
        if (v.getId() == R.id.button7) {
            Intent intent7 = new Intent(this, Manual2.class);
            startActivity(intent7);
        }
    }



}
