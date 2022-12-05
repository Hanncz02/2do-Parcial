public class main {
    
    public static void main(String[] args) {
        Fecha fechavenc = new Fecha(2027, 9);
        Fecha nacimiento = new Fecha(2002, 12);

        TarjetaCredito tarjeta1 = new TarjetaCredito( "41253260", fechavenc, 5243, false);
        TarjetaDebito tarjeta2 = new TarjetaDebito("45209028", fechavenc, 4560, false);
        cliente cliente1 = new cliente("Juan Perez", nacimiento, tarjeta1, tarjeta2);

        cliente1.getMiTarjetaD().Activada(nacimiento, 12, 2002);
        cliente1.getMiTarjetaC().Activada(nacimiento, 12, 2002);

        cliente1.getMiTarjetaC().comprar(5000);
        cliente1.getMiTarjetaD().abonar(5000);
        cliente1.getMiTarjetaD().Comprar(1000);
        
    }
}
