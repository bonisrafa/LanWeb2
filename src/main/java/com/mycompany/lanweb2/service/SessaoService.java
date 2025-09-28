/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.service;




import com.mycompany.lanweb2.model.Sessao;
import com.mycompany.lanweb2.repository.SessaoRepository;
import java.util.List;

public class SessaoService {
    private final SessaoRepository repo = new SessaoRepository();

    public void iniciarSessao(Sessao sessao) {
        repo.salvar(sessao);
        System.out.println("Sessão iniciada: " + sessao);
    }

    public List<Sessao> listarSessoes() {
        return repo.buscarTodos();
    }
}
