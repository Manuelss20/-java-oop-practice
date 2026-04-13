
package enterosaleatorios;
import java.util.Random;

/* @author Manuel Salgado Enríquez */

public class EnterosAleatorios {

    public static void main(String[] args) {
        Random numeroAleatorio = new Random();
        
        int cara;
        
        for (int contador = 1; contador <= 20; contador++){
            cara = 1 + numeroAleatorio.nextInt(6);
            System.out.printf("%d", cara);
            
            if (contador % 5 == 0)
                System.out.println();
            
        }
    }
    
}


