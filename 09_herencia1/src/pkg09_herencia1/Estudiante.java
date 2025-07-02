package pkg09_herencia1;
public class Estudiante extends Persona {
    //atributos
    public String cuenta;
    public String carrera;
    //constructor
    public Estudiante(String nombre, int edad, char genero, String cuenta, String carrera){
        //construir la super clase (clase Padre)
        //desde esta clase hija hay que construir una instancia de la clase padre
        super(nombre, edad, genero);
        //inicializar los atributos de la clase hijo
        this.cuenta = cuenta;
        this.carrera = carrera;
    }
    //metodos
    public void estudiar(){
        System.out.println("Soy estudiante de "+this.carrera+" y mi edad es "+this.edad);
    }
}
