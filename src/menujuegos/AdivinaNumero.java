package menujuegos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
	private int numeroMaximo = 10;
	private int intentos = 0;
	private int numeroIntentos = 5;
	private int numeroOculto = new Random().nextInt(numeroMaximo) + 1;
	private ArrayList<String> historial = new ArrayList<>();
	
	public AdivinaNumero(int numeroMaximo, int numeroIntentos) {
		this.numeroMaximo = numeroMaximo;
		this.numeroIntentos = numeroIntentos;
		numeroOculto = new Random().nextInt(this.numeroMaximo) + 1;
	}
	
	public void jugar() {
		System.out.println("Bienvenido, empieza a jugar");
		Scanner scanner = new Scanner(System.in);
		
		while (++intentos <= numeroIntentos){
			System.out.printf("Introducir un número del 1 al %d: ", numeroMaximo);
			int numeroPropuesto = scanner.nextInt();
			if(numeroPropuesto == numeroOculto) {
				System.out.printf("Acertaste %n");
				historial.add("😎" + numeroPropuesto);
				System.out.println("Historial de intentos" + historial);
				break;
			} else if(numeroPropuesto > numeroOculto){
				System.out.printf("%d es mayor que el número oculto.❌%n", numeroPropuesto);
				historial.add("☠️" + numeroPropuesto);
				if((numeroIntentos - intentos) != 1) {
				System.out.println("Te quedan " + (numeroIntentos - intentos) + " intentos");
				} else {
				System.out.println("Te queda " + (numeroIntentos - intentos) + " intento");
				}
			} else {
				System.out.printf("%d es menor que el número oculto.❌%n", numeroPropuesto);
				historial.add("​☠️​" + numeroPropuesto);
				if((numeroIntentos - intentos) != 1) {
				System.out.println("Te quedan " + (numeroIntentos - intentos) + " intentos");
				} else {
				System.out.println("Te queda " + (numeroIntentos - intentos) + " intento");
				}
			}
			System.out.println("Historial de intentos: " + historial);
		} 
		System.out.printf("El número oculto era el " + numeroOculto + ", Número de intentos: %d.%n", historial.size());
		System.out.println("Gracias por participar");
	}
	
	public static void main(String[] args) {
		AdivinaNumero j1 = new AdivinaNumero(100, 10);
		
		j1.jugar();
	}
}
