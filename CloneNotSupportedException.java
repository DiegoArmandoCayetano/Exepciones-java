/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class CloneNotSupportedException {
    public static void main(String[] args) throws java.lang.CloneNotSupportedException {
    try {
       
        Object obj = new Object();
        Object clonedObj = obj.clone();
    } catch (CloneNotSupportedException e) {
        System.out.println("¡Error! La clonación no es compatible con el objeto.");
    }
}

}
