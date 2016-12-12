package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registro extends AppCompatActivity {

    EditText etcod, etus, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        etcod = (EditText) findViewById(R.id.editText);
        etus = (EditText)findViewById(R.id.editText2);
        etpass = (EditText) findViewById(R.id.editText3);


    }
    public void registrar(View V){
        DBHelper admin = new DBHelper(this,"señales",null,1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String codigo = etcod.getText().toString();
        String usuario = etpass.getText().toString();
        String contraseña = etus.getText().toString();

        ContentValues values = new ContentValues();
        values.put("codigo", codigo);
        values.put("usuario", usuario);
        values.put("contraseña", contraseña);

        db.insert("usuarios",null,values);
        db.close();

        Intent intent = new Intent(Registro.this, login.class);
        startActivity(intent);
    }

    public void cancelar(){
        finish();
    }
}
