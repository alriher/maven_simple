package com.github.jitpack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esto es una traducción
 * Hola Mundo!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        Logger logger = Logger.getLogger(App.class.getName());
        if (logger.isLoggable(Level.INFO)) {
            logger.info(new App().greet("Mundo de las ramas"));
        }
    }

    public String greet(String name) {
        return "Hola " + name;
    }
    //esta clase no hace absolutamente nada más que meter evidencias para sonar.
    public void claseInutil() {
        Logger logger = Logger.getLogger(App.class.getName());
        for (int i = 0; i < 100; i++) {
            logger.info(" ");
            if (i == -1) {
                // This condition will never be true
            }
        }
        logger.info("Code Smells a tope!!! ");

        for (int i = 0; i < 100; i++) {
            logger.info(" ");
            if (i == -1) {
                // This condition will never be true
            }
        }
    }
}
