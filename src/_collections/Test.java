package _collections;

public class Test {
	public static void main(String[] args) {
		Coche c1 = new Coche(Marca.MER, Color.NA);
		Coche c2 = new Coche(Marca.AUD, Color.AMA);
		Coche c3 = new Coche(Marca.HON, Color.AZ);
		Coche c4 = new Coche(Marca.KIA, Color.IN);
		Coche c5 = new Coche(Marca.HYU, Color.RO);
		Parking p1 = new Parking("p1", 10);
		
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		p1.entraCoche(c4);
		p1.entraCoche(c5);
		
		p1.reportParking();
		p1.saleCocheAleatrorio();
		p1.reportParking();
		
		
		
		
	}
}
