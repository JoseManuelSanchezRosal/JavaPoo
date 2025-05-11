package ConexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// NO USAR CARACTERES ESPAÑOLES COMO LA Ñ.
// PARA CAMBIAR NOMBRE:
public class ConexionInsertarUsuario {
    public static void main(String[] args) {
        // URL de conexión
        String url = "jdbc:mysql://localhost:3306/conexionbbdd";
        String usuario = "root";
        String password = "";

        try {
            // Conectar con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("CONEXION ESTABLECIDA.......");
            for (int i = 0; i < 10; i++) {
                //CON ESTO CREAMOS 10 USUARIOS, DESDE PEPE1@....:
                PreparedStatement st = conexion.prepareStatement("INSERT INTO usuario (nombre, email) VALUES (?, ?)");
                st.setString(1, "Pepe");
                st.setString(2, "pepe" + i + "@gmail.com");
                st.execute();
                st.close();
            }
            System.out.println("Usuarios añadidos.");
            conexion.close();
            System.out.println("...........CONEXION FINALIZADA.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}