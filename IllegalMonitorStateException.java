/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalMonitorStateException {

    public static void main(String[] args) {
        Object monitor = new Object();

        try {
            
            monitor.wait();
        } catch (IllegalMonitorStateException e) {
            System.out.println("¡Error! Intento ilegal de esperar en un monitor sin haber adquirido el bloqueo.");
        }
    }

   
}
