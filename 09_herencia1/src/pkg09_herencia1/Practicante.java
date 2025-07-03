package pkg09_herencia1;
public class Practicante extends Empleado {
    //atributos
    public int meses;
    //constructor
    public Practicante(int meses, String nombre, int edad, char genero, float salario) {
        //construir la super clase
        super(nombre, edad, genero, salario, "Practicante/Pasante");
        //inicializar atributos de esta clase
        this.meses = meses;
    }
}
