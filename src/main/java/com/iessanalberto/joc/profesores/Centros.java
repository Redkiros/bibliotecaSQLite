package com.iessanalberto.joc.profesores;

public class Centros {
    int codigoCentro;
    String nombreCentro, director, direccion, localidad, provincia;

    public Centros(int codigoCentro, String nombreCentro, String director, String direccion, String localidad, String provincia) {
        this.codigoCentro = codigoCentro;
        this.nombreCentro = nombreCentro;
        this.director = director;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    public int getCodigoCentro() {
        return codigoCentro;
    }

    public void setCodigoCentro(int codigoCentro) {
        this.codigoCentro = codigoCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Centros{" +
                "codigoCentro=" + codigoCentro +
                ", nombreCentro='" + nombreCentro + '\'' +
                ", director='" + director + '\'' +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }
}
