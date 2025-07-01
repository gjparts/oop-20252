package pkg08_multiplicidad2;
import java.util.LinkedList; //Lista vinculada
public class Persona {
    //atributos
    public String identidad;
    public String nombre;
    public int telefono;
    public Direccion direccion;
    public Empresa empresaLabora;
    public Mascota[] mascotas;
    public LinkedList<Diploma> diplomas; //lista Vinculada que soporta solo objetos Diploma
                          //el tipo encerrado entre < > es un tipo restringido por Generics
    public Persona conyuge; //atributo cuyo tipo es la misma clase Persona (referencia circular)
    public LinkedList<Persona> hijos;
    
    //constructor
    public Persona(String identidad, String nombre, int telefono) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public void imprimir(){
        System.out.println("**** Perfil de Persona ****");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Identidad: "+this.identidad);
        System.out.println("Telefono: "+this.telefono);
        //direccion se relaciona por agregacion y es public por lo tanto
        //puede llegar a ser null, si es asi entonces no se imprime (null safety)
        if( this.direccion != null ){
            System.out.println("Direccion: ");
            System.out.println("\tBarrio/Colonia: "+this.direccion.getColonia().nombre);
            System.out.println("\tCalle: "+this.direccion.calle);
            System.out.println("\tAvenida: "+this.direccion.avenida);
            System.out.println("\tCasa: "+this.direccion.casa);
        }
        
        //empresaLabora puede ser null (agregacion), si es asi se ignora
        if( this.empresaLabora != null ){
            System.out.println("Empresa donde trabaja: ");
            System.out.println("\tNombre: "+this.empresaLabora.nombre);
            System.out.println("\tTelefono: "+this.empresaLabora.telefono);
            System.out.println("\tBarrio/Colonia: "+this.empresaLabora.getDireccion().getColonia().nombre);
       }
       else
            System.out.println("Empresa donde trabaja: No labora");
        
        //Array de mascotas
        //si mascotas es null se ignora
        if( this.mascotas != null ){
            //si mascotas no tiene elementos se ignora
            if( this.mascotas.length > 0 ){
                System.out.println("Mascotas:");
                //recorrer cada mascota e imprimirla
                for( int i = 0; i < this.mascotas.length; i++ ){
                    //si la i-esima mascota es null entonces ignorarla
                    if( this.mascotas[i] != null ){
                        System.out.println("\t- "+this.mascotas[i].nombre+"("+this.mascotas[i].especie+")");
                    }
                }
            }
        }
        
        //Coleccion de Diplomas
        //ignorar si es null
        if( this.diplomas != null ){
            //ignorar si no tiene elementos
            if( this.diplomas.size() > 0 ){
                System.out.println("Diplomas:");
                //recorrer la coleccion
                for( int i = 0; i < diplomas.size(); i++ ){
                    //ignorar aquellos elementos que sean null
                    if( diplomas.get(i) != null ){
                        System.out.println("\t- "+diplomas.get(i).nombre);
                        System.out.println("\t  "+diplomas.get(i).institucion);
                    }
                }
            }
        }
        
        //conyuge se ignora si es null
        if( this.conyuge != null ){
            System.out.println("Conyuge: ");
            System.out.println("\tNombre: "+this.conyuge.nombre);
            System.out.println("\tTelefono: "+this.conyuge.telefono);
        }
        
        //Coleccion de Hijos
        //ignorar si es null
        if( this.hijos != null ){
            //ignorar si no tiene elementos
            if( this.hijos.size() > 0 ){
                System.out.println("Hijos:");
                //recorrer la coleccion
                for( int i = 0; i < hijos.size(); i++ ){
                    //ignorar aquellos elementos que sean null
                    if( hijos.get(i) != null ){
                        System.out.println("\t- "+hijos.get(i).nombre);
                    }
                }
            }
        }
    }
}
