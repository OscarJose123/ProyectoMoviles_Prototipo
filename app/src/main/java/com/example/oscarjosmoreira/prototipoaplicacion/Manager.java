package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Oscar José Moreira on 08/12/2016.
 */
public class Manager {

    public static final String TABLE_NAME = "result";
    public static final String CN_NAME = "nombre";

//create table result (
//      nombre text not null,
//      puntaje text);

    public static final String CREATE_TABLE = " create table " +TABLE_NAME+ " ("
            + CN_NAME + "text not null,";


    private Preguntas preguntas;
    private SQLiteDatabase db;

    public Manager(Context context) {

        preguntas = new Preguntas(context);
        db = preguntas.getWritableDatabase();
    }

    public ContentValues generarciondeValores(String nombre){
        ContentValues valores = new ContentValues();
        valores.put(CN_NAME, nombre);


        return valores;
    }


    public void insertar( String nombre){


        db.insert(TABLE_NAME, null, generarciondeValores(nombre));
    }



   // public void insertar2(String nombre, String puntaje){
  //      db.execSQL("INSERT INTO" +TABLE_NAME+ "VALUES (null,'"+nombre+"',"+puntaje+")");
 //   }
    public void eliminar(String nombre){
        db.delete(TABLE_NAME,CN_NAME+"=?",new String[]{nombre});
    }

}
