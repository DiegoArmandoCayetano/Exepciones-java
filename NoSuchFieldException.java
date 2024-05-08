/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
import java.lang.reflect.Field;
public class NoSuchFieldException {


    public static void main(String[] args) {
        try {
            // Intentamos acceder a un campo que no existe en la clase
            Class<?> clazz = MyClass.class;
            Field field = clazz.getDeclaredField("nonExistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("¡Error! Campo especificado no encontrado en la clase.");
        }
    }
}

class MyClass {
    // Definimos una clase para demostrar la excepción
    private int myField;
}
   

