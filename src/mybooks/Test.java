package mybooks;

public class Test {
	
	public static void main(String[] args) {
		Publicacion[] publicaciones = new Publicacion[15];
		
		Libro lib0 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 22.99);
		Libro lib1 = new Libro("El señor de los anillos"," J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib2 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		Libro lib3 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib4 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib6 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);
		
		Revista rev0 = new Revista("Secretos del cerebro", 132, 3, true, 6.50);
		Revista rev1 = new Revista("Maravillas del océano", 120, 5, true, 7.00);
		Revista rev2 = new Revista("Exploradores del espacio", 140, 2, false, 5.75);
		Revista rev3 = new Revista("Historia oculta", 128, 4, true, 6.25);
		Revista rev4 = new Revista("Naturaleza extrema", 150, 1, false, 8.00);
		
		publicaciones[0] = lib0;
		publicaciones[1] = lib1;
		publicaciones[2] = lib2;
		publicaciones[3] = lib3;
		publicaciones[4] = lib4;
		publicaciones[5] = lib5;
		publicaciones[6] = lib6;
		publicaciones[7] = lib7;
		publicaciones[8] = lib8;
		publicaciones[9] = lib9;
		publicaciones[10] = rev0;
		publicaciones[11] = rev1;
		publicaciones[12] = rev2;
		publicaciones[13] = rev3;
		publicaciones[14] = rev4;
		
		System.out.println(publicaciones[0]);
		
		lib0.show();
		rev2.show();
	}
}
