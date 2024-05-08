/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Lab02pc16
 */
public class UnsupportedOperationException {
     public static void main(String[] args) {
        try {
            List<String> list = Collections.unmodifiableList(new ArrayList<>());
            list.add("Hello"); // Genera UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: Cannot modify an unmodifiable list!");
        }
    }
}
