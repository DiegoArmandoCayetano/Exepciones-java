/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class NumberFormatException {
  
    public static void main(String[] args) {
        try {
            String str = "abc";
            int number = Integer.parseInt(str); // Genera NumberFormatException
            System.out.println("Número convertido: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: No se puede convertir la cadena en un número.");
        }
    }
}

 
