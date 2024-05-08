/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author Lab02pc16
 */
public class IllegalAccessException {
    public static void main(String[] args) throws java.lang.IllegalAccessException, InvocationTargetException {
    try {
        // Intentamos acceder a un método privado mediante reflexión
        Class<?> clazz = MyClass.class;
        Method method = clazz.getDeclaredMethod("privateMethod");
        method.setAccessible(true); // Necesario para acceder a un método privado
        method.invoke(new MyClass());
    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
        System.out.println("¡Error! Acceso ilegal al método.");
    }
}

class MyClass {
    private void privateMethod() {
        System.out.println("Método privado invocado.");
    }
}

}
