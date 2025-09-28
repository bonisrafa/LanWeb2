/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.model;

/**
 *
 * @author Rafaella
 */




import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda de ").append(cliente.getNome()).append("\n");
        for (Produto p : produtos) {
            sb.append(" - ").append(p).append("\n");
        }
        sb.append("Total: R$").append(calcularTotal());
        return sb.toString();
    }
}
