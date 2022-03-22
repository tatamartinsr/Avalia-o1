package br.ulbra.classes;

public class Producao 
{
    private String peca;
    private int segundo;
    private int segundos;
    private int minuto;
    private int hora;
    
    
public Producao ()
{
    this.peca = "Teclado";
    this.segundos = 100;
}

    public String getPeca() 
    {
        return peca;
    }

    public void setPeca(String peca) 
    {
        this.peca = peca;
    }

    public int getSegundo() 
    {
        return segundo;
    }

    public void setSegundo(int segundo) 
    {
        this.segundo = segundo;
    }

    public int getSegundos() 
    {
        return segundos;
    }

    public void setSegundos(int segundos) 
    {
        
        if (segundos >= 0)
        {
        this.segundos = segundos;
        }
        else
        {
        this.segundos = 100;
        }
        
    }

    public int getMinuto() 
    {
        return minuto;
    }

    public void setMinuto(int minuto) 
    {
        this.minuto = minuto;
    }

    public int getHora() 
    {
        return hora;
    }

    public void setHora(int hora) 
    {
        this.hora = hora;
    }
    
    public void calcularHMS()
    {
       this.segundo = segundos;
       this.minuto = segundos / 60;
       this.hora = segundos / 3600;
       
       while (minuto >=60)
       {
           minuto-=60;
       }
       while (segundo >=60)
       {
           segundo-=60;
       }
       
    }

    public String toString() 
    {
        return "A peça = " + this.getPeca() + ", que levou um total de = " + this.getSegundos()+ " segundos, "
        + this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo() + " para ficar pronta!!!"; 
    }
    
}
