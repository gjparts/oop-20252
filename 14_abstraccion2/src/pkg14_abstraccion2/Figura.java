package pkg14_abstraccion2;
public abstract class Figura {
    //atributo
    private String nombre;
    //constructor
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    //metodos abstractos
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    //metodos concretos
    public String getNombre() {
        return this.nombre;
    }
}
