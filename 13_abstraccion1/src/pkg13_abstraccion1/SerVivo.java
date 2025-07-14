package pkg13_abstraccion1;
public abstract class SerVivo {
    //atributos
    public String especie;
    //constructur
    public SerVivo(String especie) {
        this.especie = especie;
    }
    //metodos
    //metodos abstractos (prototipos de funcion)
    public abstract void hablar();
    public abstract void desplazarse();
    public abstract void alimentarse();
    public abstract void dormir();
    //metodos concretos (los que no son abstractos)
    public void vivir(){
        //en este ejemplo vivir va a ejecutar a los
        //metodos abstractos
        this.hablar();
        this.alimentarse();
        this.desplazarse();
        this.dormir();
    }
}
