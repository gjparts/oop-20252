package pkg09_herencia1;
public class Empleado extends Persona {
    //atributos
    public float salario;
    public String cargo;
    //constructor
    public Empleado(){
        //la clase hijo puede tener constructor sin parametros
        //aunque la clase padre tenga constr. con parametros
        //lo que se hace en estos casos es construir la
        //la super clase usando valores predeterminados:
        super("No tiene", 0, 'X');
        //inicializar los atributos de la clase hijo
        this.salario = 0.00f;
        this.cargo = "No definido";
    }
    public Empleado(String nombre, int edad, char genero, float salario, String cargo){
        //tambien se puede tener constructor con parametros
        //construir la super clase
        super(nombre, edad, genero);
        //inicializar los atributos de la clase hijo
        this.salario = salario;
        this.cargo = cargo;
    }
    //metodos
    public void trabajar(){
        System.out.println("Estoy trabajando en el cargo de "+this.cargo);
        System.out.println("Mi edad es: "+this.edad);
    }
}
