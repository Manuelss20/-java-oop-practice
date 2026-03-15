
package pruebaperfilmedico;
import java.util.Scanner;

/* @author Manuel Salgado Enríquez */

public class PruebaPerfilMedico {

    public static void main(String[] args) {
        
        
        // crear objeto Scanner
        Scanner consola = new Scanner(System.in);
        
        // solicitar datos al usuario 
        System.out.println("*** Ingresar datos para perfil médico ***");

        System.out.print("Ingrese su primer nombre: ");
        String nombre = consola.nextLine(); 
        
        System.out.print("Ingrese su apellido: ");
        String apellido = consola.nextLine();
        
        System.out.print("Ingrese su sexo (masculino/femenino): ");
        String sexo = consola.nextLine();
        
        System.out.print("Ingrese su altura (metros): ");
        double altura = consola.nextDouble();
        
        System.out.print("Ingrese su peso (Kilogramos): ");
        double peso = consola.nextDouble();
        
        System.out.print("*** A continuación, ingresará su fecha de nacimiento ***\n");
        
        System.out.print("Ingrese día: ");
        int dia = consola.nextInt();
        
        System.out.print("Ingrese mes: ");
        int mes = consola.nextInt();
        
        System.out.print("Ingrese año: ");
        int año = consola.nextInt();
        
        // creamos el objeto PerfilMedico
        PerfilMedico perfil1 = new PerfilMedico(nombre, apellido, sexo, altura, peso, dia, mes, año);
        
        // imprimir perfil médico
        
        // encabezado bonito 
        System.out.println("========================================");
        System.out.println("***           Perfil Médico          ***");
        System.out.println("========================================");
        
        System.out.printf("Nombre: %s\n", perfil1.obtenerNombre());
        System.out.printf("Apellido: %s\n", perfil1.obtenerApellido());
        System.out.printf("Sexo: %s\n", perfil1.obtenerSexo());
        System.out.printf("Altura: %f m\n", perfil1.obtenerAltura());
        System.out.printf("Peso: %f kg\n", perfil1.obtenerPeso());
        System.out.print("Fecha de nacimiento: ");
        perfil1.mostrarFecha();
        int edad = perfil1.calcularEdad();
        System.out.println("Edad: " + edad + " años");
        
        
        System.out.println("========================================");
        double bmi1 = perfil1.mostrarBMI();
        System.out.printf("Su índice de masa corporal (BMI) es: %f\n", bmi1);
        
        System.out.println("\nVALORES DE BMI: ");
        System.out.println("Bajo de peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obesidad: 30 o más");
        
        
        if (bmi1 < 18.5){
            System.out.println("Su índice es Bajo de peso");
        } else if (bmi1 >= 18.5 && bmi1 <= 24.9){
            System.out.println("Su índice es Normal");  
        } else if (bmi1 >= 25 && bmi1 <= 29.9){
            System.out.println("Su índice Sobrepeso");
        } else {
            System.out.println("Su índice es de obesidad");
        }
        
    }
    
}
