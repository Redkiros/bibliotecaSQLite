package com.iessanalberto.joc.profesores;

import com.iessanalberto.joc.conexion.Conexion;
import com.iessanalberto.joc.conexion.ManejoTabla;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

// clase para la gestion de la creación y datos de la biblioteca
public class ManejoBiblioteca {
    static ArrayList<Profesores> profesores = new ArrayList<>();
    static ArrayList<Asignaturas> asignaturas = new ArrayList<>();

    static ArrayList<Centros> centros = new ArrayList<>();
    static ArrayList<Especialidad> especialidads = new ArrayList<>();

    public static void crearAsignaturas() {
        //Asignaturas
        asignaturas.add(new Asignaturas("IF0001", "DAHC"));
        asignaturas.add(new Asignaturas("IF0002", "RAL"));
        asignaturas.add(new Asignaturas("IF0003", "IMSI"));
        asignaturas.add(new Asignaturas("IF0004", "DPEG"));
        asignaturas.add(new Asignaturas("IF0005", "PLE"));
        asignaturas.add(new Asignaturas("IF0006", "FPE"));

        asignaturas.add(new Asignaturas("LG0001", "Lengua 1 ESO"));
        asignaturas.add(new Asignaturas("LG0002", "Lengua 2 ESO"));
        asignaturas.add(new Asignaturas("LG0003", "Lengua 3 ESO"));
        asignaturas.add(new Asignaturas("LG0004", "Lengua 4 ESO"));

        asignaturas.add(new Asignaturas("DB0001", "Plástica"));
        asignaturas.add(new Asignaturas("DB0002", "Taller cerámica"));
        asignaturas.add(new Asignaturas("DB0003", "Dibujo Técnico"));

        asignaturas.add(new Asignaturas("MT0001", "Matemáticas 1 BAC"));
        asignaturas.add(new Asignaturas("MT0002", "Matemáticas 2 BAC"));

    }

    public static void crearPofesores() {
        //Profesores
        profesores.add(new Profesores(1001, "Martínez Salas, Fernando", "1001", "1961-09-07", "H"));
        profesores.add(new Profesores(1002, "Bueno Zarco, Elisa", "", "1960-02-17", "M"));
        profesores.add(new Profesores(2002, "Rivera Silvestre, Ana", "3000", "1950-10-10", "M"));
        profesores.add(new Profesores(3000, "De Lucas Fdez, M.Angel", "", "1980-09-09", "M"));
        profesores.add(new Profesores(1010, "Montes García, M.Pilar", "3001", "1970-10-10", "M"));
        profesores.add(new Profesores(1011, "Arroba Conde, Manuel", "", "1970-10-12", "H"));
        profesores.add(new Profesores(1022, "Ruiz Lafuente, Manuel", "1011", "1966-11-11", "H"));
        profesores.add(new Profesores(2000, "Ramos Ruiz, Luis", "2003", "1963-08-08", "H"));
        profesores.add(new Profesores(2003, "Segura Molina, Irene", "", "1963-07-08", "M"));
        profesores.add(new Profesores(1045, "Serrano Laguía, María", "", "1976-01-02", "M"));

    }

    public static void crearCentros() {
        //Centros
        centros.add(new Centros(1000, "IES El Quijote", "1000", "Avda. Los Molinos 25", "GUADALAJARA", "GUADALAJARA"));
        centros.add(new Centros(1015, "CP Los Danzantes", "1010", "C/Las Musas s/n", "PASTRANA", "GUADALAJARA"));
        centros.add(new Centros(1022, "IES Planeta Tierra", "2000", "C/Mina 45", "AZUQUECA", "GUADALAJARA"));
        centros.add(new Centros(1045, "CP Manuel Hidalgo", "", "C/Granada 5", "GUADALAJARA", "GUADALAJARA"));
        centros.add(new Centros(1050, "IES Antoñete", "", "C/Los Toreros 21", "SIGUENZA", "GUADALAJARA"));

    }

    public static void crearAsigProf(){

    }

