import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodios;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Lost");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());



        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        // meuFilme.somaDasAvaliacoes = 10;

        Serie shadowhunters = new Serie();

        shadowhunters.setNome("Shadowhunters");
        shadowhunters.setAnoDeLancamento(2010);
        shadowhunters.setTemporadas(4);
        shadowhunters.setEpisodiosPorTemp(12);
        shadowhunters.setMinutosPorEp(50);
        System.out.println("Duracao para maratonar Shadowhunters: " + shadowhunters.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(shadowhunters);
        System.out.println("Tempo total: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodios = new Episodios();
        episodios.setNumero(1);
        episodios.setSerie(shadowhunters);
        episodios.setTotalVisualizacoes(300);
        filtro.filtra(episodios);

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listasDeFilmes = new ArrayList<>();
        listasDeFilmes.add(filmeDoPaulo);
        listasDeFilmes.add(meuFilme);
        listasDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listasDeFilmes.size());
        System.out.println("Primeiro filme: " + listasDeFilmes.get(0).getNome());
        System.out.println(listasDeFilmes);



    }

}