/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Random;
/**
 *
 * @author gusta
 */
/* ) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e 
mostre na tela: 
a) Quais foram os números sorteados 
b) Quantos números estão acima de 5 
c) Quantos números são divisíveis por 3 */
public class QuintagesimoExercicio {
    public static void main(String[] args){
        Random sorteio = new Random();
        int acimaDeCinco = 0;
        int divisilPorTres = 0;
        
        System.out.print("Números sorteados: ");
        
    for(int i = 1; i <= 20; i++){
           int numero = sorteio.nextInt(11);
           System.out.print(numero + " ");
            if(numero > 5){
               acimaDeCinco++;
           } 
            if(numero % 3 ==0){
                divisilPorTres++;
           }
        }
        System.out.println("\nQuantidade de números acima de 5: " + acimaDeCinco);
        System.out.println("Quantidade de números divisíveis por 3: " + divisilPorTres);
    }
}
