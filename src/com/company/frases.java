package com.company;

public class frases {
    String[] frases = {"El avion vuela por el cielo azul",
            "hola buenos dias que tal estas",
            "el coche es rojo",
            "el autobus es de color amarillo como el taxi",
            "Hoy voy a ir a la playa que hace mucho calor y no aguanto mas",
            "no me gustra nada ir a jugar a futbol despues de comer"};

    String frase;
    public frases() {
    }

    public String randomfrase() {
        this.frase = frases[(int)(Math.random()* frases.length)];
        return frase;
    }

}
