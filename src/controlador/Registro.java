/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Vehiculo;

/**
 *
 * @author José Alcantara
 */
public class Registro {
    public boolean Agregar(Vehiculo vehiculo) throws SQLException{
        try {
            Conexion conectar = new Conexion();
            Connection c = conectar.obtenerConexion();
            String query = "INSERT INTO vehiculo(numerochasis, color, precio, tranmision, disponibilidad, marca_id, modelo_id) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = c.prepareStatement(query);
            stmt.setInt(1, vehiculo.getNumeroChasis());
            stmt.setString(2, vehiculo.getColor());
            stmt.setInt(5, vehiculo.getPrecio());
            stmt.setString(4, vehiculo.getTransmision());
            stmt.setBoolean(5, vehiculo.isStock());
            stmt.setObject(6, vehiculo.getMarca());
            stmt.setObject(7, vehiculo.getModelo());

            stmt.executeUpdate();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar vehiculo" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar vehiculo" + e.getMessage());
            return false;
        }
    }
    
}
