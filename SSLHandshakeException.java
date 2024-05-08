/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */ import java.net.*;
import javax.net.ssl.*;
public class SSLHandshakeException {
    
 
    public static void main(String[] args) {
        try {
            URL url = new URL("https://invalidurl.com");
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.connect(); // Intenta establecer una conexión SSL con una URL inválida
        } catch (SSLHandshakeException e) {
            System.out.println("Error de handshake SSL: " + e.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}