/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalThreadStateException {
     public static void main(String[] args) {
        try {
            Thread thread = new Thread();
            thread.start();
            thread.start(); // Intenta iniciar el hilo nuevamente
        } catch (IllegalThreadStateException e) {
            System.out.println("IllegalThreadStateException: El hilo ya ha sido iniciado.");
        }
    }
}

 