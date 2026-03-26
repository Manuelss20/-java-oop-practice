
// Se representa la poliza de seguro del automóvil

package pruebaseguroautomovil;

/* @author Manuel Salgado Enríquez */

public class SeguroAutomovil {
    
    private int numeroCuenta; // número de cuenta de la póliza
    private String marcaYModelo; // Auto al que aplica la póliza
    private String estado; // abreviación del estado en tres letras
    
    // Constructor
    public SeguroAutomovil(int numeroCuenta, String marcaYModelo, String estado){
        this.numeroCuenta = numeroCuenta;
        this.marcaYModelo = marcaYModelo;
        this.estado = estado; 
    }
    
    // establecer el número de cuenta
    public void establecerNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    
    // obtener numeroCuenta
    public int obtenerNumeroCuenta(){
        return numeroCuenta;
    }
    
    // establecer marcaYModelo
    public void establecerMarcaYModelo(String marcaYModelo) {
        this.marcaYModelo = marcaYModelo;
    }
    
    // obtener marcaYModelo
    public String obtenerMarcaYModelo() {
        return marcaYModelo;
    } 
    
    // establecer Estado
    public void establecerEstado(String estado) {
        this.estado = estado;
    }
    
    // obtener Estado
     public String obtenerEstado() {
        return estado;
    }
    
     // método predicado que devuelve si el estado tiene seguro o no 
     public boolean esEstadoSinCulpa(){
        boolean estadoSinCulpa;
         
        // determinar si el estado tiene seguro de auto 
        switch(obtenerEstado()){
            case "QRO" : case "GTO" : case "MTY" : case "SLP" :
                estadoSinCulpa = true;
                break;
            default:
                estadoSinCulpa = false;
                break;
         }
         
         return estadoSinCulpa;
     }
    
}
