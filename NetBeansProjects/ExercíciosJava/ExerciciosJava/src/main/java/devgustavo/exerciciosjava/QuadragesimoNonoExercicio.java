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
/* 49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles 
são pares e quantos são ímpares.  */
public class QuadragesimoNonoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        
        for(int i = 0; i < 6; i++){
            System.out.print("Digite um número inteiro: ");
            int num = entrada.nextInt();
            
            if(num % 2 == 0){
                pares++;
            } else{
                impares++;
            }
        }
        
        System.out.println("Números Pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
        
        entrada.close();
    }
}
