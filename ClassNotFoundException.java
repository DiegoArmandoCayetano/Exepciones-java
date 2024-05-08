/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 */
public class ClassNotFoundException {
     
    public static void main(String[] args) {
        try {
            // Intentamos cargar una clase que no existe
            Class<?> clazz = Class.forName("ClaseQueNoExiste");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Clase no encontrada.");
            e.printStackTrace();
        }
    }
}
 
