/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalArgumentException {
    public static void main(String[] args) {
    try {
        // Intentamos realizar una operación ilegal con un argumento inválido
        int radius = -10;
        if (radius <= 0) {
            throw new IllegalArgumentException("El radio debe ser un valor positivo");
        }
        double area = calculateArea(radius);
        System.out.println("El área del círculo es: " + area);
    } catch (IllegalArgumentException e) {
        System.out.println("¡Error! Argumento ilegal: " + e.getMessage());
    }
}

public static double calculateArea(int radius) {
    return Math.PI * radius * radius;
}

}
