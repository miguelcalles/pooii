package menujuegos;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeraLagartoSpock {
	Random random = new Random();
	String[] opciones = {"piedra", "papel", "tijeras", "lagarto", "spock"};
	int puntosMaquina = 0;
	int puntosUsuario = 0;
	int puntosMaximos;
	
	
	public PiedraPapelTijeraLagartoSpock(int puntosMaximos) {
		this.puntosMaximos = puntosMaximos;
	}

	public void jugar() {
		System.out.println("Piedra, papel, tijeras, lagarto, spock: ");
		Scanner scanner = new Scanner(System.in);
		
		
		while(puntosUsuario < puntosMaximos && puntosMaquina < puntosMaximos) {
			String eleccionUsuario = scanner.nextLine().toLowerCase();
			String eleccionMaquina = opciones[random.nextInt(3)];
			boolean ganado = puntosMaximos == puntosUsuario + 1;
			boolean perdido = puntosMaximos == puntosMaquina + 1;
			
			if(eleccionUsuario.equals(eleccionMaquina)) {
				System.out.println("Iguales, saca otra vez: ");
			} else if(eleccionUsuario.equals("piedra") && eleccionMaquina.equals("papel") ||
					eleccionUsuario.equals("papel") && eleccionMaquina.equals("tijeras") ||
					eleccionUsuario.equals("tijeras") && eleccionMaquina.equals("piedra")||
					eleccionUsuario.equals("lagarto") && eleccionMaquina.equals("piedra") ||
					eleccionUsuario.equals("tijeras") && eleccionMaquina.equals("spock") ||
					eleccionUsuario.equals("lagarto") && eleccionMaquina.equals("tijeras") ||
					eleccionUsuario.equals("papel") && eleccionMaquina.equals("lagarto") ||
					eleccionUsuario.equals("spock") && eleccionMaquina.equals("papel") ||
					eleccionUsuario.equals("piedra") && eleccionMaquina.equals("spock")) {
				System.out.println("La máquina ha sacado: " + eleccionMaquina);
				puntosMaquina++;
				System.out.println("Punto para la máquina.");
				System.out.printf("Tú: %d. Máquina: %d.%n",puntosUsuario, puntosMaquina);
			}  else if(eleccionUsuario.equals("papel") && eleccionMaquina.equals("piedra") ||
					eleccionUsuario.equals("tijeras") && eleccionMaquina.equals("papel") ||
					eleccionUsuario.equals("piedra") && eleccionMaquina.equals("tijeras") ||
					eleccionUsuario.equals("piedra") && eleccionMaquina.equals("lagarto") ||
					eleccionUsuario.equals("spock") && eleccionMaquina.equals("tijeras") ||
					eleccionUsuario.equals("tijeras") && eleccionMaquina.equals("lagarto") ||
					eleccionUsuario.equals("lagarto") && eleccionMaquina.equals("papel") ||
					eleccionUsuario.equals("papel") && eleccionMaquina.equals("spock") ||
					eleccionUsuario.equals("spock") && eleccionMaquina.equals("piedra")) {
				System.out.println("La máquina ha sacado: " + eleccionMaquina);
				puntosUsuario++;
				System.out.println("Punto para ti.");
				System.out.printf("Tú: %d. Máquina: %d.%n",puntosUsuario, puntosMaquina);
			} else if(!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijeras") ) {
				System.out.println("Saca otra vez.");
			} if(puntosUsuario == puntosMaximos) {
				System.out.println("Has ganado");
			} else if(puntosMaquina == puntosMaximos) {
				System.out.println("Has perdido");
			}
		}
	}
	
	public static void main(String[] args) {
		PiedraPapelTijeraLagartoSpock j1 = new PiedraPapelTijeraLagartoSpock(3);
		
		j1.jugar();
	}
}
