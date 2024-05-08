/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab03pc16
 */  import java.sql.*;
public class SQLSyntaxErrorException {
   
 
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELCT * FROM users"); // Error de sintaxis SQL
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
 