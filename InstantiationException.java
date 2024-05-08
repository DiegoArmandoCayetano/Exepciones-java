/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 */
public class InstantiationException {
    
    public static void main(String[] args) {
        try {
            // Intentamos crear una instancia de una clase abstracta
            AbstractClass abstractObject = AbstractClass.class.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Error: No se puede instanciar una clase abstracta.");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("Error: Acceso ilegal a la clase.");
            e.printStackTrace();
        }
    }
}

abstract class AbstractClass {
    // Algunos métodos abstractos
}

