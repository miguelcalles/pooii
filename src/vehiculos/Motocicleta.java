package vehiculos;

public class Motocicleta extends Vehiculo {	
	private boolean motorArrancado;
	
	public Motocicleta(int velocidadMaxima, int numRuedas, double peso, String matricula, int velocidad, boolean motorArrancado) {
		super(velocidadMaxima, numRuedas, peso, matricula, velocidad);
		this.motorArrancado = motorArrancado;
	}

	public void hacerCaballito() {
		System.out.println("Haciendo caballito");
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
		return "Moto [" + super.toString() + ", motorArrancado=" + motorArrancado + "]";
	}
	
}
