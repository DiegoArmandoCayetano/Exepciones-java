/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */ import javax.xml.stream.*;
import java.io.*;
public class XMLStreamException {
    
 
    public static void main(String[] args) {
        try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("file.xml"));
            while (reader.hasNext()) {
                reader.next(); // Intenta procesar un archivo XML inválido
            }
        } catch (XMLStreamException e) {
            System.out.println("Error de XML: " + e.getMessage());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

 