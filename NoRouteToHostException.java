/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

/**
 *
 * @author Lab02pc16
 */
import java.net.*;
public class NoRouteToHostException {
    

    public static void main(String[] args) {
        try {
            // Intentamos establecer una conexión con un host inaccesible
            Socket socket = new Socket("host_invalido", 80);
        } catch (NoRouteToHostException e) {
            System.out.println("Error: No hay una ruta válida al host especificado.");
            e.printStackTrace();
        } catch (UnknownHostException e) {
            System.out.println("Error: No se puede encontrar el host especificado.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: Ocurrió un error inesperado.");
            e.printStackTrace();
        }
    }
}


