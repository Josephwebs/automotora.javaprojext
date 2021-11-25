/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            stmt.setInt(3, vehiculo.getPrecio());
            stmt.setString(4, vehiculo.getTransmision());
            stmt.setBoolean(5, vehiculo.isStock());
            stmt.setInt(6, vehiculo.getMarca());
            stmt.setInt(7, vehiculo.getModelo());

            stmt.executeUpdate();
            stmt.close();
            c.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar vehiculo " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar vehiculo" + e.getMessage());
            return false;
        }
    }    
    
    public List<Vehiculo> consultar() {
        java.util.List<Vehiculo> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT numerochasis, marca_id, tranmision, precio FROM vehiculo order by numerochasis";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setNumeroChasis(rs.getInt("numerochasis"));
                vehiculo.setMarca(rs.getInt("marca_id"));
                vehiculo.setTransmision(rs.getString("tranmision"));
                vehiculo.setPrecio(rs.getInt("precio"));

                lista.add(vehiculo);
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar Vehiculos" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar Vehiculos" + e.getMessage());
        }
        return lista;
    }
}
