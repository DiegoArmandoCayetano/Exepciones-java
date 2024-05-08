/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class ClassCastException {
    public static void main(String[] args) {
    Object obj = "Hola";

    try {
        
        Integer number = (Integer) obj;
    } catch (ClassCastException e) {
        System.out.println("¡Error! No se puede hacer un casting de String a Integer.");
    }
}

}
