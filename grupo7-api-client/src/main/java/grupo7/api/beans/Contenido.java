package grupo7.api.beans;

import java.util.Date;

public class Contenido {
    private Integer id_contenido;
    private String titulo_contenido;
    private String cod_contenido;
    private Date fecha_creacion;
    private String descripcion_contenido;
    private String informacion_contenido;
    private Date fecha_vigencia;
    private String tipo_contenido;
    private String estado;

    // Constructor
    public Contenido(Integer id_contenido, String titulo_contenido, String cod_contenido, Date fecha_creacion,
                     String descripcion_contenido, String informacion_contenido, Date fecha_vigencia,
                     String tipo_contenido, String estado) {
        this.id_contenido = id_contenido;
        this.titulo_contenido = titulo_contenido;
        this.cod_contenido = cod_contenido;
        this.fecha_creacion = fecha_creacion;
        this.descripcion_contenido = descripcion_contenido;
        this.informacion_contenido = informacion_contenido;
        this.fecha_vigencia = fecha_vigencia;
        this.tipo_contenido = tipo_contenido;
        this.estado = estado;
    }

    public Integer getId_contenido() {
        return id_contenido;
    }

    public void setId_contenido(Integer id_contenido) {
        this.id_contenido = id_contenido;
    }

    public String getTitulo_contenido() {
        return titulo_contenido;
    }

    public void setTitulo_contenido(String titulo_contenido) {
        this.titulo_contenido = titulo_contenido;
    }

    public String getCod_contenido() {
        return cod_contenido;
    }

    public void setCod_contenido(String cod_contenido) {
        this.cod_contenido = cod_contenido;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getDescripcion_contenido() {
        return descripcion_contenido;
    }

    public void setDescripcion_contenido(String descripcion_contenido) {
        this.descripcion_contenido = descripcion_contenido;
    }

    public String getInformacion_contenido() {
        return informacion_contenido;
    }

    public void setInformacion_contenido(String informacion_contenido) {
        this.informacion_contenido = informacion_contenido;
    }

    public Date getFecha_vigencia() {
        return fecha_vigencia;
    }

    public void setFecha_vigencia(Date fecha_vigencia) {
        this.fecha_vigencia = fecha_vigencia;
    }

    public String getTipo_contenido() {
        return tipo_contenido;
    }

    public void setTipo_contenido(String tipo_contenido) {
        this.tipo_contenido = tipo_contenido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
