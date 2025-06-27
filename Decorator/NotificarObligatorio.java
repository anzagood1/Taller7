public class NotificarObligatorio implements Notificar {
    private Notificar envoltorio;
    public NotificarObligatorio() {
        this.envoltorio = new NotificarDecorator(new NotificarSMS(null));
    }
    @Override
    public String notificar(String mensaje) {
        return envoltorio.notificar(mensaje);
    }
}