package cuadricula;

public class Array2D {

// Propiedades 
    private int filas;
    private int cols;
    private int [][] array;

// Constructores

    public Array2D(int filas, int cols) {
        // filas y columnas entre 0 y 10
        this.filas = filas < 0 ? 0: filas > 10 ? 10 : filas;
        this.cols = cols < 0 ? 0: cols > 10 ? 10 : cols;
        this.array = new int[filas][cols];
    }
    
    public Array2D(int dimension) {
        this(dimension, dimension);
    }   

// Getter
    public int[] getDimensions() {
        int[] dimensiones = {filas, cols};
        return dimensiones;
    }

// NO Setter
    
// MÃ©todos privados
    private int numCifras() {
        int max = 0;
        for (int[] f : array)
            for (int elem : f)
                if(elem > max) 
                    max = elem;
        return ("" + max).length(); 
    }
    
    private static String getString(int size, int value, boolean hideZeros) {
        String stringValue = (hideZeros && value == 0) ? "" : "" + value;
        String spaces = "";
        for (int i = 0; i < size - stringValue.length() ; i++)
            spaces += " ";
        return spaces + stringValue;
    }            

// MÃ©todos pÃºblicos show 
    
    public void show(){
        show(false); 
    }
    
    public void show(boolean hideZeros){
        for (int f = 0; f < filas; f++) {
            System.out.print("| ");
            for (int c = 0; c < cols; c++) {
                System.out.print(getString(numCifras(), array[f][c], hideZeros) + " ");
            }
            System.out.println("|");
        }
        System.out.println("[" + filas + " x " + cols + "]\n"); 
    }
    
    public static void show(Array2D [ ] array, boolean hideZeros){
        for (Array2D unArray2D :array) {
            unArray2D.show(hideZeros);
        }
    }
    
    public static void show(Array2D [ ] array){
        show(array, false);
    }
    
    
// MÃ©todos pÃºblicos set fila, columna y borde  

    public boolean setFila(int fila, int valor){
        if (valor < 0 || fila < 0 || fila >= filas) return false;
        for (int c = 0; c < cols; c ++)
            array[fila][c] = valor;
        return true;
    }
    
    public static boolean[] setFila(Array2D [ ] array, int fila, int valor){
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].setFila(fila, valor);
        return result;
    }
    
    public boolean setCol(int col, int value){
        if (value < 0 || col < 0 || col >= cols) return false;
        for (int f = 0; f < filas; f ++)
            array[f][col] = value;
        return true;
    }
    
    public static boolean[] setCol(Array2D [ ] array, int col, int valor){
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].setCol(col, valor);
        return result;
    }
    
    public boolean setBorde(int valor){
        if (valor < 0 || filas <= 1 || cols <= 1) return false;
        setCol(0, valor);
        setCol(cols - 1, valor);
        setFila(filas - 1, valor);
        setFila(0, valor);
        return true;
    }
    
    public static boolean[] setBorde(Array2D [ ] array, int valor){
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].setBorde(valor);
        return result;
    }
    
// 
    
    
    public boolean reset(int valor, boolean aleatorio, int valorMax){
        if (valor < 0 || valorMax < 0 || filas < 1 || cols < 1) return false;
        for (int f = 0; f < filas; f++)
            for (int c = 0; c < cols; c++)
               array[f][c] = aleatorio ? (int)(Math.random() * valorMax) : valor;
        return true;
    }
    
    public static boolean [ ] reset(Array2D [ ] array, int valor, boolean aleatorio, int valorMax){
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            result[i] = array[i].reset(valor, aleatorio, valorMax);
        return result;
    }
      
    public static void main(String[] args) {
        Array2D a1 = new Array2D(4, 3);
        a1.show();
        a1.reset(1, true, 25);
        a1.show();
    }
}
