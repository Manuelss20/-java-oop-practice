
package pruebaseguroautomovil;

/* @author Manuel Salgado Enríquez */

public class PruebaSeguroAutomovil {

    public static void main(String[] args) {
        SeguroAutomovil poliza1 = new SeguroAutomovil(111111, "Toyota Corolla", "QRO");
        SeguroAutomovil poliza2 = new SeguroAutomovil(111112, "Ford Mustang", "GDL");
        
        // Muestra en pantalla si cada póliza está con su estado sin culpa 
        polizaEnEstadoSinCulpa(poliza1);
        polizaEnEstadoSinCulpa(poliza2);
    }

    /* Método que muestra en pantalla si una poliza se encuentra en un 
       estado con seguro de auto sin culpa */
    public static void polizaEnEstadoSinCulpa(SeguroAutomovil poliza){
        System.out.println();
        System.out.printf("Cuenta #: %d; Auto: %s; Estado: %s %s un estado sin culpa%n%n", 
                poliza.obtenerNumeroCuenta(), 
                poliza.obtenerMarcaYModelo(), 
                poliza.obtenerEstado(), 
                (poliza.esEstadoSinCulpa()) ? "está en" : "no está en");
    }
}

    



