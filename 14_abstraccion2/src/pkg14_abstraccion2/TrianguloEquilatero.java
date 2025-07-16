package pkg14_abstraccion2;
public class TrianguloEquilatero extends Figura {
    //atributos
    private double altura;
    private double base;
    //constructor
    public TrianguloEquilatero(double altura, double base) {
        super("Triángulo Equilatero");
        this.altura = altura;
        this.base = base;
    }
    //implementar metodos abstractos
    @Override
    public double calcularArea() {
        return (1.0/2.0)*this.base*this.altura;
    }
    @Override
    public double calcularPerimetro() {
        return 3*this.base;
    }
    //metodos
    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getBase() {
        return this.base;
    }
    public void setBase(double base) {
        this.base = base;
    }
}
