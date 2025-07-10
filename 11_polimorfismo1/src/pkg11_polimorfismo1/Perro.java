package pkg11_polimorfismo1;
public class Perro extends Animal {
    //atributos
    public String apodo;
    private String raza;
    //constructor
    public Perro(String apodo, String raza, boolean tieneCola) {
        //construir la super clase
        super("Perro", "Canino", 4, tieneCola);
        //inicializar los atributos de esta clase
        this.apodo = apodo;
        this.raza = raza;
    }
    //metodos
    public void jugar(){
        System.out.println("El perro corre en ciruclos y persigue su propia cola");
    }
    @Override
    public void hablar() {
        //Override completo:
        System.out.println("guau wof bark");
    }
    @Override
    public void imprimir() {
        //Override parcial:
        super.imprimir(); //ejecutar el metodo de la super clase
        //codigo a agregar
        System.out.println("Apodo: "+this.apodo);
        System.out.println("Raza: "+this.raza);
    }
    //tambien puede hacer Override a un metodo que viene desde Object
    @Override
    public String toString(){
        return "Solo soy un perro y me llamo "+this.apodo;
    }
}
