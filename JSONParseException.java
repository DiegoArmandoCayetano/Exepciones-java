/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */
public class JSONParseException {
 
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse("{\"key\":}"); // JSON malformado
        } catch (ParseException e) {
            System.out.println("Error de análisis JSON: " + e.getMessage());
        }
    }
}

 