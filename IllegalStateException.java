/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class IllegalStateException {
     public static void main(String[] args) {
        try {
            String estado = "inactivo";
            if (estado.equals("activo")) {
                System.out.println("El estado es activo.");
            } else {
                throw new IllegalStateException("El estado no es válido.");
            }
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException: " + e.getMessage());
        }
    }
}

 