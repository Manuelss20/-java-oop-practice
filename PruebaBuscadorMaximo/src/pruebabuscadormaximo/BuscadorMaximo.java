
package pruebabuscadormaximo;

import java.util.Scanner;

/* @author Manuel Salgado Enríquez */

public class BuscadorMaximo {
    
    public void determinarMaximo(){
        Scanner input = new Scanner(System.in);
        
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        double numero3 = input.nextDouble();
        
        double resultado = maximo(numero1, numero2, numero3); 
        
        System.out.println("El máximo es: " + resultado);
        
    }
    
    public double maximo(double x, double y, double z){
        double valorMaximo = x;
        
        if (y > valorMaximo)
            valorMaximo = y;
        
        if (z > valorMaximo)
            valorMaximo = z; 
        
        return valorMaximo;
    }
    
}
