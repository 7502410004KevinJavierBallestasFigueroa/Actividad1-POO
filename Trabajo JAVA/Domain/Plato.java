package Domain;

public class Plato {
    private String nombreDelPlato;
    private String descripcionDelPlato;

    public Plato() {
    }

    public Plato(String nombreDelPlato, String descripcionDelPlato) {
        this.nombreDelPlato = nombreDelPlato;
        this.descripcionDelPlato = descripcionDelPlato;
    }

    public String getNombreDelPlato() {
        return nombreDelPlato;
    }

    public void setNombreDelPlato(String nombreDelPlato) {
        this.nombreDelPlato = nombreDelPlato;
    }

    public String getDescripcionDelPlato() {
        return descripcionDelPlato;
    }

    public void setDescripcionDelPlato(String descripcionDelPlato) {
        this.descripcionDelPlato = descripcionDelPlato;
    }

    @Override
    public String toString() {
        return "-" + nombreDelPlato + ", descripcion:" + descripcionDelPlato;
    }
}
