package pkg05_asociacion_clases;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto producto1;
    public Producto producto2;
    public Producto producto3;
    public Producto producto4;
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto producto1) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.setProducto1(producto1);
    }
    //metodos
    public Producto getProducto1() {
        return this.producto1;
    }
    public Producto getProducto2() {
        return this.producto2;
    }
    public Producto getProducto3() {
        return this.producto3;
    }
    public Producto getProducto4() {
        return this.producto4;
    }
    public void setProducto1(Producto producto1) {
        if( producto1 != null )
            this.producto1 = producto1; //se acepta
        else
            throw new IllegalArgumentException("producto1 en Factura no puede ser null");
    }
    public void imprimir(){
        System.out.println("----------- FACTURA -----------");
        System.out.println("Numero: "+this.numero);
        //fecha si llegara a ser null puede crashear el programa
        //asi que, se ignora en caso de ser null
        if( this.fecha != null ){
            System.out.print("Fecha: ");
            SimpleDateFormat formato = new SimpleDateFormat("YYYY/MM/dd");
            System.out.println( formato.format( this.fecha.getTime() ) );
        }
        //si cliente es null no se imprime rtn ni nombre, sino consumidor final
        if( this.cliente == null )
            System.out.println("Cliente: Consumidor Final");
        else{
            System.out.println("Cliente: "+this.cliente.nombre);
            System.out.println("RTN: "+this.cliente.rtn);
        }
        //suma y presentacion de productos
        float suma = 0;
        System.out.println("Producto\tPrecio");
        
        //producto1 no puede ser null gracias al metodo set
        System.out.println( this.producto1.nombre+"\t"+this.producto1.precioVenta );
        suma += this.producto1.precioVenta; //sumar precio del producto1
        
        //producto2, producto3 y producto4 pueden llegar a ser null, solo los
        //consideramos si son diferentes de null
        if( this.producto2 != null ){
            System.out.println( this.producto2.nombre+"\t"+this.producto2.precioVenta );
            suma += this.producto2.precioVenta; //sumar precio del producto2
        }
        if( this.producto3 != null ){
            System.out.println( this.producto3.nombre+"\t"+this.producto3.precioVenta );
            suma += this.producto3.precioVenta; //sumar precio del producto3
        }
        if( this.producto4 != null ){
            System.out.println( this.producto4.nombre+"\t"+this.producto4.precioVenta );
            suma += this.producto4.precioVenta; //sumar precio del producto4
        }
        //resultado
        DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2);
        f.setMinimumFractionDigits(2);
        
        System.out.println("\nSubtotal: "+f.format(suma) );
        System.out.println("ISV 15%: "+f.format(suma*0.15f));
        System.out.println("Total: "+f.format(suma*1.15f));
    }
}
