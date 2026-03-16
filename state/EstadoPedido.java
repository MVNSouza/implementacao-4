public interface EstadoPedido {
    void pagar(Pedido pedido);
    void cancelar(Pedido pedido);
    void despachar(Pedido pedido);
}