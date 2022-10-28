
package com.mycompany.ejerciciopana;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Adulto extends Persona{
    private List<Bebe> hijos = new LinkedList<Bebe> ();
    private int cantidadDePerros;

    public Adulto(int edad, String dni, String nombre, double peso, int cantidadDePatas) {
        super(edad, dni, nombre, peso, cantidadDePatas);
        this.cantidadDePerros = 0;
    }
    
    public void criar(Bebe bebe){
        if (hijos.isEmpty() == true){
            hijos.add(bebe);
            System.out.println("Criando bebe");
        }else {
            System.out.println("Ya esta criando un bebe, no puede criaar dos a la vez marmota");
        }
    }
    public void abandonarBebe(Bebe bebeAAbandonar){ 
        for (Bebe bebe : hijos){
            if (bebe.equals(bebeAAbandonar)){
                hijos.remove(bebe);
                System.out.println("Se abandono al bebe");
                break;
            }else {
                System.out.println("No se encontro el bebe a abandonar");
            }
        }
    }
    
    public void saberCuantosHijosTengo(){
        for(Bebe hijo: hijos){
            System.out.println("Tengo estos bebes: " + hijo.getNombre() );
        }
    }
    
    public void adoptarPerro(Perro perrito){
        if (cantidadDePerros < 3) {
            cantidadDePerros = cantidadDePerros + 1;
            System.out.println("Adopto un perrito");
        }else {
            System.out.println("Ya tiene muchos perros no rompa las bolas");
        }
    }
}
