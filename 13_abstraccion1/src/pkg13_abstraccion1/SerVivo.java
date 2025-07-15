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
    //metodos estaticos: son aquellos que se pueden utilizar sin necesidad
    //de instanciar un objeto de esta clase. Siempre son static porque siempre
    //estan disponibles desde la ejecucion del programa.
    public static void algo(){
        System.out.println("Metodo estatico de prueba");
    }
    public static int sumar(int a, int b){
        return a+b;
    }
    //metodo de instanciacion, es un metodo que se coloca por lo general
    //en las clases abtractas y que permite instanciar un nuevo objeto
    //que sea compatible con la clase abstracta. Algo similar a lo que
    //hacian con Calendar.getInstance(). (Instanciacion estatica)
    public static SerVivo getInstance(){
        //retornar un objeto compatible con SerVivo
        return new Humano("Humano generico","Especie no determinada");
    }
}
