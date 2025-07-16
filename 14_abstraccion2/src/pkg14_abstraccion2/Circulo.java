package pkg14_abstraccion2;
public class Circulo extends Figura {
    //metodos
    private double radio;
    //constructor
    public Circulo(double radio) {
        super("Circulo"); //construir la superclase
        this.radio = radio;
    }
    //implementar metodos abstractos
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.radio, 2);
    }
    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*this.radio;
    }
    //metodos
    public double getRadio() {
        return this.radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
}
