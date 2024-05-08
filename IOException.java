/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
 import java.io.*;
public class IOException {
    

 
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String line = reader.readLine();
            System.out.println("Contenido del archivo: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException: Error al leer el archivo.");
        }
    }


}
