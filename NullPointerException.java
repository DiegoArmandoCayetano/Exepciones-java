/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class NullPointerException {
   
    public static void main(String[] args) {
        try {
            String str = null;
            // Intentamos acceder a un método o propiedad de un objeto que es null
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("¡Error! Referencia nula encontrada.");
        }
    }
}

 
 