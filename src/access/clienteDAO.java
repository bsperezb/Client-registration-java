/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Cliente;
import connection.Conexion;

/**
 *
 * @author brayan
 */
public class clienteDAO {

    public Object[][] getTable() {
        ArrayList<Cliente> listaCliente = new ArrayList();
        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM CLIENTE ORDER BY ID";
        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            System.out.println(rs);

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDoc_identidad(rs.getInt(2));
                c.setNombres(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setTelefono(rs.getInt(5));
                listaCliente.add(c);
            }
            stm.close();
            rs.close();
            co.close();

            Object[][] lista = new Object[listaCliente.size() + 1][5];
            for (int i = 0; i < listaCliente.size(); i++) {
                lista[i][0] = listaCliente.get(i).getId();
                lista[i][1] = listaCliente.get(i).getDoc_identidad();
                lista[i][2] = listaCliente.get(i).getNombres();
                lista[i][3] = listaCliente.get(i).getApellidos();
                lista[i][4] = listaCliente.get(i).getTelefono();
            }

            return lista;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }

        return null;
    }

    public Cliente getCliente(String ID) {

        Connection co = null;
        Statement stm = null;
        ResultSet rs = null;
        Cliente cliente = new Cliente();
        String sql = "SELECT * FROM CLIENTE WHERE ID=" + ID;
        try {
            co = Conexion.conectar();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            System.out.println(rs);

            while (rs.next()) {

                cliente.setId(rs.getInt(1));
                cliente.setDoc_identidad(rs.getInt(2));
                cliente.setNombres(rs.getString(3));
                cliente.setApellidos(rs.getString(4));
                cliente.setTelefono(rs.getInt(5));

            }
            stm.close();
            rs.close();
            co.close();

            return cliente;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método obtener");
            e.printStackTrace();
        }

        return null;

    }

    public boolean insertCliente(Cliente cliente) {
        boolean registrar = false;

        Statement stm = null;
        Connection con = null;

        String sql = "INSERT INTO CLIENTE values (NULL," + cliente.getDoc_identidad() + ",'" + cliente.getNombres() + "','" + cliente.getApellidos() + "'," + cliente.getTelefono() + ")";

        try {
            con = Conexion.conectar();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;

    }

    public boolean updateCliente(Cliente cliente) {

        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE CLIENTE SET DOC_IDENTIDAD=" + cliente.getDoc_identidad() + ", NOMBRES='" + cliente.getNombres() + "', APELLIDOS='" + cliente.getApellidos() + "', TELEFONO=" + cliente.getTelefono() + " WHERE ID=" + cliente.getId();
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;

    }

    public boolean deleteCliente(String ID) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM CLIENTE WHERE ID=" + ID;
        try {
            connect = Conexion.conectar();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;

    }
}
