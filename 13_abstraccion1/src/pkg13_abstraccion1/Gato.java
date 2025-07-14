package pkg13_abstraccion1;
public class Gato extends SerVivo {
    //atributos
    public String apodo;
    //constructor
    public Gato(String apodo, String especie) {
        super(especie); //construir la super clase
        this.apodo = apodo;
    }
    //metodos
    //implementacion de metodos abstractos
    @Override
    public void dormir() {
        System.out.println("Busca donde esconderse y se duerme.");
    }
    @Override
    public void alimentarse() {
        System.out.println("Come alimentos gatunos.");
    }
    @Override
    public void hablar() {
        System.out.println("Dice miau.");
    }
    @Override
    public void desplazarse() {
        System.out.println("Camina sigiloso.");
    }
}
