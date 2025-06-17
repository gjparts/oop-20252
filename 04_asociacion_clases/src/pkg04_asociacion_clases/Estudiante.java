package pkg04_asociacion_clases;
public class Estudiante {
    //atributos
    public String cuenta;
    public String nombre;
    public String carrera;
    private int edad;
    private Direccion direccion;
    public Cargo trabajo;
    //constructor
    public Estudiante(String cuenta, String nombre, String carrera, int edad, Direccion direccion, Cargo trabajo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.setEdad(edad);
        this.setDireccion(direccion);
        this.trabajo = trabajo;
    }
    public int getEdad() {
        return this.edad;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void setEdad(int edad) {
        if( edad >= 0 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("edad en Estudiante debe ser >= 0");
    }
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion; //se acepta
        else
            throw new IllegalArgumentException("direccion en Estudiante no puede ser null");
    }
    public void imprimir(){
        System.out.println("***** Perfil del Estudiante *****");
        System.out.println("Cuenta: "+this.cuenta);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Edad: "+this.edad);
        //la direccion y su barrio no puede ser null gracias al metodo set
        //por lo tanto no es necesario validarla a la hora de imprimir
        System.out.println("Direccion:");
        System.out.println("\tBarrio: "+this.direccion.getBarrio().nombre);
        System.out.println("\tCalle: "+this.direccion.calle);
        System.out.println("\tAvenida: "+this.direccion.ave);
        System.out.println("\tCasa: "+this.direccion.casa);
        System.out.println("\tCiudad: "+this.direccion.getBarrio().ciudad);
        System.out.println("\tMunicipio: "+this.direccion.getBarrio().municipio);
        System.out.println("\tPais: "+this.direccion.getBarrio().pais);
        //trabajo se relaciona por agregacion con Cargo
        //por lo tanto puede venir null, si asi fuere se ignora
        if( this.trabajo != null ){
            System.out.println("Informacion sobre lugar trabajo:");
            System.out.println("\tEmpresa: "+this.trabajo.getEmpresa().nombre);
            System.out.println("\tCargo: "+this.trabajo.descripcion);
            System.out.println("\tCiudad: "+this.trabajo.getEmpresa().getDireccion().getBarrio().ciudad);
            System.out.println("\tPais: "+this.trabajo.getEmpresa().getDireccion().getBarrio().pais);
        }
    }
}
