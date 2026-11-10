package padroescomportamentais.mediator;

public class Pessoa {

    public String pedidoRestaurante(String mensagem) {
        return Central.getInstancia().receberPedido(mensagem);
    }

    public String notaRestaurante(String mensagem) {
        return Central.getInstancia().receberEstrelas(mensagem);
    }

    public String comentarioRestaurante(String mensagem) {
        return Central.getInstancia().receberComentario(mensagem);
    }


}
