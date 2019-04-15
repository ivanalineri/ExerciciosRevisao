package br.com.digitalhouse;

public class Professor implements Docente{

    private String nome;
    private float registroDeDocente;

    public Professor(String nome, float registroDeDocente) {
        this.nome = nome;
        this.registroDeDocente = registroDeDocente;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        novoNome = "Jessica";
        nome = novoNome;
    }

    public float getRegistroDeDocente() {
        return registroDeDocente;
    }

    public void setRegistroDeDocente(float novoRegistroDeDocente) {
        novoRegistroDeDocente = 1233455;
        registroDeDocente = novoRegistroDeDocente;
    }

    @Override
    public void darAulas() {

    }

    @Override
    public void fazerChamada() {

    }



    public Professor(){

    }
}
