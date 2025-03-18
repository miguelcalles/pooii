package generics;

public class Articulo {
	private String descripcion;

	public Articulo(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Articulo [descripcion=" + descripcion + "]";
	}
	
	
}
