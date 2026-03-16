public class Main {
    public static void main(String[] args) {
        
        System.out.println("CENÁRIO 1: CANCELAMENTO DIRETO (NOVO) ===");
        Pedido p1 = new Pedido();
        p1.cancelar();

        System.out.println("\nCENÁRIO 2: CANCELAMENTO EM SEPARAÇÃO ===");
        Pedido p2 = new Pedido();
        p2.pagar();    
        p2.cancelar(); 

        System.out.println("\nCENÁRIO 3: CANCELAMENTO PÓS-ENVIO ===");
        Pedido p3 = new Pedido();
        p3.pagar();    
        p3.despachar(); 
        p3.cancelar(); 

        System.out.println("\nCENÁRIO 4: SEGURANÇA DE FLUXO ===");
        Pedido p4 = new Pedido();
        p4.despachar(); 
    }
}