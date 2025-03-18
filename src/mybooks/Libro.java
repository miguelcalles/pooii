package mybooks;

public class Libro extends Publicacion {
	private static String titulo;
	private static String autor;
	private static int numPags;
	private static int pagInicial;
	private static boolean formatoDigital;
	private static double precio;
	private static int id = 0;
	private static int pagActual;
	private static boolean leido;
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";
	private static long nextId = 0;
	
	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		mensajeCabecera = "\nDATOS LIBRO\n=============\n";
		id++;
		nextId = id++;
	}
	
	public void show() {
		System.out.println();
		System.out.println("DATOS LIBRO");
		System.out.println("===========");
		System.out.printf("Título: %s%n", titulo);
		System.out.printf("Autor: %s%n", autor);
		System.out.printf("Id: %d%n", id);
		System.out.printf("Páginas: %d%n", numPags);
		System.out.printf("Página inicial: %d%n", pagInicial);
		System.out.printf("Página actual: %s%n", pagActual);
		System.out.printf("Precio: %.2f €%n", precio);
		System.out.printf("Formato digital: %b%n", formatoDigital);
		System.out.printf("Leído: %b%n", leido);
		System.out.println();
	}
	
	public static void showStatic() {
		System.out.println();
		System.out.println("DATOS LIBRO");
		System.out.println("===========");
		System.out.printf("Título: %s%n", titulo);
		System.out.printf("Autor: %s%n", autor);
		System.out.printf("Id: %d%n", id);
		System.out.printf("Páginas: %d%n", numPags);
		System.out.printf("Página inicial: %d%n", pagInicial);
		System.out.printf("Página actual: %s%n", pagActual);
		System.out.printf("Precio: %.2f €%n", precio);
		System.out.printf("Formato digital: %b%n", formatoDigital);
		System.out.printf("Leído: %b%n", leido);
		System.out.println();
	}
	
	public void leePagina(boolean silenciosamente) {
		if(pagActual < numPags) {
			System.out.printf("Página %d leída del libro titulado %s del autor %s", pagActual, titulo, autor);
			pagActual++;
		} else if(pagActual + 1 == numPags) {
			System.out.printf("Última página (%d) leída del libro titulado %s del autor %s", pagActual, titulo, autor);
			pagActual++;
			leido = true;
		} else if(pagActual == numPags) {
			System.out.printf("Libro titulado %s del autor %s ya ha sido leído", titulo, autor);
		}
	}
	
	public static void leePaginaStatic(boolean silenciosamente) {
		if(pagActual < numPags) {
			System.out.printf("Página %d leída del libro titulado %s del autor %s", pagActual, titulo, autor);
			pagActual++;
		} else if(pagActual + 1 == numPags) {
			System.out.printf("Última página (%d) leída del libro titulado %s del autor %s", pagActual, titulo, autor);
			pagActual++;
			leido = true;
		} else if(pagActual == numPags) {
			System.out.printf("Libro titulado %s del autor %s ya ha sido leído", titulo, autor);
		}
	}
	
}
