package br.edu.icomp.ufam.musicstoreapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Ingrid.
 */
public class BancoDeDados extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "musicstore.db";
    private static final int DATABASE_VERSION = 1;

    private static final String SQL_CREATE_TABLES = "CREATE TABLE Produtos("+"nome_prod TEXT PRIMARY KEY," +
            "descricao TEXT, categoria TEXT)";

    private static final String SQL_POPULATE_TABLES = "INSERT INTO Produtos"+
            "VALUES('violão tagima','cor:café,cordas:nylon,garantia: 3 meses','Instrumento de Corda')";

    private static final String SQL_DELETE_TABLES = "DROP TABLE IF EXISTS Produtos";

    public BancoDeDados(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL_CREATE_TABLES);
        db.execSQL(SQL_POPULATE_TABLES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(SQL_DELETE_TABLES);
        onCreate(db);
    }
}
