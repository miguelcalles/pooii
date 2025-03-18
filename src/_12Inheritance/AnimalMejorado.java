package _12Inheritance;

public class AnimalMejorado {
    private double peso;
    public void identificar(){
        System.out.print("Soy un animal mejorado");
    }
    public AnimalMejorado(double peso) {
        this.peso = peso;
    } 

    public double getPeso() {
        return peso;
    } 
}