public class Tarjeta {

    
    private String numeroTarjeta;
    private Fecha fecha;
    private int NIP;
    private boolean activada;

    public Tarjeta( String numeroTarjeta, Fecha fecha, int NIP, boolean activada){
        
        this.numeroTarjeta = numeroTarjeta;
        this.fecha = fecha;
        this.NIP = NIP;
        this.activada = activada;
    }

    public boolean getActivada() {
        return activada;
    }

    public void Activada(Fecha fecha, int mes, int anio){
        if(fecha.getMes() == mes && fecha.getAno() == anio){
            System.out.println("Tarjeta activada");
            activada = true;
            return;
        }

        return;

    }


    
}
