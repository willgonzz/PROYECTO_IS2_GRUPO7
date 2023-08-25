package grupo7.api.beans;

import java.util.List;

public class HistorialContenido {
    private Integer id_historial_contenido;
    private List<Contenido> versiones_contenido;

    // Constructor
    public HistorialContenido(Integer id_historial_contenido, List<Contenido> versiones_contenido) {
        this.id_historial_contenido = id_historial_contenido;
        this.versiones_contenido = versiones_contenido;
    }

    public Integer getId_historial_contenido() {
        return id_historial_contenido;
    }

    public void setId_historial_contenido(Integer id_historial_contenido) {
        this.id_historial_contenido = id_historial_contenido;
    }

    public List<Contenido> getVersiones_contenido() {
        return versiones_contenido;
    }

    public void setVersiones_contenido(List<Contenido> versiones_contenido) {
        this.versiones_contenido = versiones_contenido;
    }
}

