/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author AlumnoLocal
 */
public class Cubo extends Envase{
    private float lado;
    
    //constructor con parámetros
    public Cubo(int c,float pV,float l)
    {
        super(c,pV);
        lado=l;
    }
    
    //constructor copia
    public Cubo(Cubo cu)
    {
        //super(cu.getCodigo(),cu.getPesoVacio());
        super(cu);
        lado=cu.lado;     
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    /**
     * Método polimórfico que calcula y retorna 
     * el volumen de un envase con forma de cubo
     * @return el volumen del envase cúbico
     */
    public float volumen()
    {
        return (float)Math.pow(lado, 3);
    }
    
    //especialización
    public String toString()
    {
        return super.toString()+"\nLado: "+lado+" cm";
    }
    
    
}
