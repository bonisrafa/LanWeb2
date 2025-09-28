/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.view;

import com.mycompany.lanweb2.controller.ClienteController;
import com.mycompany.lanweb2.controller.ProdutoController;
import com.mycompany.lanweb2.controller.SessaoController;
import com.mycompany.lanweb2.controller.VendaController;
import com.mycompany.lanweb2.model.Cliente;
import com.mycompany.lanweb2.model.Computador;
import com.mycompany.lanweb2.model.Sessao;
import com.mycompany.lanweb2.model.Venda;


public class Main {
    public static void main(String[] args) {
        // Controllers
        ClienteController clienteController = new ClienteController();
        ProdutoController produtoController = new ProdutoController();
        SessaoController sessaoController = new SessaoController();
        VendaController vendaController = new VendaController();

        // Cadastrando clientes
        clienteController.cadastrarCliente("Rafaella", 25);
        clienteController.cadastrarCliente("Lucas", 30);

        System.out.println("\nLista de Clientes:");
        clienteController.listarClientes();

        // Cadastrando produtos
        produtoController.cadastrarProduto("Coca-Cola", 5.0);
        produtoController.cadastrarProduto("Pizza", 20.0);

        System.out.println("\nLista de Produtos:");
        produtoController.listarProdutos();

        // Iniciando sessões
        Cliente cliente1 = clienteController.service.listarClientes().get(0);
        Computador computador1 = new Computador(1);
        Sessao sessao1 = new Sessao(cliente1, computador1, 3);
        sessaoController.iniciarSessao(sessao1);

        System.out.println("\nLista de Sessões:");
        sessaoController.listarSessoes();

        // Registrando venda
        Venda venda1 = new Venda(cliente1);
        venda1.adicionarProduto(produtoController.service.listarProdutos().get(0));
        venda1.adicionarProduto(produtoController.service.listarProdutos().get(1));
        vendaController.registrarVenda(venda1);

        System.out.println("\nLista de Vendas:");
        vendaController.listarVendas();
    }
}


