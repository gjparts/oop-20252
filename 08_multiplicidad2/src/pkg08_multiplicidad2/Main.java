package pkg08_multiplicidad2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Barrio b1 = new Barrio("Villas de Sol", "Oeste", "21102");
        
        Direccion dir1 = new Direccion(b1);
        dir1.calle = "Principal";
        dir1.avenida = "5";
        dir1.casa = "1234";
        
        Empresa em1 = new Empresa("Cablenet", dir1, 12345678);
        
        Persona per1 = new Persona("1234123412345", "Filomeno Colinas", 7777);
        per1.empresaLabora = em1;
        per1.imprimir();
        
        Persona per2 = new Persona("1111","Gerardo",1234);
        per2.imprimir();
        
        Direccion dir2 = new Direccion(new Barrio("Lempira","Centro","21100"));
        dir2.calle = "10";
        dir2.avenida = "3";
        dir2.casa = "N/A";
        Persona per3 = new Persona("456", "Estebancito Maravilla", 11111);
        per3.direccion = dir2;
        per3.empresaLabora = new Empresa("Aguazul", new Direccion(new Barrio("Satelite","Este","21101")), 777777);
        
        Mascota g1 = new Mascota("Michi", "Gato");
        Mascota l1 = new Mascota("Paquito", "Loro");
        Mascota[] m1 = {g1, null, l1, new Mascota("Rambo","Perro")};
        per3.mascotas = m1;
        
        Diploma diplo1 = new Diploma("INFOP","Reparacion de Maquina de Coser");
        Diploma diplo2 = new Diploma("INFOP","Torno y Fresa");
        //crear un nuevo LinkedList para la coleccion de diplomas
        per3.diplomas = new LinkedList();
        //ya con la coleccion de diplomas inicializar podemos agregarle diplomas:
        per3.diplomas.add(diplo1);
        per3.diplomas.add(diplo2);
        per3.diplomas.add( new Diploma("UDEMY", "Flutter de Cero a Experto"));
        
        per3.imprimir();
    }
}
