/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.programa;

import core.person.Locutor;
import java.util.ArrayList;

/**
 *
 * @author vangu
 */
public class Programa  {
    private String nombre;
    private int serial;
    private static int ID = 0;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;

    public Programa(String nombre, Locutor locutor) {
        
        this.nombre = nombre;
        this.serial = Programa.ID;
        this.emisiones = new ArrayList<>();
        this.locutores = new ArrayList<>();
        
        this.locutores.add(locutor);
        this.locutores.get(0).addPrograma(this);
        
        Programa.ID++;
    }
    
    public Emision getLastEmision(){
        return this.emisiones.get(this.emisiones.size()-1);
    }
    
    public boolean addEmision(Emision emision){
        return this.emisiones.add(emision);
    }
    
    public ArrayList<Emision> getEmisiones(){
        return emisiones;
    }
    
    public String getNombre(){
        return nombre;
    }
}
