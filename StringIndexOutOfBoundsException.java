/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class StringIndexOutOfBoundsException {
     
    public static void main(String[] args) {
        try {
            String str = "Hello";
            char ch = str.charAt(10); // Genera StringIndexOutOfBoundsException
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException: Index is out of range!");
        }
    }
}

  
