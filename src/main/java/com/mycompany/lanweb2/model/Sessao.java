/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.model;

public class Sessao {
    private int id;
    private String cliente;
    private int minutos;

    public Sessao(int id, String cliente, int minutos) {
        this.id = id;
        this.cliente = cliente;
        this.minutos = minutos;
    }

    public Sessao(int i, Cliente cliente1, Computador computador1, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Sessao{id=" + id + ", cliente=" + cliente + ", minutos=" + minutos + "}";
    }
}
