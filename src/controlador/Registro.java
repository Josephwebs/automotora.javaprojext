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
import modelo.Marca;
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

            String query = "SELECT numerochasis, marca_id, tranmision, precio, color, disponibilidad FROM vehiculo order by numerochasis";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setNumeroChasis(rs.getInt("numerochasis"));
                vehiculo.setMarca(rs.getInt("marca_id"));
                vehiculo.setTransmision(rs.getString("tranmision"));
                vehiculo.setPrecio(rs.getInt("precio"));
                vehiculo.setColor(rs.getString("color"));
                vehiculo.setStock(rs.getBoolean("disponibilidad"));
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
    
    public List<Vehiculo> filtroConsultar(int marca, String transmision) {
        java.util.List<Vehiculo> lista = new ArrayList<>();

        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT numerochasis, marca_id, tranmision, precio, color FROM vehiculo order by numerochasis";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Vehiculo vehiculo = new Vehiculo();
                vehiculo.setNumeroChasis(rs.getInt("numerochasis"));
                vehiculo.setMarca(rs.getInt("marca_id"));
                vehiculo.setTransmision(rs.getString("tranmision"));
                vehiculo.setPrecio(rs.getInt("precio"));
                vehiculo.setColor(rs.getString("color"));

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
    
        public boolean eliminar(int numeroChasis) {
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();
            String queryDelete = "DELETE FROM vehiculo WHERE numerochasis=?";
            PreparedStatement stmtDelete = cnx.prepareStatement(queryDelete);
            stmtDelete.setInt(1, numeroChasis);
            stmtDelete.executeUpdate();
            stmtDelete.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar vehiculo" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar vehiculo" + e.getMessage());
            return false;
        }
    }
    public String buscarMarca(int id_marca) {
        Marca marca = new Marca();
        try {
        Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();
            String Query = "SELECT nombre FROM marca WHERE id = ?";
            PreparedStatement stmt = cnx.prepareStatement(Query);
            stmt.setInt(1, id_marca);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                marca.setNombre(rs.getString("nombre"));
            }
            

            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar libro por id" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar libro por id" + e.getMessage());
        }
        String mrc =  marca.getNombre();
        return mrc;
    }    
    

    
    public Vehiculo buscarVehiculo(int nro_chasis) {
        Vehiculo vehiculo = new Vehiculo();
        try {
        Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "SELECT numerochasis, color, precio, tranmision, disponibilidad, marca_id, modelo_id FROM vehiculo WHERE numerochasis = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, nro_chasis);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                vehiculo.setNumeroChasis(rs.getInt("numerochasis"));
                vehiculo.setColor(rs.getString("color"));
                vehiculo.setPrecio(rs.getInt("precio"));
                vehiculo.setTransmision(rs.getString("tranmision"));
                vehiculo.setStock(rs.getBoolean("disponibilidad"));
                vehiculo.setMarca(rs.getInt("marca_id"));
                vehiculo.setModelo(rs.getInt("modelo_id"));
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al listar vehiculo  por id" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al listar vehiculo por id" + e.getMessage());
        }
        return vehiculo;
    }
    
    
    public boolean modificarVehiculo(Vehiculo obj) {
        try {
            Conexion conexion1 = new Conexion();
            Connection cnx = conexion1.obtenerConexion();

            String query = "UPDATE vehiculo set color = ?, precio = ?, tranmision = ?, disponibilidad = ? WHERE numerochasis=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, obj.getColor());
            stmt.setInt(2, obj.getPrecio());
            stmt.setString(3, obj.getTransmision());
            stmt.setBoolean(4, obj.isStock());
            stmt.setInt(5, obj.getNumeroChasis());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error SQL al actualizar vehiculo " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al actualizar Agenda " + e.toString() );
            return false;
        }
    }    
}
