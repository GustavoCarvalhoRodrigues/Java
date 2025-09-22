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
[DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o 
jogador vai tentar descobrir qual foi o valor sorteado.
*/
public class TrigesimoSegundoExercicio {
    public static void main(String[] args) throws InterruptedException{
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Só pode digitar um número de 1 até 5: ");
        int jogador = entrada.nextInt();
        
        System.out.print("Adv");
        Thread.sleep(500);
        System.out.print("inh");
        Thread.sleep(500);
        System.out.print("e");
        Thread.sleep(500);
        
        
        int computador = (int) (Math.random() * 5) + 1;
        String mensagem;
        
        if(jogador < 1 || jogador > 5){
            mensagem = "[ERRO] NÚMERO FORA DO RECOMENDADO";
        } else if(jogador == computador){
            mensagem = "JOGADOR ADVINHOU!";
        } else{
            mensagem = "JOGADOR NÃO ADVINHOU";
        }
        System.out.printf("%nJogador: %d | Computador: %d | Mensagem: %s%n", jogador, computador, mensagem);
        
        entrada.close();
    }
}
