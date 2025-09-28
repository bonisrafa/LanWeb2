/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.controller;

import com.mycompany.lanweb2.model.Venda;
import com.mycompany.lanweb2.service.VendaService;

/**
 *
 * @author Rafaella
 */


public class VendaController {
    private final VendaService service = new VendaService();

    public void registrarVenda(Venda venda) {
        service.registrarVenda(venda);
    }

    public void listarVendas() {
        for (Venda v : service.listarVendas()) {
            System.out.println(v);
        }
    }
}
