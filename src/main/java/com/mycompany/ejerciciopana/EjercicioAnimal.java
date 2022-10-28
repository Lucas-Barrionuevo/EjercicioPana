
package com.mycompany.ejerciciopana;
public class EjercicioAnimal {

    public static void main(String[] args) {
        Perro ramon = new Perro("marron", 10, 4);
        Simio pana = new Simio(90, 2);
        Gorila lucas = new Gorila(80, 2);
        Mono nahuel = new Mono (75, 2);
        Persona clauidia = new Persona(55, "123456", "claudia", 90, 2);
        Adulto mariela = new Adulto(50, "123456", "Mariela", 50, 2);
        Bebe sara = new Bebe (7, "11234", "Sara", 30, 2);
        ramon.comer(2);
        ramon.respirar();
        ramon.desplazarse();
        ramon.matarOtroAnimal(nahuel);
        pana.desplazarse();
        pana.morir();
        lucas.matar(pana);
        nahuel.pensar();
        clauidia.saludar();
        mariela.criar(sara);
        mariela.saberCuantosHijosTengo();
        mariela.adoptarPerro(ramon);
        mariela.abandonarBebe(sara);
        sara.saludar();
        ramon.morir();
        
    }
}
