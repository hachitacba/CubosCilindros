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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Envase e1,e2,e3,e4,e5;
        Sustancia su1,su2;
        
        su1=new Sustancia("Aceite",5);
        su2=new Sustancia("Agua", 2);
        
        
        Caja cj1=new Caja(1,2000f);
        Caja cj2=new Caja(2,2000f);
        Caja cj3=new Caja(3,2000f);
        Caja cj4=new Caja(4,2000f);
        Caja cj5=new Caja(5,2000f);
        
        e1=new Cubo(1, 10f, 5f);
        e2=new Cubo(2, 10f, 5f);
        e3=new Cilindro(3, 10f, 5f,10f);
        e4=new Cubo(4, 10f, 5f);
        e5=new Cilindro(5, 10f, 10f,8f);
        
        e1.setSustancia(su1);
        e2.setSustancia(su2);
        e3.setSustancia(su1);
        e4.setSustancia(su2);
        e5.setSustancia(su1);
        
        System.out.println("\nLlenamos envase 1 con Aceite: "+e1.toString());
        System.out.println("\nLlenamos envase 2 con Agua: "+e2.toString());
        System.out.println("\nLlenamos envase 3 con Aceite: "+e3.toString());
        System.out.println("\nLlenamos envase 4 con Agua: "+e4.toString());
        System.out.println("\nLlenamos envase 5 con Aceite: "+e5.toString());
        
        cj1.addEnvase(e1);
        cj1.addEnvase(e2);
        cj1.addEnvase(e5);
        
        cj2.addEnvase(e3);
        cj2.addEnvase(e2);
        cj2.addEnvase(e5);
        
        cj3.addEnvase(e1);
        cj3.addEnvase(e3);
        cj3.addEnvase(e4);
        
        cj4.addEnvase(e1);
        cj4.addEnvase(e4);
        cj4.addEnvase(e5);
        
        cj5.addEnvase(e3);
        cj5.addEnvase(e4);
        cj5.addEnvase(e5);
        
        System.out.println("\nDetalle de Cajas");
        System.out.println("\nCaja 1"+cj1.toString());
        System.out.println("\nCaja 2"+cj2.toString());
        System.out.println("\nCaja 3"+cj3.toString());
        System.out.println("\nCaja 4"+cj4.toString());
        
        System.out.println("\nLLENAR EL CAMION\n");
        Camion ca1;
        ca1 = new Camion("Scania");
        ca1.addCaja(cj1);
        ca1.addCaja(cj2);
        ca1.addCaja(cj3);
        ca1.addCaja(cj4);
        ca1.addCaja(cj5);
        
        System.out.println("\nDetalle del camion 1: "+ca1.toString());
                

    }
    
}
