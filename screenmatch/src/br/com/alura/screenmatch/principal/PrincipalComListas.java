package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Lost", 2010);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2004);
        meuFilme.avalia(7);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        meuFilme.avalia(8);
        Serie shadowhunters = new Serie(2010, "Shadowhunters");

        

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(shadowhunters);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            // instanceof ve se ele e msm o obj
            if (item instanceof Filme filme && filme.getClassificacao()>2){
                System.out.println("Classificacao " + filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        //deixando em ordem alfabetica
        Collections.sort(buscaPorArtista);
        System.out.println(("Depois da ordenação: "));
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        //ORDENAR O ANO DE LANC COM O SORT
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando o ano: ");
        System.out.println(lista);

    }
}
