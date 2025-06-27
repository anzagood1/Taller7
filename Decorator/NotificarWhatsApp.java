public class NotificarWhatsApp extends NotificarDecorator {
    public NotificarWhatsApp(Notificar envoltorio) {
        super(envoltorio);
    }

    @Override
    public String notificar(String mensaje) {
        String envoltorioMensaje = super.notificar(mensaje);
        return "Enviando WhatsApp: " + mensaje + ", " + envoltorioMensaje.toLowerCase();
        // Lógica para enviar un mensaje de WhatsApp
    }
}