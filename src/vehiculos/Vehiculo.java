package vehiculos;

public abstract class Vehiculo {
	private int velocidadMaxima;
	private int numRuedas;
	private double peso;
	private String matricula;	//solo si aplica
	private int velocidad;
	
	public boolean acelerar() {
		if(velocidad + 10 > velocidadMaxima) {
			velocidad = velocidadMaxima;
		}
		return true;
	}
	
	public boolean frenar() {
		if(velocidad >= 10) {
			velocidad = velocidad - 10;
			} 
		if(velocidad <= 0) {
				velocidad = 0;
				return false;
			}
		return true;
	}
	
	public Vehiculo(int velocidadMaxima, int numRuedas, double peso, String matricula, int velocidad) {
		this.velocidadMaxima = velocidadMaxima;
		this.numRuedas = numRuedas;
		this.peso = peso;
		this.matricula = matricula;
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString() {
		return String.format("Vehiculo de matricula: %s, numero de ruedas: %d, peso: %2.f, velocidad máxima: %d", 
				matricula != null ? matricula : "", numRuedas, peso, velocidadMaxima);
	}
}
