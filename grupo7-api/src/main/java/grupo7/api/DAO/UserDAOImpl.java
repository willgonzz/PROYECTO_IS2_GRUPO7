package grupo7.api.DAO;

import grupo7.api.beans.Users;
import grupo7.api.database.PostgreSQLConnection;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl extends PostgreSQLConnection implements UserDAO {

    private final String url;
    private final String username;
    private final String password;

    public UserDAOImpl(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public List<Users> obtenerTodosLosUsuarios() {
        List<Users> usuarios = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM usuarios")) {

            while (resultSet.next()) {
                Users usuario = new Users(
                        resultSet.getInt("id_usuario"),
                        resultSet.getString("nombre_usuario"),
                        resultSet.getString("descripcion_usuario"),
                        resultSet.getInt("numero_telefono"),
                        resultSet.getString("role"),
                        resultSet.getString("contrasena"),
                        resultSet.getTimestamp("fecha_creacion")
                );
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
    public void insertarUsuario(Users usuario) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO usuarios (nombre_usuario, descripcion_usuario, numero_telefono, role, contrasena) " +
                    "VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, usuario.getNombreUsuario());
            preparedStatement.setString(2, usuario.getDescripcionUsuario());
            preparedStatement.setInt(3, usuario.getNumeroTelefono());
            preparedStatement.setString(4, usuario.getRole());
            preparedStatement.setString(5, usuario.getContrasena());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarUsuario(Users usuario) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "UPDATE usuarios SET nombre_usuario = ?, descripcion_usuario = ?, " +
                    "numero_telefono = ?, role = ?, contrasena = ? WHERE id_usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, usuario.getNombreUsuario());
            preparedStatement.setString(2, usuario.getDescripcionUsuario());
            preparedStatement.setInt(3, usuario.getNumeroTelefono());
            preparedStatement.setString(4, usuario.getRole());
            preparedStatement.setString(5, usuario.getContrasena());
            preparedStatement.setInt(6, usuario.getIdUsuario());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(int idUsuario) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, idUsuario);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
