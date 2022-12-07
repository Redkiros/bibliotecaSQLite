package com.iessanalberto.joc.biblioteca;

public class Asignaturas {
    String COD_ASIG;
    String NOMBRE_ASI;

    public Asignaturas(String COD_ASIG, String NOMBRE_ASI) {
        this.COD_ASIG = COD_ASIG;
        this.NOMBRE_ASI = NOMBRE_ASI;
    }

    public String getCOD_ASIG() {
        return COD_ASIG;
    }

    public void setCOD_ASIG(String COD_ASIG) {
        this.COD_ASIG = COD_ASIG;
    }

    public String getNOMBRE_ASI() {
        return NOMBRE_ASI;
    }

    public void setNOMBRE_ASI(String NOMBRE_ASI) {
        this.NOMBRE_ASI = NOMBRE_ASI;
    }

    @Override
    public String toString() {
        return "Asignaturas{" +
                "codigoAsignatura=" + COD_ASIG +
                ", nombreAsignatura='" + NOMBRE_ASI + '\'' +
                '}';
    }
}
