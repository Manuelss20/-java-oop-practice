
package maincuentabancaria;
import java.util.Scanner;

/* author manuelsss20 */

public class MainCuentaBancaria {

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Ingrese nombre del titular: ");
        String nombreTitular = consola.nextLine();
        
        System.out.print("Ingrese el saldo inicial en su cuenta: ");
        double saldo = consola.nextDouble();
        
        System.out.println();
        consola.nextLine();
        
        CuentaBancaria miCuenta = new CuentaBancaria(nombreTitular, saldo);
        
        System.out.println("==================================================");
        System.out.println("***           Bienvenido a su cuenta           ***");
        System.out.println("==================================================");
        
        System.out.println("Nombre del titular: " + miCuenta.getNombreTitular());
        System.out.println("Su saldo inicial es: " + miCuenta.getSaldo() +
                " $MXN");
        
        int opcion;
        
        do {
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Retirar");
            System.out.println("4 - Salir");
            System.out.println("Ingrese el número de la opción deseada: ");
            opcion = consola.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + miCuenta.getSaldo()
                    + " $ MXN");
                    break;
                case 2:
                    {
                        System.out.print("Ingrese el monto que desea depositar: ");
                        double cantidad = consola.nextDouble();
                        miCuenta.depositar(cantidad);
                        break;
                    }
                case 3:
                    {
                        System.out.print("Ingrese el monto que desea retirar: ");
                        double cantidad = consola.nextDouble();
                        miCuenta.retirar(cantidad);
                        break;
                    }
                
                case 4:
                {
                    System.out.println("Saliendo...");
                    break;
                }
                
                default:
                    System.out.println("Opción invalida, ingrese una opción"
                            + "entre 1 y 4");
                    break;
            }
        } while (opcion != 4);
    }
}
