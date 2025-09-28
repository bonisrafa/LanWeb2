/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.repository;

/**
 *
 * @author Rafaella
 */



import com.mycompany.lanweb2.model.Sessao;
import java.util.ArrayList;
import java.util.List;

public class SessaoRepository {
    private final List<Sessao> sessoes = new ArrayList<>();

    public void salvar(Sessao sessao) {
        sessoes.add(sessao);
    }

    public List<Sessao> buscarTodos() {
        return sessoes;
    }
}

