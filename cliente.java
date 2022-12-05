public class cliente {
    
    private String nombre;
    private Fecha fecha;
    TarjetaCredito miTarjetaC;
    TarjetaDebito miTarjetaD;

    public cliente(String unNombre, Fecha unaFecha, TarjetaCredito unaTarjeta,TarjetaDebito otraTarjeta){

        nombre = unNombre;
        fecha = unaFecha; 
        miTarjetaC = unaTarjeta;
        miTarjetaD = otraTarjeta;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public TarjetaCredito getMiTarjetaC() {
        return miTarjetaC;
    }
    public TarjetaDebito getMiTarjetaD() {
        return miTarjetaD;
    }
    public String getNombre() {
        return nombre;
    }



}


