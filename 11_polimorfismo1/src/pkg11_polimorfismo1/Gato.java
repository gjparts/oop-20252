package pkg11_polimorfismo1;
public class Gato extends Animal {
    //atributos
    public String apodo;
    private boolean tienePelaje;
    //constructor
    public Gato(String apodo, boolean tienePelaje, boolean tieneCola) {
        //construir la super clase
        super("Gato", "Felino", 4, tieneCola);
        //inicializar atributos de esta clase
        this.apodo = apodo;
        this.tienePelaje = tienePelaje;
    }
    //metodos
    public void ronronear(){
        System.out.println("prrrrrrrrrrr");
    }
    //Polimorfismo: cambiar la respuesta para un metodo heredado
    @Override //(anular, reemplazar) metodo debe tener la misma firma que en la clase Padre
    public void hablar(){
        //Override completo: no se reutiliza nada del metodo heredado
        //cambiando por completo lo que hace
        System.out.println("Miau");
    }
    @Override
    public void imprimir(){
        //Override parcial: se reutiliza el metodo heredado y se le agrega mejoras
        super.imprimir(); //mandar a llamar el metodo heredado
        //ejecutar las mejoras
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Tiene pelaje: "+( this.tienePelaje ? "Si" : "No" ));
    }
    //tambien puede hacer Override a un metodo que viene desde Object
    @Override
    public String toString(){
        return "Soy un gato.";
    }
}
