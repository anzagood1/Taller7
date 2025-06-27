public class NotificarSignal extends NotificarDecorator {
    
    public NotificarSignal(Notificar envoltorio) {
        super(envoltorio);
    }
    @Override
    public String notificar(String mensaje) {
        String envoltorioMensaje = super.notificar(mensaje);
        return "Enviando Signal: " + mensaje+ ", " + envoltorioMensaje.toLowerCase();
        // Lógica específica para enviar un SMS
    }
}


