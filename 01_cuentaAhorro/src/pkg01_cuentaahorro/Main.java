package pkg01_cuentaahorro;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //pruebas basicas de la clase
        /*
        CuentaAhorro abc = new CuentaAhorro("Prueba", "12345678");
        System.out.println( abc.getSaldo() );
        abc.depositar(500);
        System.out.println( abc.getSaldo() );
        abc.depositar(1000);
        System.out.println( abc.getSaldo() );
        abc.retirar(800);
        System.out.println( abc.getSaldo() );
        abc.retirar(700);
        System.out.println( abc.getSaldo() );
        */
        //cuentas de ahorro disponibles
        CuentaAhorro cc1 = new CuentaAhorro("Gerardo Portillo", "100001");
        CuentaAhorro cc2 = new CuentaAhorro("Gerardo Portillo", "101234");
        CuentaAhorro cc3 = new CuentaAhorro("Gerardo Portillo", "172816");
        //variable bandera que indica la cuenta en la que estamos trabajando:
        //inicialmente la apuntamos a cc1
        //en JAVA cuando se asigna (iguala) dos objetos lo que se hace
        //es conectarlos entre si, lo que le hagamos a actual es como si se
        //lo hicieramos a cc1
        CuentaAhorro actual = cc1;
        
        Scanner s = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("****************************");
            System.out.println("Bienvenido: "+actual.nombreCliente);
            System.out.println("Cuenta Actual: "+actual.numeroCuenta);
            System.out.println("1) Depositar");
            System.out.println("2) Retirar");
            System.out.println("3) Consultar saldo actual");
            System.out.println("4) Cambiarse de cuenta de ahorro");
            System.out.println("5) Terminar sesion");
            System.out.print("Digite opcion deseada: ");
            opcion = s.nextInt();
            if( opcion == 1 ){
                System.out.println("****************************");
                System.out.print("Digite monto a depositar: ");
                //evitar que el programa se detenga en caso de excepcion:
                try{
                    actual.depositar( s.nextFloat() );
                }catch(Exception ex){
                    System.out.println( ex.getMessage() );
                }
            }
            if( opcion == 2 ){
                System.out.println("****************************");
                System.out.print("Digite monto a retirar: ");
                //evitar que el programa se detenga en caso de excepcion:
                try{
                    actual.retirar( s.nextFloat() );
                }catch(Exception ex){
                    System.out.println( ex.getMessage() );
                }
            }
            if( opcion == 3 ){
                System.out.println("****************************");
                System.out.println("Saldo Actual Cuenta "+actual.numeroCuenta+": "+actual.getSaldo());
            }
            if( opcion == 4 ){
                System.out.println("****************************");
                System.out.println("1) "+cc1.numeroCuenta);
                System.out.println("2) "+cc2.numeroCuenta);
                System.out.println("3) "+cc3.numeroCuenta);
                System.out.print("Digite el numero de la cuenta deseada: ");
                int seleccion = s.nextInt();
                //cambiar hacia donde apunta la variable actual
                if( seleccion == 1 ) actual = cc1;
                if( seleccion == 2 ) actual = cc2;
                if( seleccion == 3 ) actual = cc3;
            }
        }while( opcion != 5 );
        
    }    
}
