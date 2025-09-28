/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.controller;

import com.mycompany.lanweb2.model.Cliente;
import com.mycompany.lanweb2.service.ClienteService;

/**
 *
 * @author Rafaella
 */


public class ClienteController {
    public final ClienteService service = new ClienteService();

    public void cadastrarCliente(String nome, int idade) {
        service.cadastrarCliente(nome, idade);
        System.out.println("Cliente cadastrado: " + nome);
    }

    public void listarClientes() {
        for (Cliente c : service.listarClientes()) {
            System.out.println(c);
        }
    }
}
