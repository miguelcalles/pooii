package _12Inheritance;

public class _1_OverviewBefore {
    public static void main(String[] args) {
        Animal a = new Animal(250);
        Gato g = new Gato(6);
        Perro p = new Perro(40.5);
        // Soy un ANIMAL y peso 250.0 Kg.
        a.identificar();
        System.out.printf(" y peso %.1f Kg.%n", a.getPeso());
        g.identificar();
        System.out.printf(" y peso %.1f Kg.%n", g.getPeso());
        p.identificar();
        System.out.printf(" y peso %.1f Kg.%n", p.getPeso()); 
    }
}