package menujuegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
	String[] palabrasAAdivinar = {"hipopotamo", "coche", "Madrid", "Sevilla", "futbol"};
	Random random = new Random();
	char letra;
	int intentos;
	int maxIntentos;
	int intentosRestantes = maxIntentos - intentos;
	
	public Ahorcado(int maxIntentos) {
		this.maxIntentos = maxIntentos;
	}
	
	public void jugar() {
		String palabraSecreta = palabrasAAdivinar[random.nextInt(0, 6)];
		ArrayList<Character> letrasIntentadas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean acierto;
		
		//letra = scanner.nextLine().toLowerCase();
		letrasIntentadas.add(letra);
		
		for(int i = 0; i <= palabraSecreta.length(); i++) {
			if(letra == palabraSecreta.charAt(i)) {
				acierto = true;
			} else if (letra != palabraSecreta.charAt(i)) {
				acierto = false;
			}
			
		}
		
		
		
		if(acierto = true) {
		System.out.println("La letra está en la palabra");
		} else {
		System.out.println("Esa letra no está en la palabra.");
        intentosRestantes--;
        System.out.println("Intentos restantes: " + intentosRestantes);
		}
		
	}
}
