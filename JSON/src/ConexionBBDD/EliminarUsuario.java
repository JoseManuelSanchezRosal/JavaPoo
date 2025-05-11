package ConexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EliminarUsuario {
    public static void main(String[] args) {
        //URL DE DIRECCION DE BBDD, USUARIO Y PASSWORD
        String url = "jdbc:mysql://localhost:3306/conexionbbdd";
        String usuario = "root";
        String password = "";

        try {
            //CONECTAR CON LA BASE DE DARTOS
            Connection conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("CONEXION ESTABLECIDA.......");

            // CON ESTO ELIMINAMOS LOS 10 REGISTROS QUE HICIMOS CON EL FOR EN LA CLASE INSERTAR USUARIOS"
            for (int i = 0; i < 10; i++) {
                PreparedStatement st = conexion.prepareStatement("DELETE FROM usuario WHERE email = ?");
                st.setString(1, "pepe" + i + "@gmail.com");// Con esto borramos desde pepe1@....
                st.execute();
                st.close();

            }
            System.out.println("Usuarios eliminados....");
            //DESCONECTAR CON BASE DE DATOS:
            conexion.close();
            System.out.println("........CONEXION FINALIZADA.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}