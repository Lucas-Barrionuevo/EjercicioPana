
package com.mycompany.ejerciciopana;

import java.util.Date;

public class Bebe extends Persona {

    public Bebe(int edad, String dni, String nombre, double peso, int cantidadDePatas) {
        super(edad, dni, nombre, peso, cantidadDePatas);
    }
    
    public void saludar (){
        System.out.println("Soy un bebe imbecil no puedo saludar");
    }
}
