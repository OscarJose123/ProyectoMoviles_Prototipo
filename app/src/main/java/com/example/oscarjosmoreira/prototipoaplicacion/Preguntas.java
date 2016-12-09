package com.example.oscarjosmoreira.prototipoaplicacion;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Oscar José Moreira on 05/12/2016.
 */
public class Preguntas extends SQLiteOpenHelper {

    private static final String DB_NAME = "resultado.sqlite";
    private static final int DB_SCHEME_VERSION = 1;


    public Preguntas(Context context) {
        super(context, DB_NAME, null, DB_SCHEME_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Manager.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

