/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exepciones_ja;

import java.util.ServiceLoader;

/**
 *
 * @author Lab02pc16
 */
public class ServiceConfigurationError {
  
 public static void main(String[] args) {
        ServiceLoader<MyServiceInterface> loader = ServiceLoader.load(MyServiceInterface.class);
        // Resto del código
    }
}


