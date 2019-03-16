/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import java.util.ArrayList;
/**
 *
 * @author AlumnoLocal
 */
public class Camion {
    private String marca;
    private ArrayList<Caja> cajas;
    
    public Camion(String mar)
    {
        marca=mar;
        cajas=new ArrayList(5);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(ArrayList<Caja> cajas) {
        this.cajas = cajas;
    }
    
    public boolean addCaja(Caja ca)
    {
        boolean res=false;
        if(cajas.size()<5)
            res=cajas.add(ca);
        return res;
    }
    
    private Caja buscarCaja(int co)
    {
        Caja ca=null;
        for(Caja ref:cajas)
            if(ref.getCodigo()==co)
            {
                ca=ref;
                break;
            }
        return ca;
    }
    public Caja removeCaja(int co)
    {
        Caja ca=buscarCaja(co);
        if(ca!=null)
        {
            cajas.remove(ca);
        }
        return ca;
    }
    
    public String toString()
    {
        
        return "\nMarca"+marca+"\n"+cajas.toString()+"\nPeso total de las cajas: "+pesoTotalCajas();
    }
    public float pesoTotalCajas(){
        float pt=0f;
        for(Caja ref:cajas){
            pt+=ref.pesoTotal();
        }
        return pt;
    }
    
    public int cantEnvaseCubo(){
        int cantCub=0;
        for(Caja ref:cajas){
            cantCub+=ref.cantEnvasesCubo();
        }
        return cantCub;
    }
    public int cantEnvaseCilindro(){
        int cantCil=0;
        for(Caja ref:cajas){
            cantCil+=ref.cantEnvasesCilindro();
        }
        return cantCil;
    }
    
    public float diametroPromedioCilindros(){
        float prom=0f;
        float acumPromDiam=0f;
        float diamPromCaja=0f;
        int cantCajasConCilindros=0;
        for(Caja iter:cajas){
                diamPromCaja+=iter.diametroPromCilindro();
                if(diamPromCaja>0){
                    acumPromDiam+=diamPromCaja;
                    cantCajasConCilindros++;
                }
            }
        if(cantCajasConCilindros>0)
            prom=acumPromDiam/cantCajasConCilindros;
        return prom;
    }
    
}
