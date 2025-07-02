package pkg09_herencia1;
public class Main {
    public static void main(String[] args) {
        Estudiante es1 = new Estudiante("Alguien", 34, 'M', "1234", "Derecho");
        //la clase Estudiante hereda de persona por lo tanto tiene
        //5 atributos y 2 metodos
        System.out.println("Datos de es1 ************");
        System.out.println("nombre: "+es1.nombre);
        System.out.println("edad: "+es1.edad);
        System.out.println("genero: "+es1.genero);
        System.out.println("cuenta: "+es1.cuenta);
        System.out.println("carrera: "+es1.carrera);
        es1.saludar();
        es1.estudiar();
        
        Empleado em1 = new Empleado();
        System.out.println("Datos de em1 ************");
        System.out.println("nombre: "+em1.nombre);
        System.out.println("edad: "+em1.edad);
        System.out.println("genero: "+em1.genero);
        System.out.println("cargo: "+em1.cargo);
        System.out.println("salario: "+em1.salario);
        em1.saludar();
        em1.trabajar();
        //asignar valores a em1:
        em1.nombre = "Frederico Mercurio";
        em1.edad = 80;
        em1.cargo = "Vocalista";
        em1.saludar();
        em1.trabajar();
        
        Empleado em2 = new Empleado("Gerardo", 42, 'M', 10000, "Docente");
        em2.saludar();
        em2.trabajar();
    }
    
}
