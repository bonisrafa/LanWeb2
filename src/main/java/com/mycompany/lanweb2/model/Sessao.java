/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.model;

/**
 *
 * @author Rafaella
 */




public class Sessao {
    private Cliente cliente;
    private Computador computador;
    private int horas;

    public Sessao(Cliente cliente, Computador computador, int horas) {
        this.cliente = cliente;
        this.computador = computador;
        this.horas = horas;
        this.computador.setOcupado(true); // marca computador como ocupado
    }

    public Cliente getCliente() { return cliente; }
    public Computador getComputador() { return computador; }
    public int getHoras() { return horas; }

    public double calcularValor(double valorPorHora) {
        return horas * valorPorHora;
    }

    public void encerrarSessao() {
        computador.setOcupado(false);
    }

    @Override
    public String toString() {
        return "Sessão de " + cliente.getNome() + " no " + computador + " por " + horas + "h";
    }
}
