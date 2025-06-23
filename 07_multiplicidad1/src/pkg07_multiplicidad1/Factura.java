package pkg07_multiplicidad1;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto[] productos; //eliminar los grupos repetitivos: Multiplicidad
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto[] productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.setProductos(productos);
    }
    //metodos
    //metodo que retorna un arreglo lleno de objetos Producto
    public Producto[] getProductos() {
        return this.productos;
    }
    
    public void setProductos(Producto[] productos) {
        if( productos != null ){
            //el arreglo de productos debe tener al menos un item
            if( productos.length > 0 ){
                //primero producto del arreglo no puede ser null
                if( productos[0] != null )
                    this.productos = productos; //se acepta
                else
                    throw new IllegalArgumentException("Primer elemento no ser permite null.");
            }
            else
                throw new IllegalArgumentException("Arreglo productos debe tener al menos un elemento");
        }
        else
            throw new IllegalArgumentException("productos en Factura no puede ser null");
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
        
        //recorrer cada item del arreglo de productos
        for( int i = 0; i < this.productos.length; i++ ){
            //ignorar cualquier item que sea null
            if( this.productos[i] != null ){
                System.out.println( this.productos[i].nombre+"\t"+this.productos[i].precioVenta );
                suma += this.productos[i].precioVenta; //sumar precio del producto al subtotal
            }
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
