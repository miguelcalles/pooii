package vehiculos;

public class Coche extends Vehiculo {	
	private boolean puertasAbiertas;
	private boolean motorArrancado;
	
	public Coche(int velocidadMaxima, int numRuedas, double peso, String matricula, boolean puertasAbiertas, boolean motorArrancado, int velocidad) {
		super(velocidadMaxima, numRuedas, peso, matricula, velocidad);
		this.puertasAbiertas = puertasAbiertas;
		this.motorArrancado = motorArrancado;
	}

	public void abrirPuertas() {
		puertasAbiertas = true;
		System.out.println("Puertas abiertas");
	}
	
	public void cerrarPuertas() {
		puertasAbiertas = false;
		System.out.println("Puertas cerradas");
	}

	public void arrancarMotor() {
		motorArrancado = true;
		System.out.println("Motor arrancado");
	}

	public void pararMotor() {
		motorArrancado = false;
		System.out.println("Motor parado");
	}

	
	@Override
	public String toString() {
		return "Coche [" + super.toString() + ", puertasAbiertas=" + puertasAbiertas + ", motorArrancado=" + motorArrancado + "]";
	}

}
