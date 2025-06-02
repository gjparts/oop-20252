/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg00_proyecto01;

/**
 *
 * @author Gerardo
 */
public class Estudiante {
    //atributos
    private String nombre;
    private String cuenta;
    private String dni;
    private int edad;
    private char genero;
    private float promedio;
    private String carrera;
    //constructor
    public Estudiante(String nombre, String cuenta, String dni, int edad, char genero, float promedio, String carrera){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.dni = dni;
        this.edad = edad;
        this.genero = genero;
        this.promedio = promedio;
        this.carrera = carrera;
    }
    //metodos
    public void imprimir(){
        System.out.println("********** Perfil de Empleado **********");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Cuenta: "+this.cuenta);
        System.out.println("DNI: "+this.dni);
        System.out.println("Edad: "+this.edad);
        System.out.println("Genero: "+this.genero);
        System.out.println("Promedio: "+this.promedio);
        System.out.println("Carrera: "+this.carrera);
    }
    //metodos get
    public String getNombre(){
        return this.nombre;
    }
    public String getCuenta(){
        return this.cuenta;
    }
    public String getDni(){
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    public char getGenero(){
        return this.genero;
    }
    public float getPromedio(){
        return this.promedio;
    }
    public String getCarrera(){
        return this.carrera;
    }
    //metodos set
    public void setNombre(String nombre){
        //nombre solo adminte String de al menos 5 caracteres
        if( nombre.trim().length() >= 5 )
            this.nombre = nombre; //se acepta
        else
            throw new IllegalArgumentException("Nombre deber ser de al menos 5 caracteres.");
    }
    public void setCuenta(String cuenta){
        //cuenta debe ser de 11 caracteres
        if( cuenta.trim().length() == 11 )
            this.cuenta = cuenta; //se acepta
        else
            throw new IllegalArgumentException("Cuenta debe ser de 11 caracteres.");
    }
    public void setDni(String dni){
        //dni debe ser de 13 caracteres
        if( dni.trim().length() == 13 )
            this.dni = dni; //se acepta
        else
            throw new IllegalArgumentException("DNI debe ser de 13 caracteres.");
    }
    public void setEdad(int edad){
        //edad debe ser >= 12
        if( edad >= 12 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("Edad debe ser >= 12");
    }
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'X' )
            this.genero = genero; //se acepta
        else
            throw new IllegalArgumentException("Genero solo admite un caracter: M F X");
    }
    public void setCarrera(String carrera){
        //carrera solo admite String de al menos 10 caracteres
        if( carrera.trim().length() >= 10 )
            this.carrera = carrera; //se acepta
        else
            throw new IllegalArgumentException("Carrera deber ser de al menos 10 caracteres.");
    }
    public void setPromedio(float promedio){
        //promedio debe ser un numero >=0 y <= 100
        if( promedio >= 0 && promedio <= 100 )
            this.promedio = promedio; //se acepta
        else
            throw new IllegalArgumentException("Promedio debe estar entre 0 y 100");
    }
}
