package tallerbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author Julian Enriquez
 */
public class ConexionMySQL {

    Connection cn;
    Statement st;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "moco12345");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("No soportado");
    }
    // añadi un comentario
}
