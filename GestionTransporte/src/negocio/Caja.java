/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.LinkedList;
/**
 *
 * @author AlumnoLocal
 */
public class Caja {
    private int codigo;
    private LinkedList<Envase> envases;
    private float resistencia;
    
    public Caja(int c,float r)
    {
        codigo=c;
        resistencia=r;
        //creo la colección
        envases=new LinkedList();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LinkedList<Envase> getEnvases() {
        return envases;
    }

    public void setEnvases(LinkedList<Envase> envases) {
        this.envases = envases;
    }

    public float getResistencia() {
        return resistencia;
    }

    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }
    
    public float pesoTotal()
    {
        float total=0f;
        for(Envase ref:envases)
        {
            total+=ref.pesoLleno();
        }
        return total;
    }
    
    public boolean addEnvase(Envase en)
    {
        boolean res=false;
        if(resistencia >= pesoTotal()+en.pesoLleno())
            res=envases.add(en);
        return res;
    }
    private Envase buscarEnvase(int co)
    {
        Envase en=null;
        for(Envase ref:envases)
            if(ref.getCodigo()==co)
            {
                en=ref;
                break;
            }
        return en;
    }
    
    public Envase removeEnvase(int co)
    {
        Envase en=buscarEnvase(co);
        if(en!=null)
        {
            envases.remove(en);
        }
        return en;
    }
    
    public Envase removeEnvase()
    {
        Envase en=null;
        if(!envases.isEmpty())
        {
            en=envases.getFirst();
            envases.remove(en);
        }
        return en;
    }
    
    public int cantEnvasesCubo()
    {
        int cantCubo=0;
        for(Envase ref:envases)
        {
            if(ref instanceof Cubo)
                cantCubo++;
        }
        return cantCubo;
    }
    
    public int cantEnvasesCilindro()
    {
        int cantCi=0;
        for(Envase ref:envases)
        {
            if(ref instanceof Cilindro)
                cantCi++;
        }
        return cantCi;
    }
    
    public float diametroPromCilindro()
    {
        int cantCi=cantEnvasesCilindro();
        float suma=0f;
        float prom=0f;
        if(cantCi>0)
        {
            for(Envase ref:envases)
            {
                if(ref instanceof Cilindro)
                    /*IMPORTANTE, porque estoy accediendo 
                     a un método específico de una de las
                    derivadas*/
                    suma+=((Cilindro)ref).getDiametro();
            }
            prom=suma/cantCi;
        }
        return prom;
                
                
                
    }
    
    public String toString()
    {
        return "\n\nCodigo "+codigo+"\n"+envases.toString()+"\nResistencia: "+resistencia+"\nPeso total: "+pesoTotal();
    }
    
}
