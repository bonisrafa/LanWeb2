/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.service;

import com.mycompany.lanweb2.model.Sessao;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SessaoServiceTest {

    @Test
    void testIniciarSessaoEListar() {
        SessaoService service = new SessaoService();
        Sessao sessao = new Sessao(1, "Cliente1", 45);

        // Inicia uma sessão
        service.iniciarSessao(sessao);

        // Recupera a lista
        List<Sessao> sessoes = service.listarSessoes();

        // Testa se a sessão foi salva
        assertEquals(1, sessoes.size());
        assertEquals("Cliente1", sessoes.get(0).getCliente());
    }
}
