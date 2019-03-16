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
public class Sustancia {
    private String nombre;
    private float densidad;
    
    //constructor con parámetros
    public Sustancia(String n,float d)
    {
        nombre=n;
        densidad=d;
    }
    
    //constructor copia
    public Sustancia(Sustancia sus)
    {
        nombre=sus.nombre;
        densidad=sus.densidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDensidad() {
        return densidad;
    }

    public void setDensidad(float densidad) {
        this.densidad = densidad;
    }
    
    public String toString()
    {
        return "\nNombre: "+nombre+"\nDensidad:"+densidad;
    }
    
}
