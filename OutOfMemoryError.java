/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class OutOfMemoryError {
    
    public static void main(String[] args) {
        try {
            // Intenta crear un gran número de objetos para agotar la memoria
            int[] array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError: No hay suficiente memoria para crear el objeto.");
        }
    }
}
 