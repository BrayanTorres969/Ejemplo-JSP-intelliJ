package com.pe.pruebaWeb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/nombreBaseDatos?serverTimezone=UTC";//cambiar nombrebase
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";
    //Patrón de diseño Singleton
    // El campo para almacenar la instancia singleton debe
    // declararse estático.
    private static Connection con = null;

    // El constructor del singleton siempre debe ser privado
    // para evitar llamadas de construcción directas con el
    // operador `new`.
    private Conexion() {

    }


    //Para obtener la instancia unicamente por este metodo
    //La palabra reservada static hace posibler el acceso mediante Class.metodo
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            if (con == null) {
                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error" + e);
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        return con;
    }
}
