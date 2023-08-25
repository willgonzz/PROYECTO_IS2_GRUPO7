package grupo7.api.beans;

public class Configuraciones {
    private Integer id_configuraciones;
    private String configuraciones;

    // Constructor
    public Configuraciones(Integer id_configuraciones, String configuraciones) {
        this.id_configuraciones = id_configuraciones;
        this.configuraciones = configuraciones;
    }

    public Integer getId_configuraciones() {
        return id_configuraciones;
    }

    public void setId_configuraciones(Integer id_configuraciones) {
        this.id_configuraciones = id_configuraciones;
    }

    public String getConfiguraciones() {
        return configuraciones;
    }

    public void setConfiguraciones(String configuraciones) {
        this.configuraciones = configuraciones;
    }
}

