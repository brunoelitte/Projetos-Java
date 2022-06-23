/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_estatica;

/**
 *
 * @author Bruno
 */
import java.util.Random;

public class PerformanceTest {

    public static void main(String args[]) throws InterruptedException {

        Lista lista = new Lista();

        while (true) {

            long inicio = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++) {
                lista.inserirPorElemento(new Random().nextInt());
            }

            long duracao = System.currentTimeMillis() - inicio;
            System.out.println("Duração: " + duracao);
            Thread.sleep(100);

        }

    }

}