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
public class InsertItem {

    public void InsertarCliente(Cliente cliente) throws SQLException {
        Connection con = DataSource.getConnection();
        Statement stmt = con.createStatement();
        String query = "Insert into customers(customerEmail,idCard,customerName,phone,creditLimit,birthDate) values (" + cliente.getEmail() + "," + cliente.getDni() + "," + cliente.getNombre() + "," + cliente.getTelefono() + "," + cliente.getCreditoLimite() + "," + cliente.getFechaNacimiento() + ");";
        ResultSet rs = stmt.executeQuery(query);
    }

}
