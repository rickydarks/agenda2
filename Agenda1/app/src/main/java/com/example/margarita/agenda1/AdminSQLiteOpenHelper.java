package com.example.margarita.agenda1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * Created by Margarita on 09/03/2018.
 */

public class AdminSQLiteOpenHelper  extends SQLiteOpenHelper
{


    public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //aqui creamos la tabla de usuario
        sqLiteDatabase.execSQL("create table usuario(nombre text , apellidos text , direccion text, correoe text , telefono integer)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("drop table if exists usuario");

        sqLiteDatabase.execSQL("create table usuario(nombre text, apellidos text , direccion text , correoe text , telefono integer)");

    }
}
