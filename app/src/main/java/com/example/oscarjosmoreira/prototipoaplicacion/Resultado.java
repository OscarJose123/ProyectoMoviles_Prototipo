package com.example.oscarjosmoreira.prototipoaplicacion;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Resultado extends AppCompatActivity {
    Page1 pr = new Page1();
    int nota = 7;//este es el valor de cada pregunta
    TextView nombre, correcto, incorrecto, notaFinal;
    private int Total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Manager manager = new Manager(this);
        manager.insertar("Oscar");

        nombre = (TextView) findViewById(R.id.textView29);
        correcto = (TextView) findViewById(R.id.textView22);
        incorrecto = (TextView) findViewById(R.id.textView23);
        notaFinal = (TextView) findViewById(R.id.textView28);
        nombre.setText(String.valueOf(manager));

        Total = pr.correcto *nota;

        correcto.setText(pr.correcto);
        incorrecto.setText(pr.incorrecto);
        notaFinal.setText(Total);


    }
}
