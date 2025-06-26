package pkg08_multiplicidad2;
public class Empresa {
    //atributos
    public String nombre;
    private Direccion direccion;
    public int telefono;
    //constructor
    public Empresa(String nombre, Direccion direccion, int telefono) {
        this.nombre = nombre;
        this.setDireccion(direccion);
        this.telefono = telefono;
    }
    //metodos
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion;
        else
            throw new IllegalArgumentException("direccion no puede ser null en Empresa");
    }
    
}
