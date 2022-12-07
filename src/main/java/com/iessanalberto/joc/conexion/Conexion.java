package com.iessanalberto.joc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static String URL = "jdbc:sqlite:src/main/resources/centros.dat";
    static String USER = "root";
    static String PASS = "admin";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexion OK");

        } catch (SQLException e) {
            System.out.println("Error en la conexion");
            e.printStackTrace();
        }
        return conexion;
    }
}
