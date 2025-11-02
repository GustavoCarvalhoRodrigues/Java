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
/*  Desenvolva um programa que leia o primeiro termo e a razão de uma 
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e 
a soma entre todos os valores da sequência. */
public class SextagesimoNonoExercicio {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite o elemento: ");
        int primeiro = entrada.nextInt();
        
        System.out.print("Digite a razão: ");
        int razao = entrada.nextInt();
       
         int termo = primeiro;
         int soma = 0;
        
        System.out.println("\nOs 10 primeiros elementos da PA: ");
        for(int i = 1; i <= 10; i++){
            System.out.print(termo + " ");
            soma += termo;
            termo += razao;
        }
        
        System.out.printf("%nSoma entre todos os valores da sequência: %d%n", soma);
        
        entrada.close();
    }
}
