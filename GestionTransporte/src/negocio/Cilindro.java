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
public class Cilindro extends Envase{
    private float diametro;
    private float altura;
    
    public Cilindro(int c,float pV,float d,float a)
    {
        super(c,pV);
        diametro=d;
        altura=a;
    }
    
    //constructor copia
    public Cilindro(Cilindro ci)
    {
        super(ci);
        //super(ci.getCodigo(),ci.getPesoVacio());
        diametro=ci.diametro;
        altura=ci.altura;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    private float radio()
    {
        return diametro/2;
    }
    
    private float base()
    {
        return (float)(Math.PI*Math.pow(radio(), 2));
    }
    
    public float volumen()
    {
        return base()*altura;
    }
    
    //especialización
    public String toString()
    {
        return super.toString()+"\nDiámetro: "+diametro
                +"\nAltura: "+altura;
    }
    
}
