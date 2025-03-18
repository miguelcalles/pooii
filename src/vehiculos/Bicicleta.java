package vehiculos;

public class Bicicleta extends Vehiculo {
	
	public Bicicleta(int velocidadMaxima, int numRuedas, double peso, int velocidad) {
		super(velocidadMaxima, numRuedas, peso, null , velocidad);
	}

	public void cambiarMarcha()	{
		System.out.println("Cambiando de marcha");
	}
	
	@Override
	public String toString() {
		return "Bicicleta [" + super.toString() + "]";
	}
}
