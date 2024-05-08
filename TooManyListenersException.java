/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */import java.awt.event.*;
import javax.swing.*;
public class TooManyListenersException {
 
 
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botón clickeado");
            }
        });

        // Intentar agregar otro listener
        try {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Segundo listener");
                }
            });
        } catch (TooManyListenersException ex) {
            System.out.println("Demasiados listeners: " + ex.getMessage());
        }
    }
}

 