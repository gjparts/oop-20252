/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg00_proyecto01;

/**
 *
 * @author Gerardo
 */
public class Persona {
    //atributos
    public String nombre;
    public int edad;
    public char genero;
    public String dni;
    //constructores
    /*Constructor
    Es un metodo que permite asignar memoria a un objeto que se crea
    a partir de una Clase.
    -> Si no se define ningun constructor en una Clase; entonces JAVA
       les crea automaticamente un constructor sin parametros.
    Caracteristicas de un constructor:
    -> son publicos (al menos en JAVA)
    -> en JAVA se deben de llamar igual que la clase
    -> no tienen tipo de dato puesto que devuelven una direccion de memoria
    -> normalmente se utilizan para dar valores de inicio o predeterminados
       a los atributos de la Clase; pero tambien se pueden usar para
       ejecutar otras tareas de inicio dependiendo de lo que Usted necesite.
    -> en JAVA una Clase puede tener mas de un constructor siempre y cuando
       tengan diferente firma (sobrecarga de metodos)*/
    public Persona(){
        //constructor sin parametros
        this.nombre = "no tiene";
        this.edad = 0;
        this.genero = 'X';
        this.dni = "no tiene";
    }
    public Persona(String nombre, int edad, char genero, String dni){
        //constructor con todos los parametros
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.dni = dni;
    }
    public Persona(String nombre, int edad){
        //constructor con dos parametros
        this.nombre = nombre;
        this.edad = edad;
        this.genero = 'X';
        this.dni = "no tiene";
    }
    //metodos
    public void imprimir(){
        System.out.println("********* Perfil de Persona *********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad+" años.");
        System.out.println("Genero: "+this.getGeneroDescripcion());
        System.out.println("DNI: "+this.dni);
    }
    public boolean esMayorDeEdad(){
        if( this.edad > 18 )
            return true;
        else
            return false;
    }
    public String getGeneroDescripcion(){
        if( this.genero == 'M' ) return "Masculino";
        if( this.genero == 'F' ) return "Femenino";
        if( this.genero == 'X' ) return "Otros";
        return "Sin configurar en el programa";
    }
}

