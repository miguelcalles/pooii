package sistema_de_gestion_de_edificio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Persona {
	private String nombre;
	private double peso;
	private ColorPelo colorPelo;
	private Continente continenteProcedencia;
	List<String> nombres = new ArrayList<>();
	Random random = new Random();
	
	public Persona(String nombre, double peso, ColorPelo colorPelo, Continente continenteProcedencia) {
		this.nombre = nombre;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.continenteProcedencia = continenteProcedencia;
	}

	public Persona() {
		nombres.add("Pedro");
		nombres.add("María");
		nombres.add("Paco");
		nombres.add("Juan");
		nombres.add("Eduardo");
		nombres.add("Laura");
		nombres.add("Miguel");
		nombres.add("Jose");
		nombres.add("Guille");
		nombres.add("Eva");
		
		this.nombre = nombres.get(random.nextInt(nombres.size()));
		this.colorPelo = colorPelo.values()[random.nextInt(colorPelo.values().length)];
		this.continenteProcedencia = continenteProcedencia.values()[random.nextInt(continenteProcedencia.values().length)];
		this.peso = 60.0;
	}

	public double getPeso() {
		return peso;
	}

	public ColorPelo getColorPelo() {
		return colorPelo;
	}

	public Continente getContinenteProcedencia() {
		return continenteProcedencia;
	}

	@Override
	public String toString() {
		return "Persona nombre: " + nombre + ", peso: " + peso + ", color de pelo: " + colorPelo + ", continente de procedencia: "
				+ continenteProcedencia + ".";
	}
}
