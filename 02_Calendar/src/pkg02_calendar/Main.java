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
import java.text.SimpleDateFormat;
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
        //si desea aplicar un formato personalizado a la fecha para imprimir
        //puede utilizar un objeto de clase SimpleDateFormat:
        SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss aa");
        System.out.println("fecha1: "+f.format(fecha1.getTime()));
        /*La mascara de entrada para la fecha puede llevar los siguientes
        caracteres:
        YYYY    año a 4 digitos
        YY      año a 2 digitos
        MM      mes a 2 digitos
        M       mes sin formato
        MMM     nombre del mes abreviado
        MMMM    nombre del mes completo
        d       dia sin formato
        dd      dia a dos digitos
        HH      hora a dos digitos en formato de 24 horas
        hh      hora a dos digitos en formato de 12 horas
        mm      minuto a dos digitos
        ss      segundo a dos digitos
        aa      indicador de meridiano AM/PM*/
        //Calendar tiene un metodo set para establecer la fecha o la hora
        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1982,9,15,7,30,15); //colocar una fecha y hora fijos
        System.out.println("fecha2: "+f.format( fecha2.getTime() ) );
        
        //el metodo set tambien puede cambiar solo un campo de la fecha
        //por ejemplo, para fecha2 voy a cambiarle la hora a las 17
        fecha2.set( Calendar.HOUR, 17);
        System.out.println("fecha2: "+f.format( fecha2.getTime() ) );
        
        //Calendar permite hacer operaciones adirmeticas con fechas
        Calendar fecha3 = Calendar.getInstance();
        //voy a sumar 15 dias a la fecha actual
        fecha3.add(Calendar.DATE, 15);
        System.out.println("fecha3: "+f.format( fecha3.getTime() ) );
        //voy a sumar 5 meses a fecha3
        fecha3.add(Calendar.MONTH, 5);
        System.out.println("fecha3: "+f.format( fecha3.getTime() ) );
        //para restar solo coloque el valor entero en negativo:
        //voy a restar 2 años a fecha3:
        fecha3.add(Calendar.YEAR, -2);
        System.out.println("fecha3: "+f.format( fecha3.getTime() ) );
    }
}