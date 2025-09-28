/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.repository;

/**
 *
 * @author Rafaella
 */



import com.mycompany.lanweb2.model.Venda;
import java.util.ArrayList;
import java.util.List;

public class VendaRepository {
    private final List<Venda> vendas = new ArrayList<>();

    public void salvar(Venda venda) {
        vendas.add(venda);
    }

    public List<Venda> buscarTodos() {
        return vendas;
    }
}
