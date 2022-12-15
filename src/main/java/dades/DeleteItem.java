/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dades;

import aplicacio.model.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Albert
 */
public class DeleteItem {
   
    public static void DeleteCliente(Cliente cliente) throws SQLException{
        Connection con = DataSource.getConnection();
        Statement stmt = con.createStatement();
        String query = "delete from customers where customerEmail = " + cliente.getEmail();
        ResultSet rs = stmt.executeQuery(query);
    }

}
