/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 
 */
import java.io.*;
public class UncheckedIOException {
 


    public static void main(String[] args) {
        try {
            // Intentar leer un archivo que no existe
            FileReader fileReader = new FileReader("archivo_que_no_existe.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            System.out.println("Contenido del archivo: " + line);
            reader.close();
        } catch (UncheckedIOException e) {
            System.out.println("UncheckedIOException: Error de E/S no comprobado.");
        } catch (IOException e) {
            System.out.println("IOException: Error de E/S.");
        }
    }
}
   
