package grupo7.api.beans;

import java.security.Timestamp;

public class Users {
    private Integer idUsuario;
    private String nombreUsuario;
    private String descripcionUsuario;
    private Integer numeroTelefono;
    private String role;
    private String contrasena;
    private Timestamp fechaCreacion;

    public Users(String nombreUsuario, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.descripcionUsuario = descripcionUsuario;
        this.numeroTelefono = numeroTelefono;
        this.role = role;
        this.contrasena = contrasena;
        this.fechaCreacion = fechaCreacion;
    }

    public Users(int id_usuario, String nombre_usuario, String descripcion_usuario, int numero_telefono, String role, String contrasena, java.sql.Timestamp fecha_creacion) {
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNombreUsuario() {
            return nombreUsuario;
        }

        public String getContrasena() {
            return contrasena;
        }

        public boolean validarContrasena(String contrasena) {
            return this.contrasena.equals(contrasena);
        }



}
