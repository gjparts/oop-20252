package pkg00_proyecto01;

/**
 * Describe a un empleado
 * @author Gerardo Portillo
 * @since 2025-05-27
 */
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private float salario;
    private char contrato;
    //constructores
    public Empleado(String nombre, int edad, char genero, float salario, char contrato){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.contrato = contrato;
    }
    public Empleado(String nombre, int edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = 0.00f;
        this.contrato = 'P';
    }
    //metodos
    public void imprimir(){
        System.out.println("********** Perfil de Empleado **********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Genero: "+this.genero);
        System.out.println("Salario: "+this.salario);
        System.out.println("Contrato: "+this.contrato);
    }
    //metodo get: permite leer un atributo privado
    //todo metodo get debe de ser del mismo tipo del atributo a leer:
    public int getEdad(){
        return this.edad;
    }
    public char getGenero(){
        return this.genero;
    }
    public float getSalario(){
        return this.salario;
    }
    public char getContrato(){
        return this.contrato;
    }
}
