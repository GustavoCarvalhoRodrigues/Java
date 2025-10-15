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

/*  Faça um programa que leia 7 números inteiros e no final mostre o somatório 
entre eles.  */
public class QuadragesimoOitavoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        
        for(int i = 0; i < 7; i++){
            System.out.print("Digite um número inteiro: ");
            int num = entrada.nextInt();
            soma += num;
        }   
        System.out.println("Somatório: " + soma);
        
        entrada.close();
    }
}
