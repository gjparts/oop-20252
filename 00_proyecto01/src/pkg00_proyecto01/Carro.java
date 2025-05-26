package pkg00_proyecto01;

/**
 * Clase que describe a un vehiculo
 * @author Gerardo Portillo
 * @since 2025-05-26
 */
public class Carro {
    //atributos
    public String marca;
    public String modelo;
    public String color;
    public int anio;
    //constructores
    /**
     * Construye un objeto de Clase Carro inicializado con valores predeterminados
     */
    public Carro(){
        //sin parametros
        this.marca = "No definido";
        this.modelo = "No definido";
        this.color = "No definido";
        this.anio = 0;
    }
    /**
     * Construye un objeto de Clase Carro
     * @param marca la marca del vehiculo (Toyota, Ford, etc.)
     * @param modelo el modelo del vehiculo (Corolla, Explorer, etc.)
     * @param color el color del vehiculo
     * @param anio el año del vehiculo
     */
    public Carro(String marca, String modelo, String color, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }
    //metodos
    /**
     * Imprime una ficha con informacion del vehiculo
     */
    public void imprimir(){
        System.out.println("********** CARRO **********");
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Color: "+this.color);
        System.out.println("Año: "+this.anio);
    }
}
