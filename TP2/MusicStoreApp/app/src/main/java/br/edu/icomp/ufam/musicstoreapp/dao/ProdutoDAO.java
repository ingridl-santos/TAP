package br.edu.icomp.ufam.musicstoreapp.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import br.edu.icomp.ufam.musicstoreapp.model.Produto;

/**
 * Created by Ingrid.
 */
public class ProdutoDAO {
    private SQLiteDatabase bancoDeDados;

    public ProdutoDAO(Context context){
        this.bancoDeDados = (new BancoDeDados(context)).getWritableDatabase();
    }

    public Produto getProduto(String nome, String categoria){

        Produto produto = null;

        String sqlQuery = "SELECT * FROM Produtos WHERE"+
                "nome='"+nome+"'AND categoria='"+categoria+"'";
        Cursor cursor = this.bancoDeDados.rawQuery(sqlQuery,null);

        if (cursor.moveToNext()){
            produto = new Produto(cursor.getString(0),cursor.getString(1),
                    cursor.getString(2));
        }

        cursor.close();
        return produto;
    }

    public boolean adicionarProduto(Produto produto){
        try {
            String sqlCmd = "INSERT INTO Produtos VALUES('"+
                    produto.getNome()+"',"+" '"+produto.getDescricao()+"', '"+
                    produto.getCategoria()+")";
            this.bancoDeDados.execSQL(sqlCmd);
            return true;
        }catch (SQLException e){
            Log.e("MusicStoreDB",e.getMessage());
            return false;
        }
    }

    public Cursor getProdutos(){
        return this.bancoDeDados.rawQuery("SELECT rowid AS id_prod,"+
                "nome, descricao, categoria"+"FROM Produtos ORDER BY nome",null);
    }
}
