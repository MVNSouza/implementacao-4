public class EstadoEnviado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já foi pago.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        
        System.out.println("O produto já foi despachado.");
        System.out.println("Por favor, inicie o processo de 'Logistica Reversa'.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("O pedido já consta como enviado.");
    }
}