/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class SecurityException {
     

 
    public static void main(String[] args) {
        try {
            // Intentamos crear un archivo en una ubicación restringida
            File file = new File("/root/securefile.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Contenido del archivo");
            writer.close();
            System.out.println("Archivo creado con éxito.");
        } catch (SecurityException e) {
            System.out.println("¡Error! Se ha producido una excepción de seguridad: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("¡Error! Se ha producido una excepción de E/S: " + e.getMessage());
        }
    }
}
 
 
