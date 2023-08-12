package com.cursodio.Carrinho;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private ArrayList<CarrinhoCompras> listaItens;

    public Item() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new CarrinhoCompras(nome, preco, quantidade));
    }

    public void removerItem(String nome, double preco, int quantidade) {
        List<CarrinhoCompras> removerCarrinho = new ArrayList<>();
        for (CarrinhoCompras c : listaItens) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                removerCarrinho.add(c);
            }
        }
        listaItens.removeAll(removerCarrinho);
    }

    public void calcularTotal(double preco) {
        double sum = 0;

        List<CarrinhoCompras> totalCarrinhoCompras = new ArrayList<>();
        for (CarrinhoCompras c : listaItens) {
            sum += c.getPreco() * c.getQuantidade();
        }
        System.out.println("Total: " + sum);
    }

    public int totalItens() {
        return listaItens.size();
    }

    public void obterItens() {
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        Item itens = new Item();
        itens.obterItens();
        itens.adicionarItem("Arroz", 10.99, 2);
        itens.obterItens();
        itens.adicionarItem("Macarrao", 5.99, 2);
        itens.obterItens();
        itens.calcularTotal(0);
    }

}
