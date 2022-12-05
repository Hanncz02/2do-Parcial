public class TarjetaDebito extends Tarjeta {

    public TarjetaDebito(String numeroTarjeta, Fecha fecha, int NIP, boolean activada) {
        super(numeroTarjeta, fecha, NIP, activada);
        //TODO Auto-generated constructor stub
    }

    int saldo;
    
    
    public void Comprar(int monto){
        if(getActivada() == false){
            System.out.println("Tarjeta desactivada");
            return;
        }

        if(monto > saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo -= monto;
        System.out.println("Compra hecha por " + monto + " pesos, tu saldo actual es: " + saldo);
        return;

    }

    public void abonar(int monto){
        if(getActivada() == false){
            System.out.println("Tarjeta desactivada");
            return;
        }
        saldo += monto;
        System.out.println("Tu saldo es $" + saldo);
    }

    public int getSaldo() {
        return saldo;
    }

    

}
