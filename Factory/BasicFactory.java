public class BasicFactory extends CardFactory{
  @Override
  public Tarjeta crearTarjeta(){
    //Creacion de tarjeta basica
    return new TarjetaBasica;
  }
}
