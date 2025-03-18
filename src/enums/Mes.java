package enums;

public enum Mes {
    
    ENE("Enero" ,"January" , 1), FEB("Febrero" ,"February" , 2), 
    MAR("Marzo" ,"March" , 3), ABR("Abril" ,"April" , 4);
    
    private String nombreSP;
    private String nombreEN;
    private int numero;

    private Mes(String nombreSP, String nombreEN, int numero) {
        this.nombreSP = nombreSP;
        this.nombreEN = nombreEN;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Mes{" + "nombreSP=" + nombreSP + ", nombreEN=" + nombreEN + ", numero=" + numero + '}';
    }
    
    public static String dameDatosPorMes(Mes mes){
        return "Mes{" + "nombreSP=" + mes.nombreSP + ", nombreEN=" + mes.nombreEN + ", numero=" + mes.numero + '}';
    }
    
    public static String dameNombresPorNumero(int numero){
        for (Mes mes : Mes.values()) {
            if(mes.numero == numero) {
                return mes.nombreEN + mes.nombreSP;
            }
        }
        return "Valor no encontrado";
    }  
}