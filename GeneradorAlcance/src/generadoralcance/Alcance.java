
package generadoralcance;
// Alcance de muestra los alcances de los campos y las variables locales.

//* @author Manuel Salgado Enríquez */

public class Alcance {
    
    // campo accesible para todos los métodos de esta clase
    private int x = 1;
    
    // eñ método iniciar crea e inicializar la variable local x y llama
    // los métodos usarVariableLocal y usarCampo
    
    public void iniciar(){
        int x = 5; // la variable local x del método oculta el campo x
        
        System.out.printf("La x local en el método inicial es %d\n", x);
        
        usarVariableLocal(); // tiene la x local 
        usarCampo(); // usa el campo x de la clase Alcance
        usarVariableLocal(); // reiniciar la x local
        usarCampo(); // de la clase Alcance retiene su valor
        
        System.out.printf("\nla x local en el método iniciar es %d\n", x);
        
    }
    
    public void usarVariableLocal(){
        int x = 25; // se va a inicializar cada vez que se llame al método 
        System.out.printf("\nla x local al entrar al método usarVariableLocal es %d\n", x);
        ++x; // modificación de la variable local x de este método
        System.out.printf("\nla x local antes de salir del método usarVariableLocal es %d\n", x);
    }
    
    // modifica el campo x de la clase Alcande durante cada llamada
    public void usarCampo(){
        System.out.printf("\nel campo x al entrar al método usarCampo es %d\n", x);
        x*=10; // modificar el campo x de la clase Alcance
        System.out.printf("\nel campo x al salir del método usarCampo es %d\n", x);

    }
    
}
