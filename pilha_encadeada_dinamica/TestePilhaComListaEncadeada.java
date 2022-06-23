/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha_encadeada_dinamica;

/**
 *
 * @author Bruno
 */

public class TestePilhaComListaEncadeada {

    public static void main(String args[]) {
        PilhaComListaEncadeada pilha = new PilhaComListaEncadeada();

        Integer desempilhar1 = pilha.desempilhar();

        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        pilha.empilhar(6);
        pilha.empilhar(7);
        pilha.empilhar(8);
        pilha.empilhar(9);
        pilha.empilhar(10);

        pilha.empilhar(pilha.topo());

        pilha.desempilhar();
        pilha.desempilhar();

        System.out.println("Apresentar o topo da pilha: " + pilha.topo());
        System.out.println("Quantidade de elementos: " + pilha.retornarQuantidadeDeElementos());

        pilha.imprimir();
    }


}