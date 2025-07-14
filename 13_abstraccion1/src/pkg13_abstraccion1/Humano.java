package pkg13_abstraccion1;
public class Humano extends SerVivo {
    public String nombre;
    //constructor
    public Humano(String nombre, String especie) {
        super(especie); //construir la super clase
        this.nombre = nombre;
    }
    //implementacion de metodos abstractos
    @Override
    public void hablar() {
        System.out.println("Se comunica en algun lenguaje humano.");
    }
    @Override
    public void desplazarse() {
        System.out.println("Camina de forma bipeda.");
    }
    @Override
    public void alimentarse() {
        System.out.println("Come de todo.");
    }
    @Override
    public void dormir() {
        System.out.println("Busca un lugar seguro y descansa.");
    }
}
