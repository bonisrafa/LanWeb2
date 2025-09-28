/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.service;

/**
 *
 * @author Rafaella
 */



import com.mycompany.lanweb2.model.Venda;
import com.mycompany.lanweb2.repository.VendaRepository;
import java.util.List;

public class VendaService {
    private final VendaRepository repo = new VendaRepository();

    public void registrarVenda(Venda venda) {
        repo.salvar(venda);
        System.out.println("Venda registrada: " + venda);
    }

    public List<Venda> listarVendas() {
        return repo.buscarTodos();
    }
}
