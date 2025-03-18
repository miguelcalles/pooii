package menujuegos;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
	Random random = new Random();
	String[] opciones = {"piedra", "papel", "tijera"};
	int puntosMaquina = 0;
	int puntosUsuario = 0;
	int puntosMaximos;
	
	
	public PiedraPapelTijera(int puntosMaximos) {
		this.puntosMaximos = puntosMaximos;
	}

	public void jugar() {
		System.out.println("Piedra, papel o tijera: ");
		Scanner scanner = new Scanner(System.in);
		
		
		while(puntosUsuario < puntosMaximos && puntosMaquina < puntosMaximos) {
			String eleccionUsuario = scanner.nextLine().toLowerCase();
			String eleccionMaquina = opciones[random.nextInt(3)];
			boolean ganado = puntosMaximos == puntosUsuario + 1;
			boolean perdido = puntosMaximos == puntosMaquina + 1;
			
			if(eleccionUsuario.equals(eleccionMaquina)) {
				System.out.println("Iguales, saca otra vez: ");
			} else if(eleccionUsuario.equals("piedra") && eleccionMaquina.equals("papel") ||
					eleccionUsuario.equals("papel") && eleccionMaquina.equals("tijera") ||
					eleccionUsuario.equals("tijera") && eleccionMaquina.equals("piedra")) {
				System.out.println("La máquina ha sacado: " + eleccionMaquina);
				puntosMaquina++;
				System.out.println("Punto para la máquina.");
				System.out.printf("Tú: %d. Máquina: %d.%n",puntosUsuario, puntosMaquina);
			}  else if(eleccionUsuario.equals("papel") && eleccionMaquina.equals("piedra") ||
					eleccionUsuario.equals("tijera") && eleccionMaquina.equals("papel") ||
					eleccionUsuario.equals("piedra") && eleccionMaquina.equals("tijera")) {
				System.out.println("La máquina ha sacado: " + eleccionMaquina);
				puntosUsuario++;
				System.out.println("Punto para ti.");
				System.out.printf("Tú: %d. Máquina: %d.%n",puntosUsuario, puntosMaquina);
			} else if(!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera") ) {
				System.out.println("Saca otra vez.");
			} if(puntosUsuario == puntosMaximos) {
				System.out.println("Has ganado");
			} else if(puntosMaquina == puntosMaximos) {
				System.out.println("Has perdido");
			}
		}
	}
	
	public static void main(String[] args) {
		PiedraPapelTijera j1 = new PiedraPapelTijera(3);
		
		j1.jugar();
	}
}
