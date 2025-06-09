/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_asociacion_clases;

/**
 *
 * @author Gerardo
 */
public class Bateria {
    private Fabricante marca;
    public float miliamperios;
    /*observe que en el diagrama la asocacion entre Bateria
    y Fabricante es por composicion, por lo tanto en algun
    momento nos debemos asegurar que marca no vaya a quedar
    sin asignar o sea sin memoria (null). Esto lo podemos
    hacer ya sea desde el constructor o desde un metodo set*/
    //constructor
    public Bateria(Fabricante marca, float miliamperios) {
        this.setMarca(marca);
        this.miliamperios = miliamperios;
    }
    //metodos
    public Fabricante getMarca() {
        return this.marca;
    }
    public void setMarca(Fabricante marca) {
        //impedir que la marca sea un valor null (relacion por composicion)
        if( marca == null )
            throw new IllegalArgumentException("marca de Bateria no debe ser null");
        else
            this.marca = marca; //se acepta
    }
}
