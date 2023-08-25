package grupo7.api.beans;

public class CategoriaContenido {
    private Integer id_categoria;
    private String nombre_categoria;
    private String cod_categoria;
    private String descripcion_categoria;

    // Constructor
    public CategoriaContenido(Integer id_categoria, String nombre_categoria, String cod_categoria, String descripcion_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.cod_categoria = cod_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(String cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }
}
