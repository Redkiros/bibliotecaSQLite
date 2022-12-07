package com.iessanalberto.joc.conexion;

import com.iessanalberto.joc.profesores.CrearCentro;
import com.iessanalberto.joc.profesores.ManejoBiblioteca;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        ManejoBiblioteca.crearPofesores();
        ManejoBiblioteca.crearCentros();
        ManejoBiblioteca.crearAsignaturas();
        do {

            System.out.println("Elige una opcion:");
            System.out.println("-------------------OPCIONES DE CONSULTA-------------------");
            System.out.println("1. Ver todos los libros");
            System.out.println("2. Ver todos los socios");
            System.out.println("3. Ver todos los prestamos");
            System.out.println("-------------------OPCIONES DE BASE DE DATOS-------------------");
            System.out.println("4. Crear base de datos biblioteca");
            System.out.println("5. Crear Tablas");
            System.out.println("6. Insertar Profesores por teclado");
            System.out.println("7. Insertar Centros");
            System.out.println("8. Insertar Profesores");
            System.out.println("9. Insertar Asignaturas");
            System.out.println("11. Borrar Base de Datos");


            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del programa");
                    System.exit(0);
                    break;
                case 1:
                    Consulta.verTodoLibros();
                    break;
                case 2:
                    Consulta.verTodoSocios();
                    break;
                case 3:
                    Consulta.verTodosPrestamos();
                    break;
                case 4:
                    CrearCentro.main(args);
                    break;
                case 5:
                    ManejoBiblioteca.crearTablas();
                    break;
                case 6:
                    ManejoBiblioteca.insertarProfesoresTeclado();
                case 7:
                    ManejoBiblioteca.insertarCentros();
                    break;
                case 8:
                    ;
                    ManejoBiblioteca.insertarProfesores();
                    break;
                case 9:
                    ManejoBiblioteca.insertarAsignaturas();
                    break;
                case 10:
                    ManejoBiblioteca.borraBiblioteca();
                    break;
            }
        } while (opcion != 0);
    }
}