package com.iessanalberto.joc.profesores;

public class AsigProf {
    char codigoAsignatura;
    int codigoProfesor;

    public AsigProf(char codigoAsignatura, int codigoProfesor) {
        this.codigoAsignatura = codigoAsignatura;
        this.codigoProfesor = codigoProfesor;
    }

    public char getCodigoAsignatura() {
        return codigoAsignatura;
    }

    public void setCodigoAsignatura(char codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    @Override
    public String toString() {
        return "AsigProf{" +
                "codigoAsignatura=" + codigoAsignatura +
                ", codigoProfesor=" + codigoProfesor +
                '}';
    }
}
