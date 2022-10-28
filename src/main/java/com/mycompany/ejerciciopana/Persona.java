
package com.mycompany.ejerciciopana;

import java.util.Date;

public class Persona extends Animal{
    private int edad;
    private String dni, nombre;

    public Persona(int edad, String dni, String nombre, double peso, int cantidadDePatas) {
        super(peso, cantidadDePatas);
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }
    
    public void saludar(){
        System.out.println("Mi nombre es "+ this.nombre + " tengo "+ this.edad + " y mi dni es: "+ this.dni);
    }
}
