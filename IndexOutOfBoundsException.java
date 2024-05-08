/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IndexOutOfBoundsException {
    public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
             
            int value = array[3];
            System.out.println("El valor en la posición 3 es: " + value);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("¡Error! Índice fuera de los límites del array.");
        }
    }
}

}
