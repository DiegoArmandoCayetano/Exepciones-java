/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class EnumConstantNotPresentException {
    public enum Color {
    RED, GREEN, BLUE
}

public static void main(String[] args) {
    try {
        
        Color color = Color.valueOf("YELLOW");
    } catch (EnumConstantNotPresentException e) {
        System.out.println("¡Error! La constante de enumeración no está presente.");
    }
}

}
