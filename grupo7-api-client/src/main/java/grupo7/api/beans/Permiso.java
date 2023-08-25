package grupo7.api.beans;

public class Permiso {
    private Integer id_permiso;
    private String nombre_permiso;
    private String nivel_permiso;

    // Constructor
    public Permiso(Integer id_permiso, String nombre_permiso, String nivel_permiso) {
        this.id_permiso = id_permiso;
        this.nombre_permiso = nombre_permiso;
        this.nivel_permiso = nivel_permiso;
    }

    public Integer getId_permiso() {
        return id_permiso;
    }

    public void setId_permiso(Integer id_permiso) {
        this.id_permiso = id_permiso;
    }

    public String getNombre_permiso() {
        return nombre_permiso;
    }

    public void setNombre_permiso(String nombre_permiso) {
        this.nombre_permiso = nombre_permiso;
    }

    public String getNivel_permiso() {
        return nivel_permiso;
    }

    public void setNivel_permiso(String nivel_permiso) {
        this.nivel_permiso = nivel_permiso;
    }
}

