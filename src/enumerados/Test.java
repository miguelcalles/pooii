package enumerados;

public class Test {
    public static void main(String[] args) {
        
        Weekend w = Weekend.DO;
        
        switch (w) {
            case VI:
                System.out.println("Hoy es viernes");
                break;
            case SA:
                System.out.println("Hoy es sábado");
                break;
            default:
                System.out.println("Hoy es domingo");    
                
        }
        
        System.out.printf("Hoy es %s%n", w.getNombre());
    }
}