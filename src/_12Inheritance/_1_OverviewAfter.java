package _12Inheritance;

public class _1_OverviewAfter {
    public static void main(String[] args) {
        AnimalMejorado a = new AnimalMejorado(250);
        GatoMejorado g = new GatoMejorado(6);
        PerroMejorado p = new PerroMejorado(40.5);
        // Soy un ANIMAL y peso 250.0 Kg.
        a.identificar();
        System.out.printf(" y peso %.1f Kg.%n", a.getPeso());
        g.identificar();
        System.out.printf(" y peso %.1f Kg.%n", g.getPeso());
        p.identificar();
        System.out.printf(" y peso %.1f Kg.%n", p.getPeso()); 
    }
}