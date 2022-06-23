/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila.estatica;

/**
 *
 * @author Bruno
 */

// Classe com objetivo de testar a implementação de fila
public class TesteFila {

    public static void main(String args[]) {

        Fila fila = new Fila();

        System.out.println("Fila está vazia? " + fila.estaVazia());

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);

        fila.desenfileirar();
        fila.desenfileirar();

        System.out.println("Próximo da fila: " + fila.proximo());
        System.out.println("Quantidade de elementos da fila: " + fila.retornarQuantidadeDeElementos());

        fila.imprimir();
    }

}