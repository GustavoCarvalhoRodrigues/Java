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
/*  Crie um programa que leia vários números pelo teclado e mostre no final o 
somatório entre eles. 
Obs: O programa será interrompido quando o número 1111 for digitado  */
public class QuintagesimoSextoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        int num;
        
       while (true){
           System.out.println("Digite um número (1111 para parar): ");
           num = entrada.nextInt();
           
           if(num == 1111){
               break;
            }
           soma += num;
       }
        System.out.printf("A soma desses números: %d%n", soma);
        System.out.println("Fim do programa!");
        
        entrada.close();
    }
}