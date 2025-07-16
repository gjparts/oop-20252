package pkg14_abstraccion2;
public class Rectangulo extends Figura {
    //atributos
    private double largo;
    private double ancho;
    //constructor
    public Rectangulo(double largo, double ancho) {
        super("Rectangulo"); //construir la super clase
        //porque no aplique los set aqui?
        //cuando no hay reglas en los set no es necesario.
        this.largo = largo;
        this.ancho = ancho;
    }
    //implementar metodos abstractos
    @Override
    public double calcularArea() {
        return this.largo*this.ancho;
    }
    @Override
    public double calcularPerimetro() {
        return 2*this.largo+2*this.ancho;
    }
    //metodos
    public double getLargo() {
        return this.largo;
    }
    public double getAncho() {
        return this.ancho;
    }
    public void setLargo(double largo) {
        this.largo = largo;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
