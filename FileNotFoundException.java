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
public class FileNotFoundException {
 


    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("archivo.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            System.out.println("Contenido del archivo: " + line);
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: El archivo no se encuentra.");
        } catch (IOException e) {
            System.out.println("IOException: Error al leer el archivo.");
        }
    }
}


