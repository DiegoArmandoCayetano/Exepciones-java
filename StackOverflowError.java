/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class StackOverflowError {
     
    public static void main(String[] args) {
        try {
            recursiveMethod(0);
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError: Desbordamiento de pila alcanzado.");
        }
    }
    
    public static void recursiveMethod(int num) {
        // Método recursivo que eventualmente causa un desbordamiento de pila
        recursiveMethod(num + 1);
    }
}
 
