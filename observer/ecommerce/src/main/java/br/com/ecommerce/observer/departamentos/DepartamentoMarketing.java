package br.com.ecommerce.observer.departamentos;

import br.com.ecommerce.observer.model.Produto;
import br.com.ecommerce.observer.observer.ObservadorDePreco;

/*
 Papel: Observador concreto
*/
public class DepartamentoMarketing implements ObservadorDePreco {
    @Override
    public void atualizar(Produto produto) {
        System.out.println("[Marketing] Promoção atualizada para " + produto.getNome() +
                " | novo preço: R$ " + produto.getPreco());
    }
}
