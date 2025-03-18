package _collections;

public enum Marca {
	TOY("Toyota"), LEX("Lexus"), MER("Mercedes"), POR("Porsche"), AUD("Audi"), KIA("Kia"), HON("Honda"), HYU("Hyundai"), SUZ("Suzuki");
	
	private String marca;

	private Marca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
	
	public String toString() {
		return marca;
	}
}
