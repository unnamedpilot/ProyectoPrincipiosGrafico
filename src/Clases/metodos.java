
package Clases;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class metodos {
    public static Vector vPrincipal = new Vector();
    
    //Guardar archivo en un vector
    public static void guardarTarjeta(Tarjeta tar)
    {
        vPrincipal.addElement(tar);
    }
    
    //Guardar datos en un archivo txt
    public static void guardarArchivo(Tarjeta tar)
    {
        try
        {
            FileWriter fw = new FileWriter("tarjetas.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print("|" + tar.getPregunta());
            pw.print("|" + tar.getRespuesta());
            pw.print("|" + tar.getTema());
            pw.print("|" + tar.getRacha());
            bw.newLine();
            pw.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Funcion para mostrar los archivos en el JTable
    
    public static DefaultTableModel listaTarjetas()
    {
        Vector cabeceras = new Vector();
        cabeceras.addElement("Pregunta");
        cabeceras.addElement("Respuesta");
        cabeceras.addElement("Tema");
        
        //Creamos un tabla para tener el vector en la ubicación 0
        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);
        
        try
        {
            FileReader fr =  new FileReader("tarjetas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d=br.readLine())!=null)
            {
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while(dato.hasMoreTokens())
                {
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return mdlTabla;      
    }
    
    public static void disparar() throws IOException
    {
        
        try (BufferedReader objReader = new BufferedReader(new FileReader("tarjetas.txt"));) {
            
            String lineaActual;
            while((lineaActual=objReader.readLine())!= null)
            {
                System.out.println(lineaActual);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /*
    public static String darPregunta() throws IOException
    {
        StringTokenizer dato;
        try (BufferedReader objReader = new BufferedReader(new FileReader("tarjetas.txt"));) {
            
            String lineaActual;
            while((lineaActual=objReader.readLine())!= null)
            {
                dato = new StringTokenizer(lineaActual,"|");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(metodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dato;
    }*/
    
    
    
}
