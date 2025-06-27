public class PremiumFactory extends CardFactory{
  @Override
  public Tarjeta crearTarjeta(){
    //Creacion de tarjeta basica
    return new TarjetaPremium;
  }
}
