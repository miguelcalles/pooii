package _collections;

import java.util.Random;

public class Coche {
	private Marca marca;
	private Color color;
	Random random = new Random();
	
	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}
	
	public Coche() {
		this.marca = Marca.values()[random.nextInt(Marca.values().length)];
		this.color = Color.values()[random.nextInt(Color.values().length)];
	}
	
	public Color getColor() {
		return color;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return "Coche: " + marca + " " + color;
	}
}
