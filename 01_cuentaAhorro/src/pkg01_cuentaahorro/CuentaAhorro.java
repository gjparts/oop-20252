/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg01_cuentaahorro;

/**
 * Defune una cuenta de ahorro
 * @author Gerardo Portillo
 */
public class CuentaAhorro {
    //atriutos
    public String nombreCliente;
    public String numeroCuenta;
    private float saldo;
    //constructor
    /**
     * Construye un nuevo objeto de cuenta de ahorro
     * @param nombreCliente el nombre del dueño de la cuenta
     * @param numeroCuenta  el numero de cuenta asignado
     */
    public CuentaAhorro(String nombreCliente, String numeroCuenta){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.00f;
    }
    //metodos
    /**
     * Devuelve el saldo actual disponible en la cuenta de ahorro
     * @return un numero float
     */
    public float getSaldo(){
        return this.saldo;
    }
    /**
     * Deposita un monto determinado en la cuenta de ahorro
     * @param monto el monto a sumar, no puede ser negativo.
     */
    public void depositar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("monto a depositar no puede ser negativo.");
        else
            this.saldo += monto;    //se acepta
    }
    /**
     * Retira un monto determinado de la cuenta de ahorro
     * @param monto el monto a restar, no puede ser negativo ni superar al saldo actual
     */
    public void retirar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("monto a retirar no puede ser negativo");
        else
            if( monto > this.saldo )
                throw new IllegalArgumentException("monto a retirar no debe superar al saldo actual");
            else
                this.saldo -= monto;  //se acepta
    }
}
