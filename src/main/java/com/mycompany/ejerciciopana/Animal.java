
package com.mycompany.ejerciciopana;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Animal {
    private double peso;
    private int cantidadDePatas;
    private boolean estaVivo;
    private SimpleDateFormat fecha = new SimpleDateFormat ("dd/MM/YYYY");
    private Date fechaDeNacimiento;
    private TimeUnit TimeUnit;

    public Animal(double peso, int cantidadDePatas) {
        this.peso = peso;
        this.cantidadDePatas = cantidadDePatas;
        this.estaVivo = true;
        this.fechaDeNacimiento = new Date ();
    }

    public double getPeso() {
        return peso;
    }

    public int getCantidadDePatas() {
        return cantidadDePatas;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
    
    public void morir() {
        Date fechaDeMuerte = new Date();
        long tiempoDeVida = (fechaDeMuerte.getTime() - this.fechaDeNacimiento.getTime());
        TimeUnit unidad = TimeUnit.DAYS;
        long dias = unidad.convert(tiempoDeVida, TimeUnit.MILLISECONDS);
        this.estaVivo = false;
        System.out.println("Me acabo de morir. Estuve vivo:" + dias );     
        
    }
    
    public void comer(double cantidadDeComida){
        if (estaVivo == true){
            this.peso = (this.peso + cantidadDeComida);
            System.out.println("Comi "+ cantidadDeComida + " kg de comida");
        }
    }
    
    public void respirar(){
        if (estaVivo== true){
            System.out.println("Estoy respirando");
        }else {
            System.out.println("No respira, esta muerto");
        }
    }
    
    public void desplazarse(){
        if (estaVivo==true){
            if (cantidadDePatas>0){
                System.out.println("Me estoy desplazando");
            }else {
                System.out.println("No puedo caminar no tengo patas");
            }
        }else {
            System.out.println("No puedo caminar, estoy muerto");
        }
    }
}
