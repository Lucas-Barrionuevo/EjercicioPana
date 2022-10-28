
package com.mycompany.ejerciciopana;

import java.util.Date;

public class Gorila extends Simio{
    
    public Gorila(double peso, int cantidadDePatas) {
        super(peso, cantidadDePatas);
    }
    
    public void matar(Animal otroAnimal){
        otroAnimal.setEstaVivo(false);
        System.out.println("El animal a muerto porque se enfrento al dios");
    }
}
