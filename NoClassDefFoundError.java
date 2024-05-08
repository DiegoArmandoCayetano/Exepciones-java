/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class NoClassDefFoundError {
 
    public static void main(String[] args) {
        try {
            // Intenta cargar una clase que no está disponible en tiempo de ejecución
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: La clase especificada no se pudo encontrar.");
        } catch (NoClassDefFoundError e) {
            System.out.println("NoClassDefFoundError: Error al cargar la clase durante la ejecución.");
        }
    }
}

 
