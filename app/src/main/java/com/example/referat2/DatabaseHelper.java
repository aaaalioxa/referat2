package com.example.referat2;

import android.database.SQLException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String DB_NAME = "products.db";
    private static final int SCHEMA = 1; // версия базы данных
    static final String TABLE = "products"; // название таблицы в бд
    // названия столбцов
    static final String COLUMN_NAME = "name";
    static final String COLUMN_CAL = "calories";
    static final String COLUMN_PROT = "whites";
    static final String COLUMN_CARB = "carbs";
    static final String COLUMN_FAT = "fats";
    private Context myContext;

    DatabaseHelper(Context context) {
        super(context, DB_NAME, null, SCHEMA);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) { }

}