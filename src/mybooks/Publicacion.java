package mybooks;

public abstract class Publicacion {
	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int id;
	private int pagActual;
	private boolean leido;
	private String autor;
	private static String mensajeCabecera;
	private static long nextId = 0;
	
	@Override
	public String toString() {
		return String.format("Publicación %s con %d páginas y precio %.2f €", titulo, numPags, precio);
	}
	
}
