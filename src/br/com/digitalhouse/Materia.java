package br.com.digitalhouse;

public class Materia {

    private String nome;



    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        novoNome = "Programação Orientada a Objeto";
        nome = novoNome;
    }

    public Materia(String nome) {
        this.nome = nome;
    }
}
