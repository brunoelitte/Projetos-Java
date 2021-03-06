/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista_duplamente_encadeada;

/**
 *
 * @author Bruno
 */

public class ListaDuplamententeEncadeada {

    private NoDuplamenteEncadeado primeiro = null;
    private NoDuplamenteEncadeado ultimo = null;
    private int quantidade = 0;

    public void inserirNoInicio(int elemento) {
        NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado();
        novoNo.setElemento(elemento);
        novoNo.setProximo(primeiro);

        if(quantidade == 0) {
            ultimo = novoNo;
        } else {
            primeiro.setAnterior(novoNo);
        }

        primeiro = novoNo;

        quantidade++;
    }

    public void inserirNoFinal(int elemento) {
        if(quantidade == 0) {
            inserirNoInicio(elemento);
        } else {
            NoDuplamenteEncadeado novoNo = new NoDuplamenteEncadeado();
            novoNo.setElemento(elemento);
            novoNo.setProximo(null);
            novoNo.setAnterior(ultimo);
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
            quantidade++;
        }
    }

    /**
     * Insere elemento na posição, substituindo elemento atual
     *
     * @param posicao
     * @param elemento
     */
    public void inserirNaPosicao(int posicao, int elemento) {
        if (quantidade == 0) {
            inserirNoInicio(elemento);
        } else if(posicao == quantidade) {
            inserirNoFinal(elemento);
        } else {
            NoDuplamenteEncadeado noNaPosicao = buscarNoNaPosicao(posicao);
            noNaPosicao.setElemento(elemento);
        }
    }


    public void removerNoInicio() {
        if(quantidade == 0) {
            return;
        }

        primeiro = primeiro.getProximo();
        primeiro.setAnterior(null);
        quantidade--;

        if(quantidade == 0) {
            ultimo = null;
        }
    }

    public void removerNoFinal() {
        if(quantidade == 0) {
            return;
        }

        if(quantidade == 1) {
            removerNoInicio();
        } else {
            NoDuplamenteEncadeado anterior = ultimo.getAnterior();
            anterior.setProximo(null);
            ultimo = anterior;
            quantidade--;
        }
    }

    public void removerNaPosicao(int posicao) {
        if (quantidade == 0) {
            removerNoInicio();
        } else if(posicao == quantidade) {
            removerNoFinal();
        } else {
            NoDuplamenteEncadeado noNaPosicaoAtual = buscarNoNaPosicao(posicao);
            NoDuplamenteEncadeado noNaPosicaoAnterior = noNaPosicaoAtual.getAnterior();

            NoDuplamenteEncadeado proximo = noNaPosicaoAtual.getProximo();
            if(proximo != null) {
                noNaPosicaoAnterior.setProximo(proximo);
                proximo.setAnterior(noNaPosicaoAnterior);
            } else {
                noNaPosicaoAnterior.setProximo(null);
                ultimo = noNaPosicaoAnterior;
            }


            quantidade--;
        }
    }

    public NoDuplamenteEncadeado buscarNoNaPosicao(int posicao) {
        if(!existeElementoNaPosicao(posicao)) {
            throw new RuntimeException("Posição não existente");
        }

        NoDuplamenteEncadeado atual = primeiro;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    private boolean existeElementoNaPosicao(int posicao){
        return posicao >= 0 && posicao < quantidade;
    }

    public int retornarQuantidadeDeElementos() {
        return quantidade;
    }

    public void imprimir() {
        if(quantidade == 0) {
            System.out.println("Lista vazia []");
            return;
        }

        String elementos = retornarElementos();
        System.out.println("Elementos da lista"+elementos.toString());
    }

    String retornarElementos() {
        StringBuilder elementos = new StringBuilder("[");

        NoDuplamenteEncadeado atual = primeiro;

        while (atual.getProximo() != null) {
            elementos.append(atual.getElemento());
            elementos.append(" ");
            atual = atual.getProximo();
        }

        elementos.append(atual.getElemento());

        elementos.append("]");
        return elementos.toString();
    }

    public NoDuplamenteEncadeado getPrimeiro() {
        return primeiro;
    }

    public NoDuplamenteEncadeado getUltimo() {
        return ultimo;
    }
}