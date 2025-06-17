package pkg04_asociacion_clases;
public class Direccion {
    private Barrio barrio;
    public String calle;
    public String ave;
    public String casa;
    //constructor
    public Direccion(Barrio barrio, String calle, String ave, String casa) {
        this.setBarrio(barrio);
        this.calle = calle;
        this.ave = ave;
        this.casa = casa;
    }
    //metodos
    public Barrio getBarrio() {
        return this.barrio;
    }
    public void setBarrio(Barrio barrio) {
        if( barrio == null )
            throw new IllegalArgumentException("barrio no puede ser null en Direccion");
        else
            this.barrio = barrio; //se acepta
    }
}
