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
            System.out.println(new App().greet("Mundo de las ramas"));
            

    }

    public String greet(String name) {
        return "Hola " + name;
    }
    //esta clase no hace absolutamente nada más que meter evidencias para sonar.
    public void claseInutil(){
        int a=1;
        String b;

        for(int i=0; i<100; i++){
            System.out.println(" ");
            if(i==null ){
                //jamas se cumplirá esta condición
            }
        System.out.println("Code Smells a tope!!! ");
        
        for(int i=0; i<100; i++){
            System.out.println(" ");
            if(i==null ){
            //jamas se cumplirá esta condición
                }
            
        }
    }
}
