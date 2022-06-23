/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvore;

/**
 *
 * @author Bruno
 */

import java.util.List;

public class NoArvore {

    private String valor;
    private NoArvore pai;
    private List<NoArvore> filhos;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public NoArvore getPai() {
        return pai;
    }

    public void setPai(NoArvore pai) {
        this.pai = pai;
    }

    public List<NoArvore> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<NoArvore> filhos) {
        this.filhos = filhos;
    }
}