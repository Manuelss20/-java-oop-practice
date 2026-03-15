
package pruebaperfilmedico;

/* @author manuelsss20 */

public class PerfilMedico {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private double altura;
    private double peso;
    private int dia;
    private int mes;
    private int año;
    
    
    // Método constructor que inicializa mis variables de instancia
    public PerfilMedico(String nombre, String apellido, String sexo, 
            double altura, double peso, int dia, int mes, int año){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso; 
        this.dia = dia;
        this.mes = mes;
        this.año = año;
                
    }
    
    // set & get nombre
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    
    // set & get apellido
    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }
    
    // set & get sexo
    public String obtenerSexo() {
        return sexo;
    }

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }
    
    // set & get altura

    public double obtenerAltura() {
        return altura;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }
    
    // set & get peso 

    public double obtenerPeso() {
        return peso;
    }

    public void establecerPeso(double peso) {
        this.peso = peso;
    }

    // set & get dia
    public int obtenerDia() {
        return dia;
    }

    public void establecerDia(int dia) {
        this.dia = dia;
    }
    
    // set & get mes
    public int obtenerMes() {
        return mes;
    }

    public void establecerMes(int mes) {
        this.mes = mes;
    }
    
    // set & get año
    public int obtenerAño() {
        return año;
    }

    public void establecerAño(int año) {
        this.año = año;
    }
    
    // mostrar bmi 
    public double mostrarBMI(){
        return (peso)/(altura*altura); 
    }
    
    // mostrar fecha 
    public void mostrarFecha(){
        System.out.printf("La fecha es %d/%d/%d\n", dia, mes, año);
    }
    
    // edad
    public int calcularEdad(){
    int anioActual = 2026;
    return anioActual - año;
    }
    
    
}
