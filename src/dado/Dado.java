package dado;

import java.util.Random;

public class Dado {
	
	private int lanzamiento;
	private int caras;
	private int[] historico;
	
	public Dado(int caras, int elementosDelHistorico) {
		this.caras = caras;
		historico = new int[elementosDelHistorico];
	}
	
	public void mostrarHistorico() {
		for(int tirada: historico) {
			if(tirada != 0) {
				System.out.printf("%d ", tirada);
			}
		}
	}
	
	public int lanzar() {
		Random random = new Random();
		lanzamiento = random.nextInt(1, caras);
		
		for(int i = 1; i < historico.length; i++) {
			historico[i - 1] = historico[i];
		}
		historico[historico.length - 1] = lanzamiento;
		
		return lanzamiento;
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado(6, 10);
		for(int i = 0; i < 10; i++) {
			d1.lanzar(); 
		}
		d1.mostrarHistorico();
	}
	
}
