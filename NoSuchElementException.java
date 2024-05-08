/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 */
 import java.util.Scanner;

public class NoSuchElementException {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Supongamos que solo esperamos un número entero como entrada
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);
        } catch (NoSuchElementException e) {
            System.out.println("Error: No se encontró el elemento solicitado.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}


