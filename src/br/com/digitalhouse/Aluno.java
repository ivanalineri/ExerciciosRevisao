package br.com.digitalhouse;

import java.util.Set;

public class Aluno extends Cadastro {

    private String nome;
    private String sobrenome;
    private float registroAcademico;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        novoNome = "Claudio";
        nome = novoNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String novoSobrenome) {
        novoSobrenome = "Araujo";
        sobrenome = novoSobrenome;
    }

    public float getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(float novoRegistroAcademico) {
        novoRegistroAcademico = 123456;
        registroAcademico = novoRegistroAcademico;
    }

    public void  assistirAula(Set<Aula> aulas){
        for(Aula aula: aulas){
            System.out.println(this.nome + " : assistindo aula: " + aula.getMateria().getNome());
        }
    }

    public void fazerLicaoDeCassa(){
        System.out.println(this.nome + ": fazendo lição de casa: )");

    }

    public Aluno(String nome, String sobrenome, float registroAcademico) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registroAcademico = registroAcademico;
    }

    public Aluno(){

    }
}
