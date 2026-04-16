
package padresobrecargametodos;

//* @author Manuel Salgado Enríquez */

public class SobreCargaMétodos {
    
    // Prueba los métodos cuadrado sobrecargados
    public void probarMetodosSobrecargados(){
        System.out.printf("El cuadarado del entero 7 es %d\n", cuadrado(7));
        System.out.printf("El cuadrado del double 7.5 es %f\n", cuadrado(7.5));
    }
    
    public int cuadrado(int valorInt){
        System.out.printf("\nSe llamo a cuadrado con argumento int: %d\n", valorInt);
        return valorInt*valorInt;
    }
    
    public double cuadrado(double valorDouble){
        System.out.printf("\nSe llamo a cuadrado con argumento double: %f\n", valorDouble);
        return valorDouble*valorDouble;
    }
    
}
