/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */

import java.util.Scanner;

public class InputMismatchException {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese un número entero:");
            int numero = scanner.nextInt(); // Intenta leer un entero
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: La entrada no es un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}

