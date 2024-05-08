/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class ClassNotFoundException {
    
    public static void main(String[] args) {
        try {
            // Intenta cargar una clase que no existe
            Class.forName("ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: La clase especificada no se pudo encontrar.");
        }
    }
}
