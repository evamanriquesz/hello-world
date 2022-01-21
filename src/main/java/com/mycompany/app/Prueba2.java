package com.mycompany.app;

public class Prueba2 {

    String nombrePrueba;

    public Prueba(String prueba) {
        nombrePrueba = prueba;
    }

    public String getNombrePrueba() {
        return this.nombrePrueba;
    }

    public void setNombrePrueba(String prueba) {
        this.nombrePrueba = prueba;
        System.out.println("El nombre de la prueba se ha cambiado correctamente. Nuevo nombre: " + prueba);
    }
}

