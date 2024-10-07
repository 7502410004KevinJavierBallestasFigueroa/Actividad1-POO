package Domain;

public class Restaurante {
    private String nombre;
    private String tipoComida;
    private String ubicacion;

    public Restaurante() {
        this.nombre = "La vida francesa";
        this.tipoComida = "Francesa";
        this.ubicacion = "Cll 11 #3-13";
    }

    public Restaurante(String nombre, String tipoComida, String ubicacion) {
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Restaurante: "+nombre+", ubicado en: "+ubicacion+", con un estilo de comida: "+tipoComida;
    }    
}