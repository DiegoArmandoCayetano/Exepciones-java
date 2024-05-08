/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */import java.awt.print.*;
public class PrinterAbortException {
     
 
    public static void main(String[] args) {
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.print(); // Intenta realizar una operación de impresión sin configurar una impresora
        } catch (PrinterAbortException e) {
            System.out.println("Operación de impresión abortada: " + e.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
