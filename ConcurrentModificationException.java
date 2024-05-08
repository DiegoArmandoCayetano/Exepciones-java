/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
import java.util.*;
public class ConcurrentModificationException {
     

 
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Uno");
        list.add("Dos");
        list.add("Tres");

        try {
            for (String str : list) {
                if (str.equals("Dos")) {
                    list.remove(str); // Genera ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException: Modificación concurrente no permitida durante la iteración.");
        }
    }
}
 
