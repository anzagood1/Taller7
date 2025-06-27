public class NotificarWire extends NotificarDecorator {
    private Notificar envoltorio;

    public NotificarWire(Notificar envoltorio) {
        super(envoltorio);
    }

    @Override
    public String notificar(String mensaje) {
        String envoltorioMensaje = envoltorio.notificar(mensaje);
        return "Notificación enviada a través de Wire: " + mensaje + ", " + envoltorioMensaje.toLowerCase();
    }
}