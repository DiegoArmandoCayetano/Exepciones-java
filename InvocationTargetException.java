/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 */
import java.lang.reflect.*;
public class InvocationTargetException {

    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            InvocationTargetException calculator = new InvocationTargetException();
            Method method = InvocationTargetException.class.getMethod("divide", int.class, int.class);
            int result = (int) method.invoke(calculator, 10, 0); // Lanza ArithmeticException
            System.out.println("Resultado de la división: " + result);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof ArithmeticException) {
                System.out.println("ArithmeticException: " + cause.getMessage());
            } else {
                System.out.println("InvocationTargetException: Error al invocar el método.");
            }
        } catch (NoSuchMethodException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}