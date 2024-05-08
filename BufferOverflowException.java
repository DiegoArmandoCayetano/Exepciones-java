/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
   
import java.nio.ByteBuffer;
public class BufferOverflowException {
 


    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(5); // Crear un buffer con una capacidad de 5 bytes
        
        try {
            // Intentar escribir más bytes de los que el buffer puede contener
            for (int i = 0; i < 10; i++) {
                buffer.put((byte) i);
            }
        } catch (BufferOverflowException e) {
            System.out.println("BufferOverflowException: El buffer se llenó más allá de su capacidad.");
        }
    }
}
