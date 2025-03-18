package _12Inheritance;

public class Perro {
    private double peso;
        public void identificar(){
        System.out.print("Soy un perro");
    }

    public Perro(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }    
}