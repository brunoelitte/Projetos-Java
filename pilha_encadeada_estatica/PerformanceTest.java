/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilha_encadeada_estatica;

/**
 *
 * @author Bruno
 */
import java.util.Random;

public class PerformanceTest {

    public static void main(String args[]) throws InterruptedException {

        Pilha pilha = new Pilha();

        while (true) {

            long inicio = System.currentTimeMillis();
            for(int i = 0; i < 1000; i++) {
                pilha.empilhar(new Random().nextInt());
            }

            long duracao = System.currentTimeMillis() - inicio;
            System.out.println("Duração: " + duracao);
            Thread.sleep(100);

        }

    }

}