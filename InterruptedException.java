/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class InterruptedException {
     
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                // Simulamos un trabajo que puede ser interrumpido
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("El hilo ha sido interrumpido mientras dormía.");
            }
        });

        // Iniciamos el hilo
        thread.start();

        // Intentamos interrumpir el hilo después de un cierto tiempo
        try {
            Thread.sleep(2000);
            thread.interrupt(); // Interrumpimos el hilo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 
