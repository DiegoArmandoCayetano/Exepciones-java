/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */ import java.lang.reflect.*;

public class ReflectiveOperationException {
 
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("NonExistingClass");
            Object instance = clazz.getDeclaredConstructor().newInstance(); // Intento de instancia de una clase inexistente
        } catch (ReflectiveOperationException e) {
            System.out.println("Error de reflexión: " + e.getMessage());
        }
    }
}

 
