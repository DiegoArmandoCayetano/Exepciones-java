/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class NullPointerException {
    
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Genera NullPointerException
            System.out.println("Longitud de la cadena: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: La cadena es nula.");
        }
    }
}

 
