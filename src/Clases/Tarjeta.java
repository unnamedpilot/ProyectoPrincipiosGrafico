
package Clases;

public class Tarjeta
{
    
    private String pregunta;
    private String respuesta;
    private String tema;
    private int ultVezRespondida;
    private int racha = 0;
    public static int posAñadir;

    public Tarjeta()
    {
    }
    
    public Tarjeta(String preg, String resp)
    {
        this(preg, resp, "General");
    }

    public Tarjeta(String preg, String resp, String tema)
    {
        this.pregunta = preg;
        this.respuesta = resp;
        this.tema = tema;

        Tarjeta.posAñadir++;
    }

    public void califPreg(boolean calif)
    {
        if(calif==true)
        {
            this.racha = this.racha + 1;
        }
        else
        {
            this.racha = 0;
        }
    }

    public void setPregunta(String preg)
    {
        this.pregunta = preg;
    }

    public void setRespuesta(String resp)
    {
        this.respuesta = resp;
    }
    
    public void setTema(String tema)
    {
        this.tema = tema;
    }
    
    public void setRacha(int racha)
    {
        this.racha = racha;
    }
    
    public void rachaString(boolean a)
    {
        if(a)
        {
            this.racha = this.racha + 1;
        }
        else
        {
            this.racha = 0;
        }
    }
    
    public String getPregunta()
    {
        return this.pregunta;
    }

    public String getRespuesta()
    {
        return this.respuesta;
    }
    
    public String getTema()
    {
        return this.tema;
    }
    
    public int getRacha()
    {
        return this.racha;
    }
    
    public static int cantidadTarjetas()
    {
        return Tarjeta.posAñadir;
    }
    
    @Override
    public String toString()
    {
        return "Pregunta: " + this.getPregunta() + "\n" + "Respuesta: " + this.getRespuesta() + "\n" + "Tema: " + this.getTema() + "\n";
    }
    
    public static void eliminarTarjeta()
    {
        Tarjeta.posAñadir = Tarjeta.posAñadir - 1;
    }
}    