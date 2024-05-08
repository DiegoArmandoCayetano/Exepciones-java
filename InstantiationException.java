/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class InstantiationException {
    public class Main {
    public static void main(String[] args) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        try {
            // Intentamos instanciar una clase abstracta o una interfaz, lo cual es imposible
            Object obj = AbstractClass.class.newInstance();
        } catch (InstantiationException e) {
            System.out.println("¡Error! No se puede instanciar una clase abstracta o una interfaz.");
        } catch (IllegalAccessException e) {
            System.out.println("¡Error! Acceso ilegal a la clase.");
        }
    }
    }

abstract class AbstractClass {
    // Definimos una clase abstracta para demostrar el error
}

}
