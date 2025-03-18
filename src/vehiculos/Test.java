package vehiculos;

public class Test {
	
	public static void main(String[] args) {
	Coche c1 = new Coche(160, 4, 1300, "SE2520AX", false, false, 130);	
	Motocicleta m1 = new Motocicleta(150, 2, 230, "SE3112AU", 100, false);
	Bicicleta b1 = new Bicicleta(40, 2, 22, 50);
	c1.cerrarPuertas();
	System.out.println(c1.toString());
	System.out.println(m1.toString());
	System.out.println(b1.toString());
	}
	
}
