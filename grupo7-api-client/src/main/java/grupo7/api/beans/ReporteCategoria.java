package grupo7.api.beans;

import java.util.List;

public class ReporteCategoria {
    private String id_reporte_categoria;
    private List<CategoriaContenido> reporte_categoria;

    // Constructor
    public ReporteCategoria(String id_reporte_categoria, List<CategoriaContenido> reporte_categoria) {
        this.id_reporte_categoria = id_reporte_categoria;
        this.reporte_categoria = reporte_categoria;
    }

    public String getId_reporte_categoria() {
        return id_reporte_categoria;
    }

    public void setId_reporte_categoria(String id_reporte_categoria) {
        this.id_reporte_categoria = id_reporte_categoria;
    }

    public List<CategoriaContenido> getReporte_categoria() {
        return reporte_categoria;
    }

    public void setReporte_categoria(List<CategoriaContenido> reporte_categoria) {
        this.reporte_categoria = reporte_categoria;
    }
}

