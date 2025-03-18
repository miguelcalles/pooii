package sistema_de_gestion_de_edificio;

public enum ColorPelo {
	RUBIO("Rubio"), PELIRROJO("Pelirrojo"), NEGRO("Negro"), CANOSO("Canoso");
	
	private String nombreColorPelo;

	ColorPelo(String color) {
		this.nombreColorPelo = color;
	}

	public String getColor() {
		return nombreColorPelo;
	}
}
