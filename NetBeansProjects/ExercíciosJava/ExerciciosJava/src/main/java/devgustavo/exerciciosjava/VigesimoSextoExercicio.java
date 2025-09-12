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

/*  Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando 
na tela uma das mensagens abaixo: 
- O primeiro valor é o maior 
- O segundo valor é o maior 
- Não existe valor maior, os dois são iguais */
public class VigesimoSextoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = entrada.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int segundoNumero = entrada.nextInt();
        
        String mensagem;
        
        if(primeiroNumero == segundoNumero){
            mensagem = "NÃO EXISTE VALOR MAIOR, OS DOIS SÃO IGUAIS";
        } else if(primeiroNumero > segundoNumero) {
            mensagem = "O PRIMEIRO VALOR É O MAIOR";
        } else {
            mensagem = "O SEGUNDO VALOR É O MAIOR";
        }
        System.out.printf("Primeiro valor: %d | Segundo valor: %d | %s%n", 
                primeiroNumero, segundoNumero, mensagem);
        
        entrada.close();
    }
}
