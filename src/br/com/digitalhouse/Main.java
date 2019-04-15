package br.com.digitalhouse;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Aula> aulas = new HashSet<>();
        aulas.add(new Aula(new Materia("Poo"),19,22));
        aulas.add(new Aula(new Materia("Java sem Objeto"),19,22));
        aulas.add(new Aula(new Materia("Git"),19,22));


        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ivanildo","Antunes",1234567));
        alunos.add(new Aluno("Tobias","Altarilho",2431244));
        alunos.add(new Aluno("Jordiney","AceleraSãoPaulo",454545));

        Professor professor = new Professor("Tairo Kids",1234456);
        Professor professor1 = new Professor("Jessica Tyler",1234556);


        Curso curso = new Curso();
        curso.setNome("Dev Mobile");
        curso.setAlunos(alunos);
        curso.setAulas(aulas);

        Turma turma = new Turma();
        turma.setNome("Mobile2019");
        turma.setCurso(curso);

        turma.getCurso().getProfessor().fazerChamada();
        turma.getCurso().getProfessor().darAulas();
        for(Aluno aluno: turma.getCurso().getAlunos()){
            aluno.assistirAula(curso.getAulas());
        }






    }
}
