/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lanweb2.model;

/**
 *
 * @author Rafaella
 */


public class Computador {
    private int id;
    private boolean ocupado;

    public Computador(int id) {
        this.id = id;
        this.ocupado = false;
    }

    public int getId() { return id; }
    public boolean isOcupado() { return ocupado; }
    public void setOcupado(boolean ocupado) { this.ocupado = ocupado; }

    @Override
    public String toString() {
        return "Computador " + id + " - " + (ocupado ? "Ocupado" : "Livre");
    }
}
