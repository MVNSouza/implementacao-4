package br.com.ecommerce.observer.model;

import java.util.ArrayList;
import java.util.List;

import br.com.ecommerce.observer.observer.ObservadorDePreco;

/*
 Papel: classe Publisher
*/
public class Produto {
    private String nome;
    private double preco;
    private final List<ObservadorDePreco> observadores = new ArrayList<>();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void adicionarObservador(ObservadorDePreco observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorDePreco observador) {
        observadores.remove(observador);
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorDePreco observador : observadores) {
            observador.atualizar(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
