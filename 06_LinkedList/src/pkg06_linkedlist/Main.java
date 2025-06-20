package pkg06_linkedlist;
import java.util.LinkedList; //Lista Vinculada
public class Main {
    public static void main(String[] args) {
        /*Lista Vinculada
        Puede cambiar su tamaño dinamicamente y sus Nodos se posicionan
        en la memoria de forma aleatoria, pueden ser homogeneas o heterogeneas si el
        programador asi lo prefiere.*/
        
        //Coleccion heterogenea: cada Nodo puede tener un tipo diferente
        LinkedList c1 = new LinkedList();
        //agregar Nodos:
        c1.add("Gerardo");
        c1.add(100);
        c1.add(45.8f);
        c1.add("UNAH");
        c1.add(190.25);
        //el problema de la coleccion heterogenea es que si no sabe lo que esta
        //haciendo se va confundir.
        imprimirLista(c1);
        
        //Coleccion homogenea: todos los Nodos deben ser del mismo tipo
        //en el siguiente ejemplo se declaro un LinkedList que solo almacena String:
        LinkedList<String> c2 = new LinkedList();
        //observe el tipo encerrado <String> a eso se le conoce como Generics
        c2.add("Rojo");
        c2.add("Verde");
        c2.add("Azul");
        c2.add("Rosa");
        imprimirLista(c2);
        
        //Coleccion homogenea de solo numeros enteros
        LinkedList<Integer> c3 = new LinkedList();
        c3.add(100);
        c3.add(7777);
        c3.add(-456);
        c3.add(2);
        c3.add(123);
        imprimirLista(c3);
        
        //Coleccion homogenea de solo numeros double
        LinkedList<Double> c4 = new LinkedList();
        c4.add(3.1416);
        c4.add(2.25);
        c4.add(1.45663);
        imprimirLista(c4);
        
        //metodos populares de LinkedList:
        //metodo push: agrega un nuevo elemento al inicio de la lista
        //metodo add: agrega un nuevo elemento al final de la lista
        //metodo get: recupera un Nodo que esta en la posicion deseada
        //metodo remove: extrae un Nodo de la lista en la posicion deseada
        //extraer el Nodo 2 de c3:
        c3.remove(2);
        imprimirLista(c3);
        //metodo pop: extrae el primer Nodo de la lista:
        //extrar el ultimo Nodo en c4
        c4.pop();
        imprimirLista(c4);
    }
    
    //metodo para imprimir un LinkedList
    public static void imprimirLista(LinkedList lista){
        System.out.println("****************************");
        for( int i = 0; i < lista.size(); i++){
            System.out.println("Nodo "+i+": "+lista.get(i).toString());
        }
    }
}
