
package com.mycompany.ejerciciopana;

import java.util.Date;

public class Simio extends Animal{

    public Simio(double peso, int cantidadDePatas) {
        super(peso, cantidadDePatas);
    }
    @Override
    public void desplazarse(){
        System.out.println("Me desplazo mas rapido que las demas especies");
    }
    @Override
    public void morir(){
        System.out.println("Los simios nunca mueren");
    }
}
