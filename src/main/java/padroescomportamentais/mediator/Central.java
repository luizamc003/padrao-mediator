package padroescomportamentais.mediator;

public class Central {

    private static Central instancia = new Central();

    private Central() {}

    public static Central getInstancia() {
        return instancia;
    }

    public String receberPedido(String mensagem) {
        return "A central agradece seu contato.\n"+
                "A Central confirma seu pedido.\n" +
                ">>" + Restaurante.getInstancia().receberPedido(mensagem);
    }

    public String receberEstrelas(String mensagem) {
        return "A central agradece seu contato.\n"+
                "O restaurante confirma as estrelas.\n" +
                ">>" + Restaurante.getInstancia().receberEstrelas(mensagem);
    }

    public String receberComentario(String mensagem) {
        return "A Central agradece seu contato.\n"+
                "O restaurante irá analisar seu comentário.\n" +
                ">>" + Restaurante.getInstancia().receberComentario(mensagem);
    }

}
