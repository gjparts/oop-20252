package pkg05_asociacion_clases;
import java.util.Calendar;
public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Gerardo Portillo", "1111", 12345, "");
        Cliente c2 = new Cliente("Josue Portillo", "1234", 7777, "");
        
        CategoriaProducto ca1 = new CategoriaProducto("Bebidas", "23");
        CategoriaProducto ca2 = new CategoriaProducto("Verduras y Frutas", "1");
        CategoriaProducto ca3 = new CategoriaProducto("Dulces y Churros", "8");
        
        Producto p1 = new Producto("Coca Cola 3L", ca1, 65);
        Producto p2 = new Producto("Tomate LB", ca2, 15);
        Producto p3 = new Producto("Papa LB", ca2, 25);
        Producto p4 = new Producto("Zambo Picante Grande", ca3, 45);
        Producto p5 = new Producto("Rica Sula Pequeño", ca3, 8);
        
        Factura f1 = new Factura(1, Calendar.getInstance(), c1, p1);
        f1.imprimir();
        
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2025, 2, 13);
        Factura f2 = new Factura(2, fecha1, null, p2);
        f2.producto2 = p5;
        f2.producto3 = p3;
        f2.producto4 = p3;
        f2.imprimir();
        
        Factura f3 = new Factura(3, null, c1, p4);
        f3.producto4 = p2;
        f3.imprimir();
    }    
}
