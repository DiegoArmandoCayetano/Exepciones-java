/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class RuntimeException {
    
    public static void main(String[] args) {
        try {
            // Intentamos realizar una operación que podría lanzar una RuntimeException
            int result = divide(10, 0);
            System.out.println("Resultado: " + result);
        } catch (RuntimeException e) {
            System.out.println("¡Error! Se produjo una excepción en tiempo de ejecución: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) {
        // Intentamos dividir por cero, lo que resultará en una ArithmeticException en tiempo de ejecución
        return dividend / divisor;
    }
}

  
