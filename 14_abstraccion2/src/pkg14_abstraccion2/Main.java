/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_abstraccion2;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura f1 = new Rectangulo(4, 5); //Figura solo se puede apuntar
        //hacia una instancia de un objeto compatible (no de sus hijos)
        
        Rectangulo re1 = new Rectangulo(6, 4);
        System.out.println("Area de re1: "+re1.calcularArea());
        System.out.println("Perimetro de re1: "+re1.calcularPerimetro());
        
        Circulo c1 = new Circulo(7);
        System.out.println("Area de c1: "+c1.calcularArea());
        System.out.println("Perimetro de c1: "+c1.calcularPerimetro());
        
        TrianguloEquilatero t1 = new TrianguloEquilatero(6, 4);
        System.out.println("Area de t1: "+t1.calcularArea());
        System.out.println("Perimetro de t1: "+t1.calcularPerimetro());
        
    }
    
}
