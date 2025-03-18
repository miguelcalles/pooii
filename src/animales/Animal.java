package animales;

public class Animal {
    private int id;
    private double peso;
    private String color;
    private static int cantAnimales;
    private static int nextId = 1;

    public Animal(double peso, String color) {
        cantAnimales++;
        this.id = nextId++;
        this.peso = peso < 0 ? 0.001 : peso;
        this.color = color;
    }   
    public void show(){
        System.out.printf("Animal con ID:%d (%d) de color %s y peso %f.%n",
                id, nextId, color, peso);
    }
    public static void describeClase(){
        System.out.printf("Clase animal con nextID: %d y tengo %d animales%n",
                Animal.nextId, Animal.cantAnimales);
    }  
    public static void main(String[] args) {
        
        new Animal(10, "rojo").show();
        Animal a1 = new Animal(10, "rojo");
        a1.show();
        Animal.describeClase();
        a1.describeClase();
    }
}
