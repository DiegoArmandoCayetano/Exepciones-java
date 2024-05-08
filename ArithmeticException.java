/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class ArithmeticException {
    
    public static void main(String[] args) {
    int dividend = 10;
    int divisor = 0;

    try {
        int result = dividend / divisor;
        System.out.println("El resultado de la división es: " + result);
    } catch (ArithmeticException e) {
        System.out.println("¡Error! División por cero.");
    }
}

}
