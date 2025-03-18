package _12Inheritance;

public class GatoMejorado {
    private double peso;
    public void identificar(){
        System.out.print("Soy un animal mejorado");
    }
    public GatoMejorado(double peso) {
        this.peso = peso;
    } 

    public double getPeso() {
        return peso;
    } 
}