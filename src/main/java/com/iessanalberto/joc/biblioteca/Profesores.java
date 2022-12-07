package com.iessanalberto.joc.biblioteca;

public class Profesores {
    int codigoProfesor;
    String nombreApe;
    String JefeDepartamento;
    String fechaNacimiento;
    String sexo;


    public Profesores(int codigoProfesor, String nombreApe, String jefeDepartamento, String fechaNacimiento, String sexo) {
        this.codigoProfesor = codigoProfesor;
        this.nombreApe = nombreApe;
        JefeDepartamento = jefeDepartamento;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public String getJefeDepartamento() {
        return JefeDepartamento;
    }

    public void setJefeDepartamento(String jefeDepartamento) {
        JefeDepartamento = jefeDepartamento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "codigoProfesor=" + codigoProfesor +
                ", nombreApe='" + nombreApe + '\'' +
                ", JefeDepartamento='" + JefeDepartamento + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sexo=" + sexo +
                '}';
    }
}
