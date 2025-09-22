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
/*
[DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura) 
*/

public class TrigesimoPrimeiroExercicio {
    public static void main(String[] args) throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("______" + " JOKENPO " + "______");
        
        System.out.print("JOKENPO [0]PEDRA | [1]PAPEL | [2]TESOURA: ");
        int escolha = entrada.nextInt();
        
        
        int computador = (int) (Math.random() * 3);
        String mensagem;
        
        System.out.print("JO");
        Thread.sleep(500);
        System.out.print("...KEN");
        Thread.sleep(500);
        System.out.print("...PO!");
        Thread.sleep(500);
        System.out.println();
        
        if(escolha == computador){
            mensagem = "EMPATE";
        } else if(escolha == 0 && computador == 1 || escolha == 1 
                && computador == 2 || escolha == 2 && computador == 0){
            mensagem = "JOGADOR PERDEU";
        } else {
            mensagem = "JOGADOR GANHOU";
        }
        
        System.out.printf("O jogador escolheu: %d%n", escolha);
        System.out.printf("O computador jogou: %d%n", computador);
        System.out.print(mensagem);
        
        entrada.close();
    }
}
