public class NotificarDecorator implements Notificar {
    protected Notificar envoltorio;

    public NotificarDecorator(Notificar envoltorio) {
        this.envoltorio = envoltorio;
    }

    @Override
    public String notificar(String mensaje) {
        if (envoltorio != null) {
            envoltorio.notificar(mensaje);
        }
        return mensaje;
    }
}
