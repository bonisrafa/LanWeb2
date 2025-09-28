/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.controller;

import com.mycompany.lanweb2.model.Produto;
import com.mycompany.lanweb2.service.ProdutoService;

/**
 *
 * @author Rafaella
 */

public class ProdutoController {
    public final ProdutoService service = new ProdutoService();

    public void cadastrarProduto(String nome, double preco) {
        service.cadastrarProduto(nome, preco);
        System.out.println("Produto cadastrado: " + nome);
    }

    public void listarProdutos() {
        for (Produto p : service.listarProdutos()) {
            System.out.println(p);
        }
    }
}
