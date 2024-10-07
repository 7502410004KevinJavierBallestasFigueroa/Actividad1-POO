package Domain;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private String nombre;
    private List<Plato> platos;
    private double precio;
    
    public Menu() {
        this.nombre = "Inicial";
        this.platos = new ArrayList<>();
        this.platos.add(new Plato("Croissant", "pan con queso por dentro"));
        this.platos.add(new Plato("café", "agua caliente con café molido"));
        this.precio = 2000;
        }

    
    public Menu(String nombre, List<Plato> platos, int precio) {
        this.nombre = nombre;
        this.platos = new ArrayList<>(platos);
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Plato> getPlatos() {
        return platos;
    }
    
    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Nombre del menu: " + nombre + ", platos:" + platos +", precio: " + precio + " Pesos";
    }
}  

