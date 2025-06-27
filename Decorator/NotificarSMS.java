public class NotificarSMS extends NotificarDecorator {
    public NotificarSMS(Notificar envoltorio) {
        super(envoltorio);
    }

    @Override
    public String notificar(String mensaje) {
        String envoltorioMensaje = super.notificar(mensaje);
        return "Enviando SMS: " + mensaje+ ", " + envoltorioMensaje.toLowerCase();
        // Lógica específica para enviar un SMS
    }
}
