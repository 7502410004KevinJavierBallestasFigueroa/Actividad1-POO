package Domain;

public class Cheff {
    private String nombre;
    private String apellido;
    private String especialidad;
    private int experiencia;

    public Cheff() {
        this.nombre = "Luis";
        this.apellido = "Rodriguez";
        this.especialidad = "Comida francesa";   
        this.experiencia = 2;
    }

    public Cheff (String nombre, String apellido, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Chef: " + nombre + " "+ apellido +", especialidad: " + especialidad + ", experiencia: " + experiencia;
    }
}