    public static void insertarAsignaturas() {
        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;

        try {
            for (Asignaturas asignaturas : asignaturas) {
                consulta = miCon.prepareStatement("INSERT INTO C1_ASIGNATURA (COD_ASIG,NOMBRE_ASI) VALUES (?,?)");
                consulta.setString(1, asignaturas.getCOD_ASIG());
                consulta.setString(2, asignaturas.getNOMBRE_ASI());
                consulta.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertarProfesores() {
        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;
        int contador = 0;

        for (Profesores profesores1 : profesores) {
            try {
                consulta = miCon.prepareStatement("INSERT INTO C1_PROFESORES (COD_PROF, NOMBRE_APE, JEFE_DEP, FECHA_NAC, SEXO, COD_CENTRO) VALUES (?,?,?,?,?,?)");
                consulta.setInt(1, profesores1.getCodigoProfesor());
                consulta.setString(2, profesores1.getNombreApe());
                consulta.setString(3, profesores1.getJefeDepartamento());
                consulta.setString(4, profesores1.getFechaNacimiento());
                consulta.setString(5, profesores1.getSexo());
                consulta.setInt(6, centros.get(contador).getCodigoCentro());
                consulta.executeUpdate();

            } catch (SQLException | IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
            contador++;
        }
    }

    public static void insertarCentros() {
        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;

        for (Centros centros1 : centros) {
            try {
                consulta = miCon.prepareStatement("INSERT INTO C1_CENTROS (COD_CENTRO, NOM_CENTRO,DIRECTOR, DIRECCION, LOCALIDAD, PROVINCIA) VALUES (?,?,?,?,?,?)");
                consulta.setInt(1, centros1.getCodigoCentro());
                consulta.setString(2, centros1.getNombreCentro());
                consulta.setString(3, centros1.getDirector());
                consulta.setString(4, centros1.getDireccion());
                consulta.setString(5, centros1.getLocalidad());
                consulta.setString(6, centros1.getProvincia());
                consulta.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void insertarProfesoresTeclado() {
        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;
        Scanner sc = new Scanner(System.in);
        int codigoProf, codigoCentro;
        String nombre;
        String jefe;
        String fecha;
        String sexo;

        System.out.println("Introduce el código del profesor");
        codigoProf = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce el nombre y apellidos del profesor");
        nombre = sc.nextLine();
        System.out.println("Introduce el jefe de departamento");
        jefe = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento");
        fecha = sc.nextLine();
        System.out.println("Introduce el sexo");
        sexo = sc.nextLine();
        System.out.println("Introduce el código del centro");
        codigoCentro = sc.nextInt();

        try {
            consulta = miCon.prepareStatement("INSERT INTO C1_PROFESORES (COD_PROF, NOMBRE_APE, JEFE_DEP, FECHA_NAC, SEXO,  COD_CENTRO) VALUES (?,?,?,?,?,?)");
            consulta.setInt(1, codigoProf);
            consulta.setString(2, nombre);
            consulta.setString(3, jefe);
            consulta.setString(4, fecha);
            consulta.setString(5, sexo);
            consulta.setInt(6, codigoCentro);
            consulta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void crearBiblioteca() {
        crearTablas();
        insertarDatos();
    }

    public static void borraBiblioteca() {
        Connection miCon = Conexion.conectar();
        PreparedStatement consulta;

        try {
            consulta = miCon.prepareStatement("DROP DATABASE centros");
            consulta.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertarDatos() {
        insertarAsignaturas();
//        insertarSocios();
//        insertarPrestamos();
    }

    public static void crearTablas() {
        ManejoTabla.crear("C1_ASIGNATURA",
                "(COD_ASIG CHAR(6) NOT NULL PRIMARY KEY," +
                        "NOMBRE_ASI VARCHAR(30))");

        ManejoTabla.crear("C1_CENTROS",
                "(COD_CENTRO NUMERIC(4) NOT NULL PRIMARY KEY, " +
                        "NOM_CENTRO VARCHAR(20), " +
                        "DIRECTOR NUMERIC(4), " +
                        "DIRECCION VARCHAR(25), " +
                        "LOCALIDAD VARCHAR(20), " +
                        "PROVINCIA VARCHAR(20))");

        ManejoTabla.crear("C1_ESPECIALIDAD",
                "(ESPECIALIDAD CHAR(2) NOT NULL PRIMARY KEY, " +
                        "NOMBRE_ESPE VARCHAR(25))");

        ManejoTabla.crear("C1_PROFESORES",
                "(COD_PROF NUMERIC(4) NOT NULL PRIMARY KEY, " +
                        "NOMBRE_APE VARCHAR(30), " +
                        "ESPECIALIDAD CHAR(2) REFERENCES C1_ESPECIALIDAD(ESPECIALIDAD ), " +
                        "JEFE_DEP NUMERIC(4), " +
                        "FECHA_NAC DATE, " +
                        "SEXO CHAR(1), " +
                        "COD_CENTRO NUMERIC(4) NOT NULL REFERENCES C1_CENTROS (COD_CENTRO))");

        ManejoTabla.crear("C1_ASIGPROF",
                "(COD_ASIG CHAR(6) NOT NULL REFERENCES C1_ASIGNATURAS (COD_ASIG), " +
                        "COD_PROF NUMERIC(4) NOT NULL REFERENCES C1_PROFESORES (COD_PROF), " +
                        "PRIMARY KEY (COD_ASIG,COD_PROF))");

    }
}