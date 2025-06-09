/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg03_asociacion_clases;

/**
 *
 * @author Gerardo
 */
public class Chip {
    //atributos
    private Operador proveedor;
    public int numeroTelefonico;
    //constructor
    public Chip(Operador proveedor, int numeroTelefonico) {
        this.setProveedor(proveedor); //user set para asignar
        this.numeroTelefonico = numeroTelefonico;
    }
    //metodos
    public Operador getProveedor() {
        return this.proveedor;
    }
    public void setProveedor(Operador proveedor) {
        //proveedor no puede ser null (relacion por composicion)
        if( proveedor == null )
            throw new IllegalArgumentException("proveedor en Operador no puede ser null");
        else
            this.proveedor = proveedor; //se acepta
    }
}
