
package com.mycompany.ejerciciopana;

import java.util.Date;

public class Perro extends Animal{
    private String colorDePelo;

    public Perro(String colorDePelo, double peso, int cantidadDePatas) {
        super(peso, cantidadDePatas);
        this.colorDePelo = colorDePelo;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }
    
    public void matarOtroAnimal(Animal otroAnimal){
        if (otroAnimal.getEstaVivo()==true ){
            if (getPeso() > otroAnimal.getPeso()){
                otroAnimal.setEstaVivo(false);
                System.out.println("Mataste al animal");
            }else {
                this.setEstaVivo(false);
                System.out.println("El animal te mato, porque es mas grande, boludo");
            }
        }else {
            System.out.println("No podes matar al animal, porque ya esta muerto");
        }
    }
}
