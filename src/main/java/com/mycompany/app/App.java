package com.mycompany.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    Prueba p;
    String nombre;

    public App() {
        p = new Prueba("Intento");
        System.out.println("Introduzca un nuevo nombre");
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();
        p.setNombrePrueba(nombre);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Esta es la práctica 1.");
        System.out.println("Probando commit.");
        new App();




    }
}
