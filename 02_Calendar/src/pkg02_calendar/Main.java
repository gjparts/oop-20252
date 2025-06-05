/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02_calendar;

/**
 *
 * @author Gerardo
 */
import java.util.Calendar;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*La Clase Calendar
        Es una clase abstracta, por lo tanto no se puede instanciar de
        forma convencional.*/
        //para instanciar un objeto Calendar:
        //cuando se instancia un Calendar de esta forma, viene con
        //la fecha y hora de la computadora
        Calendar fecha1 = Calendar.getInstance();
        //imprimir la fecha en formato norteramericano:
        System.out.println( fecha1.getTime() );
       //es posible tambien extraer datos de la fecha a traves de
       //metodos get:
        System.out.println("Año de fecha1: "+fecha1.get(Calendar.YEAR));
        //Calendar en JAVA numera los meses de 0 a 11
        System.out.println("Mes de fecha1: "+fecha1.get(Calendar.MONTH));
        System.out.println("Dia del Mes de fecha1: "+fecha1.get(Calendar.DATE));
        System.out.println("Hora de fecha1: "+fecha1.get(Calendar.HOUR));
        System.out.println("Minuto de fecha1: "+fecha1.get(Calendar.MINUTE));
        System.out.println("Segundo de fecha1: "+fecha1.get(Calendar.SECOND));
    }
}