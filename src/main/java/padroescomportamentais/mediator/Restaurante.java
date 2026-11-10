package padroescomportamentais.mediator;

public class Restaurante implements AppDelivery {

    private static Restaurante instancia = new Restaurante();

    private Restaurante() {}

    public static Restaurante getInstancia() {
        return instancia;
    }

    public String receberComentario(String mensagem) {
        return "O restaurante vai procurar acatar a sugestao e agradece: " + mensagem;
    }

    public String receberPedido(String mensagem) {
        return "A restaurante agradece o pedido: " + mensagem;
    }

    public String receberEstrelas(String mensagem) {
        return "A restaurante agradece as estrelas: " + mensagem;
    }
}
