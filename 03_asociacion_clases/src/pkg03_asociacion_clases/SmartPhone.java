package pkg03_asociacion_clases;
public class SmartPhone {
    //atributos
    private Fabricante marca;
    private String modelo;
    private int almacenamiento;
    private int ram;
    private Bateria bateria;
    public Chip chip1;
    public Chip chip2;
    //constructor
    public SmartPhone(Fabricante marca, String modelo, int almacenamiento,
            int ram, Bateria bateria, Chip chip1, Chip chip2) {
        //tambien puede evitar hacer un metodo set y solo valida
        //que por el constructor marca no venga null.
        //esto se hace cuando Usted quiere que algo solo defina una unica
        //vez por el constructor y que no se pueda cambiar nunca mas.
        if( marca == null )
            throw new IllegalArgumentException("marca no puede ser null en SmartPhone");
        else
            this.marca = marca; //se acepta
        
        //modelo, almacenamiento y ram son private y solo se van a enviar
        //una sola vez al momento de construir el objeto, por eso no haremos
        //metodos set para ellos; pero si haremos metodos get para que sea
        //posible consultarlos desde afuera.
        this.modelo = modelo;
        this.almacenamiento = almacenamiento;
        this.ram = ram;
        
        //la bateria es un elemento reemplazable, podemos hacerle su metodo set
        //para cuando se quiera cambiar.
        this.setBateria(bateria);
        
        //chip1 y chip2 tienen una relacion por agregacion, o sea que no son
        //obligatorios de llenar y se permite que vengan null
        this.chip1 = chip1;
        this.chip2 = chip2;
    }
    //metodos
    public Fabricante getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAlmacenamiento() {
        return this.almacenamiento;
    }
    public int getRam() {
        return this.ram;
    }
    public Bateria getBateria() {
        return this.bateria;
    }
    //bateria reemplazable
    public void setBateria(Bateria bateria) {
        if( bateria == null )
            throw new IllegalArgumentException("bateria no puede ser null en SmartPhone");
        else
            this.bateria = bateria; //se acepta
    }
    public void imprimir(){
        System.out.println("************* Ficha de SmartPhone *************");
        System.out.println("Fabricante: "+this.marca.nombre);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Almacenamiento: "+this.almacenamiento+" GB");
        System.out.println("RAM: "+this.ram+" GB");
        //la bateria nos hemos asegurado que no permita null en ningun
        //momento (constructor y metodo set) por lo tante la podemos
        //imprimir sin necesidad de validarla.
        System.out.println("Datos de la barteria:");
        System.out.println("\tMarca: "+this.bateria.getMarca().nombre);
        System.out.println("\tMiliamperios: "+this.bateria.miliamperios);
        //lo siguiente es imprimir los chip o simcard
        //chip1 y chip2 tienen una relacion por agregacion con la clase Chip
        //con publicos y por lo tanto pueden venir null ya que no hicimos
        //ninguna validacion para evitarlo.
        //Entonces si chip1 o chip2 llegaran a venir null debemos ignorarlo.
        if( this.chip1 != null ){
            //si chip1 es distinto de null pues lo imprimimos
            System.out.println("Chip 1: ");
            System.out.println("\tOperador: "+this.chip1.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip1.numeroTelefonico);
        }
        if( this.chip2 != null ){
            //si chip2 es distinto de null pues lo imprimimos
            System.out.println("Chip 2: ");
            System.out.println("\tOperador: "+this.chip2.getProveedor().nombre);
            System.out.println("\tNumero: "+this.chip2.numeroTelefonico);
        }
    }
}
