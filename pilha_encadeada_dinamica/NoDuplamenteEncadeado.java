/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha_encadeada_dinamica;

/**
 *
 * @author Bruno
 */
public class NoDuplamenteEncadeado {

    private int elemento;
    private NoDuplamenteEncadeado proximo;
    private NoDuplamenteEncadeado anterior;

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NoDuplamenteEncadeado getProximo() {
        return proximo;
    }

    public void setProximo(NoDuplamenteEncadeado proximo) {
        this.proximo = proximo;
    }

    public NoDuplamenteEncadeado getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDuplamenteEncadeado anterior) {
        this.anterior = anterior;
    }
}