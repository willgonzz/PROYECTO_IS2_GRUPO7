package grupo7.api.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
        String usuario = "postgres";
        String contraseña = "12345678";

        try {
            // Cargar el driver de PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);

            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí puedes realizar operaciones con la base de datos
                // ...

                // Cerrar la conexión
                conexion.close();
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver de PostgreSQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos.");
            e.printStackTrace();
        }
    }
}