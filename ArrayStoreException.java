/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class ArrayStoreException {
   
    public static void main(String[] args) {
        try {
            Object[] objectArray = new String[10];
            objectArray[0] = new Integer(5); // Genera ArrayStoreException
            System.out.println("Elemento agregado al arreglo.");
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException: Tipo de objeto no compatible con el arreglo.");
        }
    }
}

 