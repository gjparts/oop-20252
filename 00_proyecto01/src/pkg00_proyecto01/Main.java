/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00_proyecto01;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia un objeto de clase Mascota
        Mascota ma1 = new Mascota();
        System.out.println("Valores en los atributos de ma1:");
        System.out.println("Direccion de memoria: "+ma1);
        System.out.println("nombre: "+ma1.nombre);
        System.out.println("especie: "+ma1.especie);
        System.out.println("edad: "+ma1.edad);
        System.out.println("genero: "+ma1.genero);
        
        Mascota ma2 = new Mascota();
        //colocar valores a los atributos de ma2:
        ma2.nombre = "Chispita";
        ma2.especie = "Gato";
        ma2.edad = 2;
        ma2.genero = 'H';
        System.out.println("Valores en los atributos de ma2:");
        System.out.println("Direccion de memoria: "+ma2);
        System.out.println("nombre: "+ma2.nombre);
        System.out.println("especie: "+ma2.especie);
        System.out.println("edad: "+ma2.edad);
        System.out.println("genero: "+ma2.genero);
        
        Persona per1 = new Persona();
        System.out.println("Valores en los atributos de per1:");
        per1.imprimir();
        System.out.println("per1 es mayor de edad? "+per1.esMayorDeEdad());
        
        Persona per2 = new Persona("Gerardo", 42, 'M', "1401198201055");
        System.out.println("Valores en los atributos de per2:");
        per2.imprimir();
        System.out.println("per2 es mayor de edad? "+per2.esMayorDeEdad());
        
        Carro car1 = new Carro();
        car1.imprimir();
        
        Carro car2 = new Carro("Honda", "Civic", "Negro", 2004);
        car2.imprimir();
        
    }
    
}
