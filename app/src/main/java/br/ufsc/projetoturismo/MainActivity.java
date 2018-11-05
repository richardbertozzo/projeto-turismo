package br.ufsc.projetoturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static Praia praia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.listaPraia);

        if(praia == null){

            praia = new Praia();

        }

        ArrayList<String> praias = new ArrayList<String>();
        for(int i = 0; i < praia.getFavoritos().size(); i++){

            praias.add(praia.getNomes().get(i));

        }


        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, praias);


        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                listarDetalhesPraia(position);

            }
        });
    }

        Bundle bundle = new Bundle();
        bundle.putInt("posicao", position);
        Intent intent = new Intent(this, DetalhesActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    public void listarTodas(){





        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.favorito){

            ListView lista = (ListView) findViewById(R.id.listaPraia);
            ArrayList<String> praias = new ArrayList<String>();
            for(int i = 0; i < praia.getFavoritos().size(); i++){

                if(praia.getFavoritos().get(i) == 1){
                    praias.add(praia.getNomes().get(i));
                }

            }
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, praias);
            lista.setAdapter(adaptador);

        }else if(id == R.id.todas){

            ListView lista = (ListView) findViewById(R.id.listaPraia);
            ArrayList<String> praias = new ArrayList<String>();
            for(int i = 0; i < praia.getFavoritos().size(); i++){

                praias.add(praia.getNomes().get(i));

            }

            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, praias);
            lista.setAdapter(adaptador);
        }

        return super.onOptionsItemSelected(item);
    }
}
