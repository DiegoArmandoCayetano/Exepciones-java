/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class NumberFormatException {
 
    public static void main(String[] args) {
        try {
            // Intentamos convertir una cadena no numérica en un número
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("¡Error! Formato numérico no válido.");
        }
    }
}

 
 