package _collections;
import java.util.HashMap;
import java.util.Map;
public class Prueba {
	

	public class Main {
	    public static void main(String[] args) {
	        Map<Coche, Integer> cochesIguales = new HashMap<>();

	        Coche c6 = new Coche(Marca.HYU, Color.RO);
	        Coche c7 = new Coche(Marca.HYU, Color.RO);

	        cochesIguales.merge(c6, 1, Integer::sum);
	        cochesIguales.merge(c7, 1, Integer::sum);

	        System.out.println(cochesIguales);
	    }
	}
}
