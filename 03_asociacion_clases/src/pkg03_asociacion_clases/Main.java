package pkg03_asociacion_clases;
public class Main {
    public static void main(String[] args) {
        //crear los objetos de las Clases no dependientes
        Fabricante apple = new Fabricante("Apple Computer Inc.", "USA", "Tim Cook");
        Fabricante xiaomi = new Fabricante("Xiaomi", "China", "Chin Chan");
        Fabricante lg = new Fabricante("LG Chemical", "Korea", "Sr. Park");
        
        Operador tigo = new Operador("TIGO","Centroamerica");
        Operador claro = new Operador("Claro", "Honduras");
        
        //crear objetos para las clases dependientes
        Bateria ba1 = new Bateria(lg, 6600);
        Bateria ba2 = new Bateria(lg, 4500);
        Bateria ba3 = new Bateria(xiaomi, 5500);
        //puede tambien crear objetos dentro del constructor
        //esto normalmente se hace cuando no vamos a reutilizar dicho objeto
        //observe arriba: lg lo usamos en dos Baterias, lo que amerita crear un objeto
        //en cambio Samsung solo lo voy a usar en ba4, por lo tanto lo creo nada mas
        //para ella al construirlo.
        Bateria ba4 = new Bateria( new Fabricante("Samsung", "Korea", ""), 4500 );
        //o sea que el atributo marca de ba4 es un objeto Fabricante de nombre Samsung
        System.out.println("Marca de ba4: "+ba4.getMarca().nombre);
        System.out.println("Marca de ba2: "+ba2.getMarca().nombre);
        System.out.println("Nombre de lg: "+lg.nombre);
        
        Chip simcard1 = new Chip(tigo, 99991515);
        Chip simcard2 = new Chip(claro, 33331515);
        Chip simcard3 = new Chip(tigo, 98989999);
        Chip simcard4 = new Chip( new Operador("DIGICEL", "Guatemala"), 88887777);
        
        //creacion de SmartPhones
        SmartPhone cel1 = new SmartPhone(apple, "iPhone 16 PRO Max", 512, 16, ba1, simcard1, null);
        cel1.imprimir();
        
        SmartPhone cel2 = new SmartPhone(xiaomi, "RedMI Note 13", 512, 16, ba3, simcard2, simcard4);
        cel2.imprimir();
        
        //tambien puede crear un objeto volatil de un solo uso:
        new SmartPhone(lg, "K52", 128, 4, ba4, null, null).imprimir();
    }    
}
