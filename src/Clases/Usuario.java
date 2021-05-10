
package Clases;

import java.util.ArrayList;
public class Usuario {
    private int id;
    private String nombre;
    private String contrasena;
    private String correo;
            
    public Usuario()
    {}
    
    public Usuario(String name, String mail, String pass)
    {
        this.nombre = name;
        this.correo = mail;
        this.contrasena = pass;
    }
    
    public int getId()
    {
        return this.id; 
                
    }
    
    public String getContrasena()
    {
        return this.contrasena;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getCorreo()
    {
        return this.correo;
    }
    
    public void setId(int i)
    {
        this.id = i;
    }
    
    public void setNombre(String nam)
    {
        this.nombre = nam;
    }
    
    public void setContrasena(String password)
    {
        this.contrasena = password;
    }
    
    public void setCorreo(String email)
    {
        this.correo = email;
    }
    
    public static String TransArroba(String c)
    {
        return c.replace('@', '0');
    }
    
    public static String DesTransArroba(String c)
    {
        int num = c.lastIndexOf('0');
        String a = c.substring(0, num);
        String b = c.substring (0, c.length()-1);
        String d = a.concat(b);
        
        return d;
    }
    /*
    public static boolean compare(String log, String pass)
    {
        if(Usuario.usuarios.size()>0)
        {
            
                for(int i = 0; i<Usuario.usuarios.size(); i++)
                {
                    if(log.equals(Usuario.usuarios.get(i).getCorreo()) && pass.equals(Usuario.usuarios.get(i).getContrasena()))
                    {
                        return true;
                    }
                        
                }        
        }
        return false;
    }
        
    public static boolean compare(String log)
    {
        for(int i = 0; i<Usuario.usuarios.size(); i++)
        {
            if(log.equals(Usuario.usuarios.get(i).getCorreo()))
                    {
                        return true;
                    }
        }
        return false;
    }*/
    
    public void save(){
        Conexion con = new Conexion();
        con.connect();
        con.saveUsuario(this);
        con.close();
    }
}