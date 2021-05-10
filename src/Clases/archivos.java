/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivos {
    private String id;
    private double cantidad;
    File ficheroDeposito = new File("fichero.txt");
    
    public archivos()
    {
        
    }
    
    public void CrearBDD()
    {
        if(!ficheroDeposito.exists())
        {
            try 
            {
                ficheroDeposito.createNewFile();
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
