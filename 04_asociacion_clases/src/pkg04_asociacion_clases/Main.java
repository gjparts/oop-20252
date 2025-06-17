package pkg04_asociacion_clases;
public class Main {
    public static void main(String[] args) {
        Barrio b1 = new Barrio("Guamilito", "Honduras", "Cortes", "San Pedro Sula");
        Barrio b2 = new Barrio("Villa Valencia", "Honduras", "Cortes", "San Pedro Sula");
        
        Direccion d1 = new Direccion(b1, "7", "7", "Edificio COFISA");
        Direccion d2 = new Direccion(b2, "Principal", "N/A", "W10");
        Direccion d3 = new Direccion(b1, "8", "6", "N/A");
        
        Empresa em1 = new Empresa("Mecanica Rapida S.A.", "Mecanica", d1, "25545555");
        Empresa em2 = new Empresa("Baleadas BBB", "Comida", d3, "No tiene");
        
        Cargo car1 = new Cargo("Evaluador", 'M', em1, 18000);
        Cargo car2 = new Cargo("Cocinero", 'T', em2, 25000);
        Cargo car3 = new Cargo("Gerente de IT", 'M', em1, 45000);
        
        Estudiante e1 = new Estudiante("20012002049", "Gerardo", "Industrial", 42, d2, car3);
        e1.imprimir();
        Estudiante e2 = new Estudiante("1234", "Justiniano", "Derecho", 70, d3, null);
        e2.imprimir();
    }    
}
