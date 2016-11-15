package com.example.oscarjosmoreira.prototipoaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manual extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
    }


    Button button = (Button) findViewById(R.id.button);
    button.setOnClickListener(this);

    @Override
    public void onClick(View v) {

    }
}
