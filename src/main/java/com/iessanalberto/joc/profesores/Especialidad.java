package com.iessanalberto.joc.profesores;

public class Especialidad {
    static char especialidad;
    String nombreEspe;

    public Especialidad(char especialidad, String nombreEspe) {
        this.especialidad = especialidad;
        this.nombreEspe = nombreEspe;
    }

    public char getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(char especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreEspe() {
        return nombreEspe;
    }

    public void setNombreEspe(String nombreEspe) {
        this.nombreEspe = nombreEspe;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "especialidad=" + especialidad +
                ", nombreEspe='" + nombreEspe + '\'' +
                '}';
    }
}
