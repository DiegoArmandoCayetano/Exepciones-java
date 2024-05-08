/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */   import java.net.*;
public class ProtocolException {
  
    public static void main(String[] args) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL("http://example.com").openConnection();
            conn.setRequestMethod("INVALID"); // Método de solicitud HTTP inválido
        } catch (ProtocolException e) {
            System.out.println("Error de protocolo: " + e.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
 