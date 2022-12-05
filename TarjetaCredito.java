public class TarjetaCredito extends Tarjeta{

    int Credito;
    int deuda;

    public TarjetaCredito( String numeroTarjeta, Fecha fecha, int NIP, boolean activada) {
        super( numeroTarjeta, fecha, NIP, activada);
        //TODO Auto-generated constructor stub

        this.Credito = 4600;
        this.deuda = 0;
    }

    public void Abonar(int monto){
        if(getActivada() == false){
            System.out.println("Tarjeta desactivada");
            return;
        }
        Credito += monto;
    }


    public int getCredito() {
        
        return Credito;
    }

    public void comprar(int monto){
        if(getActivada() == false){
            System.out.println("Tarjeta desactivada");
            return;
        }

        if(monto > Credito){
            System.out.println("Credito insuficiente");
        }

        Credito -= monto;
        System.out.println("Compra hecha por " + monto + " pesos, credito actual: " + Credito);
    }
    

    
    
}
