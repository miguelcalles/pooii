package sistema_de_gestion_de_edificio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Edificio {
	private int aforo;
	private int aforoActual;
	private double pesoTotalActual;
	private double pesoMaximo;
	List<Persona> personasDentroDelEdificio;
	List<Persona> personasQueHanEntradoAlgunaVez;
	HashMap<Continente, Integer> continentes;
	HashMap<ColorPelo, Integer> coloresDePelo;
	HashMap<Continente, Double> pesoPorContinente;
	
	public Edificio(int aforo, int pesoMaximo) {
		personasDentroDelEdificio = new ArrayList<>();
		personasQueHanEntradoAlgunaVez = new ArrayList<>();
		continentes = new HashMap<>();
		coloresDePelo = new HashMap<>();
		pesoPorContinente = new HashMap<>();
		
		this.aforo = aforo;
		this.pesoMaximo = pesoMaximo;		
		this.pesoTotalActual = 0;
		aforoActual = 0;
	}
	
	public boolean entrar(Persona p) {
		boolean personaDentro = false;
		for (Persona persona : personasDentroDelEdificio) {
			if(persona == p) {
				personaDentro = true;
				break;
			}
		}
		
		if(!personaDentro && aforoActual < aforo && pesoTotalActual < pesoMaximo) {
			personasDentroDelEdificio.add(p);
			personasQueHanEntradoAlgunaVez.add(p);
			continentes.put(p.getContinenteProcedencia(), continentes.getOrDefault(p.getContinenteProcedencia(), 0) + 1);
			coloresDePelo.put(p.getColorPelo(), coloresDePelo.getOrDefault(p.getColorPelo(), 0) + 1);
			pesoPorContinente.put(p.getContinenteProcedencia(), pesoPorContinente.getOrDefault(p.getContinenteProcedencia(), 0.0) + p.getPeso());
			pesoTotalActual = pesoTotalActual + p.getPeso();
			aforoActual = personasDentroDelEdificio.size();
		}
		return true;
	}
	
	public boolean salir(Persona p) {
		boolean personaDentro = false;
		for (Persona persona : personasDentroDelEdificio) {
			if(persona == p) {
				personaDentro = true;
				break;
			}
		}
		
		if(personaDentro) {
			personasDentroDelEdificio.remove(p);
			for (Entry<Continente, Integer> continente : continentes.entrySet()) {
				Continente con = continente.getKey();
				Integer val = continente.getValue();
				if(con == p.getContinenteProcedencia()) {
				continentes.replace(p.getContinenteProcedencia(), val - 1);
				}
			}
			
			for (Entry<ColorPelo, Integer> colorDePelo : coloresDePelo.entrySet()) {
				ColorPelo color = colorDePelo.getKey();
				Integer val = colorDePelo.getValue();
				if(color == p.getColorPelo()) {
				coloresDePelo.replace(p.getColorPelo(), val, (val - 1) > 0 ? (val - 1) : 0);
				}
			}
			
			for (Entry<Continente, Double> continente : pesoPorContinente.entrySet()) {
				Continente con = continente.getKey();
				Double val = continente.getValue();
				if(con == p.getContinenteProcedencia()) {
				pesoPorContinente.replace(p.getContinenteProcedencia(), val, val - p.getPeso());
				}
			}
			pesoTotalActual = pesoTotalActual - p.getPeso();
			aforoActual = personasDentroDelEdificio.size();
		}
		
		return true;
	}
	
	public String obtenerInforme() {
		String infoGeneral = "";
		
		System.out.printf("Aforo total del edificio: %d, aforo actual: %d.%n"
					+ "Peso máximo permitido: %.1f, peso total actual: %.1f.%n"
					+ "Número total de visitantes históricos: %d.%n", aforo, aforoActual, pesoMaximo, pesoTotalActual, personasQueHanEntradoAlgunaVez.size());
			
		System.out.println("\nPersonas por continente: ");
			for (Entry<Continente, Integer> continente : continentes.entrySet()) {
				Continente key = continente.getKey();
				Integer val = continente.getValue();
				if(val > 0)
			System.out.printf("Continente: %s, personas: %d.%n", key, val);
			}
			
		System.out.println("\nPeso por continente: ");
			for (Entry<Continente, Double> continente : pesoPorContinente.entrySet()) {
				Continente key = continente.getKey();
				Double val = continente.getValue();
				if(val > 0)
			System.out.printf("Continente: %s, peso: %.2f.%n", key, val);
			}
			
		System.out.println("\nDistribución por color de pelo: ");
			for (Entry<ColorPelo, Integer> colorPelo : coloresDePelo.entrySet()) {
				ColorPelo key = colorPelo.getKey();
				Integer val = colorPelo.getValue();
				if(val > 0)
			System.out.printf("Color de pelo: %s, veces que se repite: %d.%n", key, val);
			}
			
		System.out.println("\nListado de ocupantes: ");
			for (Persona persona : personasDentroDelEdificio) {
			System.out.println(persona);
			}
			
		System.out.println("\nListado de ocupantes históricos: ");
			for(Persona persona : personasQueHanEntradoAlgunaVez) {
			System.out.println(persona);
			}
			
			return infoGeneral;
	}
	
	public static void main(String[] args) {
		Edificio ed1 = new Edificio(10, 10000);
		
		Persona p1 = new Persona("Juanma", 100.00, ColorPelo.PELIRROJO, Continente.ANTARTIDA);
		Persona p2 = new Persona("Pedrito", 112.00, ColorPelo.CANOSO, Continente.AFRICA);
		Persona p3 = new Persona("Chema", 78.00, ColorPelo.NEGRO, Continente.AMERICA);
		Persona p4 = new Persona("Chema", 90.00, ColorPelo.NEGRO, Continente.AMERICA);
		
		ed1.entrar(p1);
		ed1.entrar(p2);
		ed1.entrar(p3);
		ed1.entrar(p4);
		ed1.obtenerInforme();
		
		ed1.salir(p1);
		ed1.salir(p4);
		System.out.println("\n\n");
		ed1.obtenerInforme();
	}
}
