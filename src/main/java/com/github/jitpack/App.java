package com.github.jitpack;

/**
 * Esto es una traducción
 * Hola Mundo!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("Mundo"));
    }

    public String greet(String name) {
        return "Hola " + name;
    }
}
