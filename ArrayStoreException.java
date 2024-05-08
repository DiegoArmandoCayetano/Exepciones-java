/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class ArrayStoreException {
    public static void main(String[] args) {
    Object[] objectArray = new String[3];

    try {
     
        objectArray[0] = 10;
    } catch (ArrayStoreException e) {
        System.out.println("¡Error! Tipo de objeto incorrecto para almacenar en el array.");
    }
}

}
