public class Pedido {
    private EstadoPedido estadoAtual;

    public Pedido() {
    
        this.estadoAtual = new EstadoAguardandoPagamento();
    }


    public void setEstado(EstadoPedido novoEstado) {
        this.estadoAtual = novoEstado;
        System.out.println("[LOG] Transição de estado para: " + novoEstado.getClass().getSimpleName());
    }

    // Delegação pura: o Pedido não tem "if"
    public void pagar() {
        estadoAtual.pagar(this);
    }

    public void cancelar() {
        estadoAtual.cancelar(this);
    }

    public void despachar() {
        estadoAtual.despachar(this);
    }
}