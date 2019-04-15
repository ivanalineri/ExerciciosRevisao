package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Curso extends Cadastro {

    private String nome;
    private Set<Aula> aulas;
    private List<Aluno> alunos;
    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(Set<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public Curso(){

    }

    //private List<Imprimivel> imprimiveis = new ArrayList<>();
}


