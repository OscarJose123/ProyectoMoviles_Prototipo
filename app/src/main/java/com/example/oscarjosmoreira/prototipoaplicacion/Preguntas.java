package com.example.oscarjosmoreira.prototipoaplicacion;

import android.content.Intent;

import com.orm.SugarRecord;

/**
 * Created by Oscar José Moreira on 05/12/2016.
 */
public class Preguntas extends SugarRecord{

    String nombre;
    int puntaje;


    public Preguntas(){
    }

    public Preguntas (String nombre, int puntaje){
        this.nombre = nombre;
        this.puntaje = puntaje;
    }
}

