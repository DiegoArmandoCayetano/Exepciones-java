/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
  import java.lang.reflect.*;
public class IllegalAccessException {
  

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("MyClass");
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true); // Acceso a constructor privado
            MyClass obj = (MyClass) constructor.newInstance();
            System.out.println("Objeto creado correctamente.");
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException: Acceso ilegal a un miembro de la clase.");
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | InvocationTargetException ex) {
            ex.printStackTrace();
        }
    }
}

class MyClass {
    private MyClass() {
        // Constructor privado
    }
}


