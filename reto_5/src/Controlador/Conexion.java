/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gregory
 */
public class Conexion {
    public static Connection conectar(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:sqlite:IRCA.db");
            System.out.println("Estoy conectado");
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con; 
    }
}
