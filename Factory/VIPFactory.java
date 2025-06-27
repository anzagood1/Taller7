public class VIPFactory extends CardFactory{
  @Override
  public Tarjeta crearTarjeta(){
    //Creacion de tarjeta basica
    return new TarjetaVIP;
  }
}
