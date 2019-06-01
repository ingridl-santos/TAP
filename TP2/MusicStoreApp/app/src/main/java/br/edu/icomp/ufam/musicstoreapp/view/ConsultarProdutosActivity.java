package br.edu.icomp.ufam.musicstoreapp.view;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import br.edu.icomp.ufam.musicstoreapp.R;
import br.edu.icomp.ufam.musicstoreapp.dao.ProdutoDAO;

/**
 * Created by Ingrid.
 */
public class ConsultarProdutosActivity extends ListActivity {

    private ProdutoDAO produtoDAO;
    private SimpleCursorAdapter cursorAdapter;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        this.produtoDAO = new ProdutoDAO(this);

        cursorAdapter = new SimpleCursorAdapter(this, R.layout.listar_produtos_screen,
                produtoDAO.getProdutos(),
                new String[]{"produto","descrição","categoria"},
                new int[]{R.id.nomeProd, R.id.descricaoProd,
                        R.id.categoriaProd},0);

        setListAdapter(cursorAdapter);
    }

    public void onListItemClick(ListView listView, View view, int pos, long id){
        TextView textNome = (TextView) view.findViewById(R.id.nomeProd);
        Toast.makeText(this, "Produto "+textNome.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
