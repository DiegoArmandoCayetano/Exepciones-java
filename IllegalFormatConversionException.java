/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */

public class IllegalFormatConversionException {
   

public class Main {
    public static void main(String[] args) {
        try {
            String mensaje = String.format("La temperatura actual es: %d grados Celsius", "25");
            System.out.println(mensaje);
        } catch (IllegalFormatConversionException e) {
            System.out.println("IllegalFormatConversionException: Conversión de formato no válida.");
        }
    }
}
