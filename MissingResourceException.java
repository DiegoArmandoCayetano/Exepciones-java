/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 */
 import java.util.ResourceBundle;

public class MissingResourceException {
   
 
    public static void main(String[] args) {
        try {
            // Intentamos cargar un archivo de propiedades que no existe
            ResourceBundle bundle = ResourceBundle.getBundle("miarchivo");
            String mensaje = bundle.getString("mensaje");
            System.out.println("Mensaje: " + mensaje);
        } catch (MissingResourceException e) {
            System.out.println("Error: Recurso no encontrado.");
            e.printStackTrace();
        }
    }
}
 
