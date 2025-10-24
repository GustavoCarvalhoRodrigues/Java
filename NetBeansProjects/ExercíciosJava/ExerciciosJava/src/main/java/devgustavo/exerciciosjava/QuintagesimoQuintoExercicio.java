/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
/*  [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de 
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4 
tentativas para tentar acertar.  */
public class QuintagesimoQuintoExercicio {
    public static void main(String[] args) throws InterruptedException{
        Scanner entrada = new Scanner(System.in);

        System.out.print("Adv");
        Thread.sleep(500);
        System.out.print("inh");
        Thread.sleep(500);
        System.out.print("e!!!\n");
        Thread.sleep(500);
        
        int jogo = (int) Math.floor(Math.random() * 10) + 1;
        boolean acertou = false;
        
        for(int tentativa = 1; tentativa <= 4; tentativa++){
            System.out.print("Tentativa " + tentativa + " de 4. Digite um número de 1 a 10: ");
            int jogador = entrada.nextInt();
        
            if(jogador < 1 || jogador > 10) {
                System.out.println("[ERRO] NÚMERO FORA DO RECOMENDADO (1 a 10)");
                break;
            }
        
            if(jogador == jogo){
                System.out.println("Parabéns! Você adivinhou o número " + jogo + "!");
                acertou = true;
                break;
            } else {
                System.out.println("Errou! Tente novamente.");
            }    
        }    
        
        if(!acertou){
            System.out.println("Você não conseguiu acertar. O número era " + jogo + ".");
        }
        
        entrada.close();
    }
}