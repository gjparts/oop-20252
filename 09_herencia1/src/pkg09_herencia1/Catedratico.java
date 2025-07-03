package pkg09_herencia1;

public class Catedratico extends Empleado {
    //atributos
    public String profesion;
    //constructor

    public Catedratico(String profesion, String nombre, int edad, char genero, float salario) {
        //consturir la super clase:
        super(nombre, edad, genero, salario, "Docente");
        //inicializar los atributos de esta clase
        this.profesion = profesion;
    }
    //metodos
    public void educar(){
        System.out.println("Estoy dando clases de "+this.profesion);
    }
}
