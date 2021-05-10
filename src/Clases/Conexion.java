/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;

/**
 *
 * @author alver
 */
public class Conexion {
    Connection conexion = null;    
    String url = "usuarios.db";
    
    public static Connection conectar()
    {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:usuarios.db");
            return conexion;
        } catch (Exception ex) {
            return null;
        }
         
    }
    
    public static Connection conectarTarjetas()
    {
    try {
            Class.forName("org.sqlite.JDBC");
            Connection conexion = DriverManager.getConnection("jdbc:sqlite:tarjetas.db");
            return conexion;
        } catch (Exception ex) {
            return null;
        }
    }
    
    
    public void connect(){
 try {
     conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
     if (conexion!=null) {
         System.out.println("Conectado");
     }
 }catch (SQLException ex) {
     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
 }
}
 public void close(){
        try {
            conexion.close();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 }
 
  public void saveUsuario(Usuario user){
        try {
            PreparedStatement st = conexion.prepareStatement("INSERT INTO usuarios (nombre, correo, contraseña) VALUES(?,?,?)");
            st.setString(1, user.getNombre());
            st.setString(2, user.getCorreo());
            st.setString(3, user.getContrasena());
            st.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }

    }
  

 
 
 
    
}
