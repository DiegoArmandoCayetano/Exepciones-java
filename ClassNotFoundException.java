/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class ClassNotFoundException {
    public static void main(String[] args) throws java.lang.ClassNotFoundException {
    try {
        // Intentamos cargar una clase que no existe
        Class.forName("ClaseQueNoExiste");
    } catch (ClassNotFoundException e) {
        System.out.println("¡Error! La clase especificada no fue encontrada.");
    }
}

}
