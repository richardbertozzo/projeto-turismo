package br.ufsc.projetoturismo;

import java.util.ArrayList;

/**
 * Created by Jan Pierry on 18/11/2016.
 */

public class Praia {

    private ArrayList<String> nomes;

    private ArrayList<String> descricoes;

    private ArrayList<Integer> favoritos;

    private ArrayList<String> localizacoes;

    private ArrayList<Integer> imagens;

    public Praia() {
        this.nomes = new ArrayList<>();
        this.descricoes = new ArrayList<>();
        this.favoritos = new ArrayList<>();
        this.localizacoes = new ArrayList<>();
        this.imagens = new ArrayList<>();
        nomes.add("Joaquina");
        nomes.add("Barra da lagoa");
        nomes.add("Armação");
        nomes.add("Ingleses");
        nomes.add("Pantano do sul");
        descricoes.add("Joaquina é um dos lugares mais procurados por sufistas e esportistas em geral, todos os dias têm partidas de futebol na areia, futevôlei, corredores, etc.");
        descricoes.add("Conhecida pela cordialidade dos seus moradores nativos e as belezas naturais, a praia atrai inúmeros turistas na alta temporada.");
        descricoes.add("A praia da Armação possui 2,5 km e mar bastante agitado, recebeu este nome porque assim eram chamadas todas as praias onde eram caçadas as baleias.");
        descricoes.add("A Praia dos Ingleses conta com bares, shows, restaurantes, casas noturnas e o forte comércio garantem a diversão de famílias e jovens à noite, enquanto que durante o dia a praia é o local preferido.");
        descricoes.add("O Pântano do Sul é a maior e mais tradicional praia de pesca de Santa Catarina, com ricas colônias de pescadores. Na região, ainda ocorrem cercos de tainha com arrastões.");
        favoritos.add(0);
        favoritos.add(0);
        favoritos.add(0);
        favoritos.add(0);
        favoritos.add(0);
        localizacoes.add("Praia da Joaquina, Florianópolis - SC");
        localizacoes.add("Praia da Barra da Lagoa, Florianópolis - SC");
        localizacoes.add("Praia da Armação, Florianópolis - SC");
        localizacoes.add("Praia dos Ingleses, Florianópolis - SC");
        localizacoes.add("Praia do Pântano do Sul - Pântano do Sul, Florianópolis - SC");
        imagens.add(R.drawable.joaquina);
        imagens.add(R.drawable.barra);
        imagens.add(R.drawable.armacao);
        imagens.add(R.drawable.ingleses);
        imagens.add(R.drawable.pantano);
    }

    public void alterarFavorito(int posicao){

        if(favoritos.get(posicao) == 0){

            favoritos.set(posicao, 1);

        }else{

            favoritos.set(posicao, 0);

        }

    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public ArrayList<String> getDescricoes() {
        return descricoes;
    }

    public ArrayList<Integer> getFavoritos() {
        return favoritos;
    }

    public ArrayList<String> getLocalizacoes() {
        return localizacoes;
    }

    public ArrayList<Integer> getImagens() {
        return imagens;
    }
}
