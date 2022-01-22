package com.mycompany.app;

public class Prueba {

    String nombrePrueba;

    /**
     *
     * @param prueba
     * Este método no se utilizará por el momento.
     */
    public Prueba(String prueba)
    {
        nombrePrueba = prueba;
    }

    public Prueba()
    {

    }



    public String getNombrePrueba()
    {
        return this.nombrePrueba;
    }

    public void setNombrePrueba(String prueba)
    {
        this.nombrePrueba = prueba;
        System.out.println("El nombre de la prueba se ha intruducido correctamente. Nombre: " + prueba);
    }

}
