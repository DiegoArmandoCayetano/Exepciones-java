/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class NegativeArraySizeException {
  
    public static void main(String[] args) {
        try {
            // Intentamos crear un array con un tamaño negativo
            int[] array = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("¡Error! Tamaño negativo del array.");
        }
    }
}

 
