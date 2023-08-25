package grupo7.api.beans;

public class Notificacion {
    private Integer id_notificacion;
    private String contenido_notificacion;

    // Constructor
    public Notificacion(Integer id_notificacion, String contenido_notificacion) {
        this.id_notificacion = id_notificacion;
        this.contenido_notificacion = contenido_notificacion;
    }

    public Integer getId_notificacion() {
        return id_notificacion;
    }

    public void setId_notificacion(Integer id_notificacion) {
        this.id_notificacion = id_notificacion;
    }

    public String getContenido_notificacion() {
        return contenido_notificacion;
    }

    public void setContenido_notificacion(String contenido_notificacion) {
        this.contenido_notificacion = contenido_notificacion;
    }
}

