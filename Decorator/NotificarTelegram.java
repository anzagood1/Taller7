public class NotificarTelegram extends NotificarDecorator {
    public NotificarTelegram(Notificar envoltorio) {
        super(envoltorio);
    }
    @Override
    public String notificar(String mensaje) {
        String envoltorioMensaje = super.notificar(mensaje);
        return "Enviando Telegram: " + mensaje+ ", " + envoltorioMensaje.toLowerCase();
        // Lógica específica para enviar un SMS
    }
}


