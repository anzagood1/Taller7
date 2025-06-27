public class Cliente{
    public static void main(String[] args){
        Facade canalWeb= new FacadeWeb();
        canalWeb.consultarProductos();
        canalWeb.comprarProductos();

        Facade canalMovil= new FacadeMovil();
        canalMovil.consultarProductos();
        canalMovil.comprarProductos();

        Facade canalTelefonico= new FacadeTelefonico();
        canalTelefonico.consultarProductos();
        canalTelefonico.comprarProductos();

    }
}
