/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_duplamente_encadeada;

/**
 *
 * @author Bruno
 */
public class TesteListaDuplamenteEncadeada {

    public static void main(String args[]) {
        ListaDuplamententeEncadeada listaDuplamententeEncadeada = new ListaDuplamententeEncadeada();

//        listaDuplamententeEncadeada.inserirNoInicio(20);
//        listaDuplamententeEncadeada.inserirNoInicio(10);
//
//        listaDuplamententeEncadeada.inserirNoFim(30);
//        listaDuplamententeEncadeada.inserirNoFim(50);
//        listaDuplamententeEncadeada.inserirNaPosicao(3, 40);

//        listaDuplamententeEncadeada.removerNoComeco();
//        listaDuplamententeEncadeada.removerNoFim();

        listaDuplamententeEncadeada.inserirNaPosicao(0, 10);
        listaDuplamententeEncadeada.inserirNaPosicao(1, 20);
        listaDuplamententeEncadeada.inserirNaPosicao(2, 30);
        listaDuplamententeEncadeada.inserirNaPosicao(3, 40);

        listaDuplamententeEncadeada.inserirNaPosicao(1, 99);
        listaDuplamententeEncadeada.removerNaPosicao(1);


        listaDuplamententeEncadeada.imprimir();


    }

}