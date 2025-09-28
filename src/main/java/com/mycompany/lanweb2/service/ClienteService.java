/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.service;

/**
 *
 * @author Rafaella
 */



import com.mycompany.lanweb2.model.Cliente;
import com.mycompany.lanweb2.repository.ClienteRepository;
import java.util.List;

public class ClienteService {
    private ClienteRepository repo = new ClienteRepository();

    public void cadastrarCliente(String nome, int idade) {
        Cliente c = new Cliente(nome, idade);
        repo.salvar(c);
    }

    public List<Cliente> listarClientes() {
        return repo.buscarTodos();
    }
}
