package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Parking {
	private String nombre;
	private int totalPlazas;
	ArrayList<Coche> listaCoches = new ArrayList<>();
	HashMap<Coche, Integer> cochesIguales = new HashMap<>();
	int plazasOcupadas = 0;
	Random random = new Random();
	
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas;
	}
	
	public boolean entraCoche(Coche c) {
		if(!listaCoches.contains(c) && plazasOcupadas < totalPlazas) {
			listaCoches.add(c);
			plazasOcupadas++;
		} else {
			System.out.println("El coche ya está dentro.");
		}
		return true;
	}
	
	public boolean saleCoche(Coche c) {
		if(listaCoches.contains(c)) {
			listaCoches.remove(c);
			plazasOcupadas--;
			return true;
		} else if(!listaCoches.contains(c) || listaCoches.isEmpty()) {
			System.out.println("El coche ya está fuera.");
			return false;
		}
		return true;
	}
	
	public boolean saleCocheAleatrorio() {
		if(listaCoches.isEmpty()) {
			return false;
		} else {
			listaCoches.remove(random.nextInt(listaCoches.size() + 1));
			plazasOcupadas--;
			return true;
		}
	}
	
	public boolean vaciaParking() {
		if(listaCoches.isEmpty()) {
			System.out.println("El parking no puede vaciarse porque ya está vacío.");
			return false;
		} else {
			for(int i = 0; i < listaCoches.size(); i++) {
			listaCoches.clear();
			}
			return true;
		}
	}
	
	public void reportParking() {
		System.out.println();
		System.out.println("LISTADO COCHES");
		System.out.println("--------------");
		System.out.println("Parking: Mi primer parking");
			for(Coche c: listaCoches) {
				System.out.println("  " + c);
			}
		System.out.printf("Total coches: %d, plazas libres: %d.%n", listaCoches.size(), totalPlazas - listaCoches.size());
	}
	
	public void reportColores() {
		System.out.println();
		HashMap<String, Integer> colores = new HashMap<>();
		System.out.println("REPORT DE COLORES");
		System.out.println("-----------------");
		System.out.println("Parking: mi primer parking");
			for(Coche coches: listaCoches) {
				if(colores.get(coches.getColor().toString()) == null){
					colores.put(coches.getColor().toString(), 1);
				} else {
					colores.put(coches.getColor().toString(), colores.get(coches.getColor().toString()) +  1);
				}
			}
			
			for(String color: colores.keySet()) {
				int veces = colores.get(color);
				System.out.println("El coche de color " + color + " se repite " + veces + " veces.");
			}
		System.out.printf("Total coches: %d", listaCoches.size());
		System.out.println();
	}
	
	public void reportMarcas() {
		System.out.println();
		HashMap<String, Integer> marcas = new HashMap<>();
		System.out.println("REPORT DE MARCAS");
		System.out.println("----------------");
		System.out.println("Parking: mi primer parking");
			for(Coche coche: listaCoches) {
				if(marcas.get(coche.getMarca().toString()) == null){
					marcas.put(coche.getMarca().toString(), 1);
				} else {
					marcas.put(coche.getMarca().toString(), marcas.get(coche.getMarca().toString()) +  1);
				}
			}
			for(String marca: marcas.keySet()) {
				int veces = marcas.get(marca);
				System.out.println("El coche de marca " + marca + " se repite " + veces + " veces.");
			}
		System.out.printf("Total coches: %d", listaCoches.size());
		System.out.println();
	}
	
	public void reportCochesIguales() {
		System.out.println("\nREPORT COCHES IGUALES");
		System.out.println("---------------------");
		cochesIguales.clear();
		
		for(Coche coche: listaCoches) {
			if(cochesIguales.get(coche) == null){
				cochesIguales.put(coche, 1);
			} else {
				cochesIguales.put(coche, cochesIguales.get(coche) + 1);
			}
		}
		for(Coche coche: cochesIguales.keySet()) {
			int veces = cochesIguales.get(coche);
			System.out.println(coche + " se repite " + veces + " veces.");
		}
		System.out.printf("Total coches: %d", listaCoches.size());
		System.out.println();
	}
	
	public static void main(String[] args) {
		Coche c1 = new Coche(Marca.MER, Color.NA);
		Coche c2 = new Coche(Marca.AUD, Color.AMA);
		Coche c3 = new Coche(Marca.HON, Color.AZ);
		Coche c4 = new Coche(Marca.KIA, Color.IN);
		Coche c5 = new Coche(Marca.POR, Color.RO);
		Coche c6 = new Coche(Marca.HYU, Color.RO);
		Coche c7 = new Coche(Marca.HYU, Color.RO);
		Coche c8 = new Coche();
		Parking p1 = new Parking("p1", 10);
		
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);
		p1.entraCoche(c4);
		p1.entraCoche(c5);
		p1.entraCoche(c6);
		p1.entraCoche(c7);
		p1.entraCoche(c8);
		
		p1.reportColores();
		p1.reportMarcas();
		p1.reportCochesIguales();
	}
}
