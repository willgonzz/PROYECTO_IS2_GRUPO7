package grupo7.api.beans;

public class Comentario {
    private Integer id_comentario;
    private String contenido_comentario;

    // Constructor
    public Comentario(Integer id_comentario, String contenido_comentario) {
        this.id_comentario = id_comentario;
        this.contenido_comentario = contenido_comentario;
    }

    public Integer getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(Integer id_comentario) {
        this.id_comentario = id_comentario;
    }

    public String getContenido_comentario() {
        return contenido_comentario;
    }

    public void setContenido_comentario(String contenido_comentario) {
        this.contenido_comentario = contenido_comentario;
    }
}

