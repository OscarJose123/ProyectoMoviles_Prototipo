package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText e1, e2;
    private Cursor fila;
    private Button registro, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        e1 = (EditText) findViewById(R.id.eTUsuario);
        e2 = (EditText) findViewById(R.id.eTContra);
        registro = (Button) findViewById(R.id.button46);

        registro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, Registro.class);
                startActivity(intent);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }


    public void ingresar(View v){
        DBHelper admin= new DBHelper(this, "señales", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String usuario = e1.getText().toString();
        String contraseña = e2.getText().toString();
        fila=db.rawQuery("select usuario,contraseña from usuarios where usuario'"+usuario+"'and contraseña='"+contraseña+"'",null);
        while(fila.moveToFirst()==true){
            String usua=fila.getString(0);
            String pass=fila.getString(0);

        if(usuario.equals(usua) && contraseña.equals(pass)){
            Intent intent = new Intent(login.this, Page1.class);
            startActivity(intent);
            e1.setText("");
            e2.setText("");
        }
            else{
            Toast.makeText(getApplicationContext(), "Error: usuario Incorrecto",Toast.LENGTH_LONG).show();
        }
        }

    }
    public void salir(){
        finish();
    }



}
