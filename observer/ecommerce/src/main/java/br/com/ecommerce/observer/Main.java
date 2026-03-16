package br.com.ecommerce.observer;

import br.com.ecommerce.observer.departamentos.DepartamentoLogistica;
import br.com.ecommerce.observer.departamentos.DepartamentoMarketing;
import br.com.ecommerce.observer.departamentos.DepartamentoVendas;
import br.com.ecommerce.observer.model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook Gamer", 5000.00);

        DepartamentoMarketing marketing = new DepartamentoMarketing();
        DepartamentoVendas vendas = new DepartamentoVendas();
        DepartamentoLogistica logistica = new DepartamentoLogistica();

        notebook.adicionarObservador(marketing);
        notebook.adicionarObservador(vendas);
        notebook.adicionarObservador(logistica);

        System.out.println("=== Primeira alteração de preço ===");
        notebook.setPreco(4700.00);

        notebook.removerObservador(logistica);

        System.out.println("\n=== Segunda alteração de preço (sem logística) ===");
        notebook.setPreco(4500.00);
    }
}
