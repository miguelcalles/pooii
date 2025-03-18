package _collections;

public enum Color {
	RO("rojo"), NA("naranja"), AMA("amarillo"), VE("verde"), AZ("azul"), IN("indigo"), VI("violeta");
	
	private String color;

	private Color(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color;
	}
	
}
