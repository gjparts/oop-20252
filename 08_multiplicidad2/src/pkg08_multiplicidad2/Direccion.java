package pkg08_multiplicidad2;
public class Direccion {
    //atributos
    private Barrio colonia;
    public String calle;
    public String avenida;
    public String bloque;
    public String casa;
    //constructor
    public Direccion(Barrio colonia) {
        this.setColonia(colonia);
    }
    //metodos
    public Barrio getColonia() {
        return this.colonia;
    }
    public void setColonia(Barrio colonia) {
        if( colonia != null )
            this.colonia = colonia;
        else
            throw new IllegalArgumentException("colonia no puede ser null en Direccion");
    }
}
