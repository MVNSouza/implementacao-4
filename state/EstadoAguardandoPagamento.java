public class EstadoAguardandoPagamento implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento aprovado. Movendo para separação.");
        pedido.setEstado(new EstadoEmSeparacao());
    }

    @Override
    public void cancelar(Pedido pedido) {
        // Regra: Cancelamento feito na hora
        System.out.println("Cancelamento realizado com sucesso (Pedido ainda não pago).");
        pedido.setEstado(new EstadoCancelado());
    }

    @Override
    public void despachar(Pedido pedido) {
        System.out.println("Não é possível despachar sem pagamento.");
    }
}