/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalThreadStateException {
    
    public static void main(String[] args) {
        Thread thread = new Thread();

        try {
            
            thread.start();
            thread.start();  
        } catch (IllegalThreadStateException e) {
            System.out.println("¡Error! Intento ilegal de iniciar un hilo que ya ha sido iniciado o ya ha finalizado.");
        }
    }
}

 
