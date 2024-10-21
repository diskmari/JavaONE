package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

// extends: é um
public class Filme extends Titulo implements Classificavel {
    private String diretor;


    // ele nao tem return e tem o mesmo nome da classe
    public Filme(String nome, int anoDeLancamento) {
        super(anoDeLancamento, nome);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    // é necessario o toString para representar o polimorfismo
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
