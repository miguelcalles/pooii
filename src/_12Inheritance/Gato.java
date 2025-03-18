package _12Inheritance;

public class Gato {
    private double peso;
    public void identificar(){
        System.out.print("Soy un gato");
    }
    public Gato(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }   
}