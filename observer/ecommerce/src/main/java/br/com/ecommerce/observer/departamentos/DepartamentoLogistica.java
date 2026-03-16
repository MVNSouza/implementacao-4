package br.com.ecommerce.observer.departamentos;

import br.com.ecommerce.observer.model.Produto;
import br.com.ecommerce.observer.observer.ObservadorDePreco;

/*
 Papel: Observador concreto 
*/
public class DepartamentoLogistica implements ObservadorDePreco {
    @Override
    public void atualizar(Produto produto) {
        System.out.println("[Logística] Seguro de frete recalculado para " + produto.getNome() +
                " | novo preço: R$ " + produto.getPreco());
    }
}
