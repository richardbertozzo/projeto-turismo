package br.ufsc.projetoturismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.CompoundButton;
import android.net.Uri;
import android.widget.ImageView;

public class DetalhesActivity extends AppCompatActivity {

    public CheckBox favorito;
    public TextView nome;
    public TextView descricao;
    public Button localizacao;
    public ImageView imagem;

    private Praia praia;

    private int posicao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        this.praia = MainActivity.praia;

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        this.posicao = bundle.getInt("posicao");

        this.nome = (TextView) findViewById(R.id.nomePraia);
        this.descricao = (TextView) findViewById(R.id.descricaoPraia);
        this.favorito = (CheckBox) findViewById(R.id.favorito);
        this.localizacao = (Button) findViewById(R.id.localizacao);
        this.imagem = (ImageView) findViewById(R.id.imagem);

        this.nome.setText(praia.getNomes().get(posicao));
        this.descricao.setText(praia.getDescricoes().get(posicao));
        this.imagem.setImageResource(praia.getImagens().get(posicao));
        if(this.praia.getFavoritos().get(posicao) == 1){
            this.favorito.setChecked(true);
        }


        this.favorito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){

                    praia.getFavoritos().set(posicao, 1);
                    MainActivity.praia.getFavoritos().set(posicao, 1);

                }
                else{

                    praia.getFavoritos().set(posicao, 0);
                    MainActivity.praia.getFavoritos().set(posicao, 0);

                }
            }
        });

        this.localizacao.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + praia.getLocalizacoes().get(posicao));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });


    }

}
