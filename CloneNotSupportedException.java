/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_java;

/**
 *
 * @author Lab02pc16
 */
public class CloneNotSupportedException {
    public class Main {
    public static void main(String[] args) {
        try {
            MyClass obj = new MyClass();
            MyClass cloneObj = (MyClass) obj.clone(); // Genera CloneNotSupportedException
            System.out.println("Objeto clonado correctamente.");
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException: La clonación no es compatible para este objeto.");
        }
    }
}

class MyClass implements Cloneable {
}

}
