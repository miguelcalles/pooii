package enumerados;

public enum Weekend {
    
    VI("viernes", 5), SA("sábado", 6), DO("domingo", 7);
    
    private String nombre;
    private int numero;

    private Weekend(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

}