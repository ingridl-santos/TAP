package br.edu.icomp.ufam.musicstoreapp.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.icomp.ufam.musicstoreapp.R;
import br.edu.icomp.ufam.musicstoreapp.dao.ProdutoDAO;
import br.edu.icomp.ufam.musicstoreapp.model.Produto;


/**
 * Created by Ingrid.
 */
public class CadastroProdutoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_screen);
    }

    public void cadastrarProduto(View view){
        EditText mNome = (EditText) findViewById(R.id.input_produto);
        EditText mDescricao = (EditText) findViewById(R.id.input_descricao);
        EditText mCategorias = (EditText) findViewById(R.id.input_categoria);

        Produto produto = new Produto(mNome.getText().toString(),mDescricao.getText().toString(),
                mCategorias.getText().toString());

        ProdutoDAO produtoDAO = new ProdutoDAO(this);
        if (produtoDAO.adicionarProduto(produto)){
            Toast.makeText(this,"Produto cadastrado!",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this,"Erro ao cadastrar produto!",Toast.LENGTH_SHORT).show();
        }
        finish();

    }
}
