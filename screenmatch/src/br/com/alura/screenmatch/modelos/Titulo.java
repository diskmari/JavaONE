package br.com.alura.screenmatch.modelos;

public class Titulo {
    //tudo que uma classe tem, objetos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    // SHIFT + F6 TROCA DE classe GERAL
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

//alt + ins : ctrl seleciona mais de um

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //metodo (funcao dentro da class) = maneira
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
    }

    public void avalia(double nota) {
        // vai somando as avaliacoes
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
