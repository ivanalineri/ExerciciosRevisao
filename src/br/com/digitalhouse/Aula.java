package br.com.digitalhouse;

public class Aula {

    private Materia materia;
    private int horarioDeInicio;
    private int horarioDeTermino;

    public Aula(Materia materia, int horarioDeInicio, int horarioDeTermino) {
        this.materia = materia;
        this.horarioDeInicio = horarioDeInicio;
        this.horarioDeTermino = horarioDeTermino;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getHorarioDeInicio() {
        return horarioDeInicio;
    }

    public void setHorarioDeInicio(int horarioDeInicio) {
        this.horarioDeInicio = horarioDeInicio;
    }

    public int getHorarioDeTermino() {
        return horarioDeTermino;
    }

    public void setHorarioDeTermino(int horarioDeTermino) {
        this.horarioDeTermino = horarioDeTermino;
    }

    public Aula() {

    }


}
