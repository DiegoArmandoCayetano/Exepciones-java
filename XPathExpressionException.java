/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */    import javax.xml.xpath.*;
import org.xml.sax.InputSource;

public class XPathExpressionException {
 
    public static void main(String[] args) {
        try {
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expr = xpath.compile("//book[@price='cheap'"); // Expresión XPath inválida
            // Supongamos que se está utilizando un documento XML en el que se intenta evaluar esta expresión
        } catch (XPathExpressionException e) {
            System.out.println("Error de XPath: " + e.getMessage());
        }
    }
}

 