public class NotificarCorreo extends NotificarDecorator {
    public NotificarCorreo(Notificar envoltorio) {
        super(envoltorio);
    }

    @Override
    public String notificar(String mensaje) {
        String envoltorioMensaje = super.notificar(mensaje);
        return "Enviando correo: " + mensaje+ ", " + envoltorioMensaje.toLowerCase();
        //Logica para enviar un correo
    }
    
}
