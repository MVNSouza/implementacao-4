public class EstadoCancelado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido cancelado não pode ser pago.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido já está cancelado.");
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido cancelado não pode ser despachado.");
    }
}