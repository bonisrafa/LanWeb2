/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.controller;

import com.mycompany.lanweb2.model.Sessao;
import com.mycompany.lanweb2.service.SessaoService;

/**
 *
 * @author Rafaella
 */




public class SessaoController {
    private final SessaoService service = new SessaoService();

    public void iniciarSessao(Sessao sessao) {
        service.iniciarSessao(sessao);
    }

    public void listarSessoes() {
        for (Sessao s : service.listarSessoes()) {
            System.out.println(s);
        }
    }
}

