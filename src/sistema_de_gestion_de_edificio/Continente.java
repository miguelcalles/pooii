package sistema_de_gestion_de_edificio;

public enum Continente {
	EUROPA("Europa"), AMERICA("América"), ASIA("Asia"), AFRICA("África"), OCEANIA("Oceanía"), ANTARTIDA("Antartida");
	
	private String nombreContinente;

	private Continente(String nombre) {
		this.nombreContinente = nombre;
	}

	public String getNombre() {
		return nombreContinente;
	}
}	
