/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
import java.lang.reflect.Method;
public class NoSuchMethodException {
    


    public static void main(String[] args) {
        try {
            // Intentamos acceder a un método que no existe en la clase
            Class<?> clazz = MyClass.class;
            Method method = clazz.getDeclaredMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("¡Error! Método especificado no encontrado en la clase.");
        }
    }
}

class MyClass {
    // Definimos una clase para demostrar la excepción
    public void existingMethod() {
        // Este método existe
    } 


}
