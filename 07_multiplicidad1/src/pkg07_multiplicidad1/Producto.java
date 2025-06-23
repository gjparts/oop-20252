package pkg07_multiplicidad1;
public class Producto {
    //atributos
    public String nombre;
    private CategoriaProducto categoria;
    public float precioVenta;
    //constructor
    public Producto(String nombre, CategoriaProducto categoria, float precioVenta) {
        this.nombre = nombre;
        this.setCategoria(categoria);
        this.precioVenta = precioVenta;
    }
    //metodos
    public CategoriaProducto getCategoria() {
        return this.categoria;
    }
    public void setCategoria(CategoriaProducto categoria) {
        if( categoria != null )
            this.categoria = categoria; //se acepta
        else
            throw new IllegalArgumentException("categoria en Producto no puede ser null");
    }
    
}
