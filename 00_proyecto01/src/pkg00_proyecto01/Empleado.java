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
        //para estos atributos la asignacion del valor se debe de hacer por medio de set:
        this.setEdad(edad);
        this.setGenero(genero);
        this.setSalario(salario);
        this.setContrato(contrato);
    }
    public Empleado(String nombre, int edad, char genero){
        this.nombre = nombre;
        //para estos atributos la asignacion del valor se debe de hacer por medio de set:
        this.setEdad(edad);
        this.setGenero(genero);
        this.setSalario(0.00f);
        this.setContrato('P');
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
    //metodo set: permite escribir un atributo privado
    //normalmente son void o boolean, reciben un parametro del tipo de dato del
    //atributo a escribir
    public void setEdad(int edad){
        //edad solo permite numeros >= 0
        if( edad >= 18 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("La edad debe de ser un numero >= 18");
    }
    public void setGenero(char genero){
        //genero solo admite M F X
        if( genero == 'M' || genero == 'F' || genero == 'X' )
            this.genero = genero; //se acepta
        else
            throw new IllegalArgumentException("El genero solo admite M, F, X");
    }
    public void setSalario(float salario){
        //salario solo admite numeros >= 0
        if( salario >= 0 )
            this.salario = salario;
        else
            throw new IllegalArgumentException("El salario debe de ser un numero >= 0");
    }
    public void setContrato(char contrato){
        //contrato solo admite T P
        if( contrato == 'T' || contrato == 'P' )
            this.contrato = contrato;
        else
            throw new IllegalArgumentException("El contrato solo admite T, P");
    }
}
