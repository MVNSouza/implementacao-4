public class EstadoEmSeparacao implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pedido já esta pago.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        
        System.out.println("Parando processo de envio");
        pedido.setEstado(new EstadoCancelado());
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Pedido enviado a transportadora.");
        pedido.setEstado(new EstadoEnviado());
    }
}