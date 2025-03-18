package generics;

public class CajaParaTodo{
	private Object contenido;

	public CajaParaTodo(Object contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "CajaParaTodos [contenido=" + contenido + "]";
	}

	public Object getContenido() {
		return contenido;
	}
	
	
}
