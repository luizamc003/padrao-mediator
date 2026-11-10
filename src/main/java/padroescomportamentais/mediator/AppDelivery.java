package padroescomportamentais.mediator;

public interface AppDelivery {
    String receberComentario(String mensagem);
    String receberEstrelas(String mensagem);
    String receberPedido(String mensagem);
}
