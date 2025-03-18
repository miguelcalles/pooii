package _12Inheritance;

public class PerroMejorado extends AnimalMejorado {

    @Override
    public void identificar(){
        System.out.print("Soy un perro mejorado");
    }

    public PerroMejorado(double peso) {
        super(peso);
    }

}