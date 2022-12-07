package com.iessanalberto.joc.profesores;

import com.iessanalberto.joc.conexion.Conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearCentro {
    public static void main(String[] args) {
        String bd = "centros.dat";
        Connection miCon = Conexion.conectar();
        String consulta = "CREATE DATABASE " + bd;
        try {
            Statement crearBD = miCon.createStatement();
            crearBD.execute(consulta);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}