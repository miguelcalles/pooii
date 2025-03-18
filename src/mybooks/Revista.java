package mybooks;

public class Revista extends Publicacion{
	private static String titulo;
	private static int numPags;
	private static int pagInicial;
	private static boolean formatoDigital;
	private static double precio;
	private static int id;
	private static int pagActual;
	private static boolean leido;
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";
	private static long nextId = 0;

	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		mensajeCabecera = "\nDATOS REVISTA\n=============\n";
		id++;
		nextId = id++;
	}
	
	public void show() {
		System.out.println("DATOS REVISTA");
		System.out.println("===========");
		System.out.printf("Título: %s%n", titulo);
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
		System.out.println("DATOS REVISTA");
		System.out.println("===========");
		System.out.printf("Título: %s%n", titulo);
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
			System.out.printf("Página %d leída de la revista titulada %s%n", pagActual, titulo);
			pagActual++;
		} else if(pagActual + 1 == numPags) {
			System.out.printf("Última página (%d) leída de la revista titulada %s%n", pagActual, titulo);
			pagActual++;
			leido = true;
		} else if(pagActual == numPags) {
			System.out.printf("Revista titulada %s ya ha sido leída%n", titulo);
		}
	}
	
	public static void leePaginaStatic(boolean silenciosamente) {
		if(pagActual < numPags) {
			System.out.printf("Página %d leída de la revista titulada %s%n", pagActual, titulo);
			pagActual++;
		} else if(pagActual + 1 == numPags) {
			System.out.printf("Última página (%d) leída de la revista titulada %s%n", pagActual, titulo);
			pagActual++;
			leido = true;
		} else if(pagActual == numPags) {
			System.out.printf("Revista titulada %s ya ha sido leída%n", titulo);
		}
	}
	
}
