/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalArgumentException {
   
    public static void main(String[] args) {
        try {
            int number = -5;
            if (number < 0) {
                throw new IllegalArgumentException("El número no puede ser negativo.");
            }
            System.out.println("Número: " + number);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
 
