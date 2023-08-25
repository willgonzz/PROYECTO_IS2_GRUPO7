package grupo7.api.beans;

public class Rol {
    private Integer id_rol;
    private String nombre_rol;
    private String descripcion_rol;
    private Integer id_permiso;

    // Constructor
    public Rol(Integer id_rol, String nombre_rol, String descripcion_rol, Integer id_permiso) {
        this.id_rol = id_rol;
        this.nombre_rol = nombre_rol;
        this.descripcion_rol = descripcion_rol;
        this.id_permiso = id_permiso;
    }

    public Integer getId_rol() {
        return id_rol;
    }

    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public String getDescripcion_rol() {
        return descripcion_rol;
    }

    public void setDescripcion_rol(String descripcion_rol) {
        this.descripcion_rol = descripcion_rol;
    }

    public Integer getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(Integer id_permiso) {
        this.id_permiso = id_permiso;
    }
}
