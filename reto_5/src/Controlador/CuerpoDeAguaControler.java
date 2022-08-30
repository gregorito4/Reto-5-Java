/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dao.CuerpoDeAguaDAO;
import Modelo.CuerpoDeAgua;
import Vista.Formulario;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Gregory
 */
public class CuerpoDeAguaControler {
        
    public boolean guardar(CuerpoDeAgua cuerpo){
        boolean respuesta=false;        
        try {
            Connection con = Conexion.conectar();        
            String sql = "insert into CuerpoDeAgua (nombre, id, municipio, tipodecuerpodeagua, tipodeagua, clasificacionirca) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            try(con;ps){
                ps.setString(1, cuerpo.getNombre());
                ps.setInt(2, cuerpo.getId_cuerpo_agua());
                ps.setString(3, cuerpo.getMunicipio());
                ps.setString(4, cuerpo.getTipocuerpodeagua());
                ps.setString(5, cuerpo.getTipodeagua());
                ps.setDouble(6, cuerpo.getIrca());
                ps.executeUpdate();
                respuesta=true;
            }            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }        
        return respuesta;
    }
    
    public boolean editar (CuerpoDeAgua cuerpo){
        boolean respuesta=false;
        try{
            Connection con = Conexion.conectar();
        
            String sql = "update CuerpoDeAgua set nombre=?, municipio=?, tipodecuerpodeagua=?, tipodeagua=?, clasificacionirca=? where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            try(con;ps) {
                
                ps.setString(1, cuerpo.getNombre());
                ps.setString(2, cuerpo.getMunicipio());
                ps.setString(3, cuerpo.getTipocuerpodeagua());
                ps.setString(4, cuerpo.getTipodeagua());
                ps.setDouble(5, cuerpo.getIrca());
                ps.setInt(6, cuerpo.getId_cuerpo_agua());

                ps.executeUpdate();

                
                
                respuesta=true;
            }
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
            respuesta=false;
        }
        return respuesta;
    }
    
    public boolean eliminar(CuerpoDeAgua cuerpo){
        boolean respuesta=false;
        try {
            Connection con = Conexion.conectar();
        
            String sql = "delete from CuerpoDeAgua where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            try(con;ps) {
            
            
                ps.setInt(1, cuerpo.getId_cuerpo_agua());

                ps.executeUpdate();
                respuesta=true;
            }
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
            respuesta=false;
        }        
        return respuesta;
    }
    
    public boolean buscar(CuerpoDeAgua cuerpo, int idbuscar){
        boolean respuesta=false;
        
        try {
            Connection con = Conexion.conectar();
            //Consultar en la base de datos
            String sql = "select * from CuerpoDeAgua where id=?";
            ResultSet rs;
            PreparedStatement ps = con.prepareStatement(sql);

            try(con;ps) {

                ps.setInt(1, idbuscar);

                rs = ps.executeQuery();
                if(rs.next()){
                    cuerpo.setNombre(rs.getString("nombre"));
                    cuerpo.setId_cuerpo_agua(rs.getInt("id"));
                    cuerpo.setMunicipio(rs.getString("municipio"));
                    cuerpo.setTipocuerpodeagua(rs.getString("tipodecuerpodeagua"));
                    cuerpo.setTipodeagua(rs.getString("tipodeagua"));
                    cuerpo.setIrca(rs.getDouble("clasificacionirca"));
                    respuesta=true;
                }
                
            } 
            catch (SQLException e) {
               System.out.println(e.getMessage());
            }
           
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }        
        return respuesta;                
    }
    
    
}
