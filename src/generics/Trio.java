package generics;

public class Trio <T, S, R>{
	private T elemento1;
	private S elemento2;
	private R elemento3;
	
	public Trio(T elemento1, S elemento2, R elemento3) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
		this.elemento3 = elemento3;
	}

	@Override
	public String toString() {
		return "Trio [elemento1=" + elemento1 + ", elemento2=" + elemento2 + ", elemento3=" + elemento3 + "]";
	}

	public T getElemento1() {
		return elemento1;
	}

	public S getElemento2() {
		return elemento2;
	}

	public R getElemento3() {
		return elemento3;
	}
	
	public static void main(String[] args) {
		Trio<String, String, String> t1 = new Trio<>("uno", "dos", "tres");
		System.out.println(t1);
		
	}
}
