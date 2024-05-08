/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalStateException {
    public static void main(String[] args) {
    try {
        // Intentamos realizar una operación en un estado ilegal
        String currentState = "CLOSED";
        if (!currentState.equals("OPEN")) {
            throw new IllegalStateException("No se puede realizar la operación en el estado actual: " + currentState);
        }
        // Realizar la operación aquí
    } catch (IllegalStateException e) {
        System.out.println("¡Error! Operación no válida debido al estado actual: " + e.getMessage());
    }
}

}
