/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_estatica;

/**
 *
 * @author Bruno
 */
public class TesteLista {

    public static void main(String args[]) {

        Lista lista = new Lista(); // inicializa a Lista

        lista.inserirPorElemento(10);
        lista.inserirPorElemento(20);
        lista.inserirPorPosicao(2, 30);
        lista.inserirPorPosicao(3, 40);
        lista.inserirPorPosicao(4, 50);
        lista.removerPorPosicao(1);
        lista.removerPorElemento(50);

        System.out.println("Lista está cheia? " + lista.estaCheia());
        System.out.println("Primeira posição " + lista.retornarElemento(0));

        lista.imprimir();
    }

}