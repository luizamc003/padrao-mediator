package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveFazerPedidoRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("A central agradece seu contato.\n" +
                        "A Central confirma seu pedido.\n" +
                        ">>A restaurante agradece o pedido: Pizza",
                cliente.pedidoRestaurante("Pizza"));
    }

    @Test
    void deveDarNotaRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("A central agradece seu contato.\n" +
                        "O restaurante confirma as estrelas.\n" +
                        ">>A restaurante agradece as estrelas: 5 estrelas",
                cliente.notaRestaurante("5 estrelas"));
    }

    @Test
    void deveComentarRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("A Central agradece seu contato.\n" +
                        "O restaurante irá analisar seu comentário.\n" +
                        ">>O restaurante vai procurar acatar a sugestao e agradece: Comida chegou fria",
                cliente.comentarioRestaurante("Comida chegou fria"));
    }
}