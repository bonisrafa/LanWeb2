/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.service;

/**
 *
 * @author Rafaella
 */

import com.mycompany.lanweb2.model.Produto;
import com.mycompany.lanweb2.repository.ProdutoRepository;
import java.util.List;

public class ProdutoService {
    private ProdutoRepository repo = new ProdutoRepository();

    public void cadastrarProduto(String nome, double preco) {
        Produto p = new Produto(nome, preco);
        repo.salvar(p);
    }

    public List<Produto> listarProdutos() {
        return repo.buscarTodos();
    }
}
