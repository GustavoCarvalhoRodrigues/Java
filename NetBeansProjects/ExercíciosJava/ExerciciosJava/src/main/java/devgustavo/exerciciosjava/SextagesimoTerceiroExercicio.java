/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
/*  Crie um programa usando a estrutura “faça enquanto” que leia vários números. 
A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na 
tela: 
a) O somatório entre todos os valores 
b) Qual foi o menor valor digitado 
c) A média entre todos os valores 
d) Quantos valores são pares */
public class SextagesimoTerceiroExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        int soma = 0;
        int menorValor = Integer.MAX_VALUE;
        int qValoresDigitados = 0;
        int valoresPares = 0;
        boolean continuar = true;
        
        do{
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            entrada.nextLine();
            
            // Somatório entre todos os valores
            soma+=num;
            
            // Menor valor digitado
            if(num < menorValor){
                menorValor = num;
            }
            
            // Quantidade de valores digitados
            qValoresDigitados++;
            
            // Quantos valores são pares
            if(num % 2 == 0){
            valoresPares++;
            }
            
            System.out.println("Deseja continuar? (SIM ou NAO) ");
            String resposta = entrada.nextLine().trim().toUpperCase();
            
            if("NAO".equals(resposta)){
                continuar = false;
            }
        }while(continuar);
        
        double media = qValoresDigitados > 0 ? (double) soma / qValoresDigitados : 0;
        
        System.out.printf("O somatório entre todos os valores: %d%n", soma);
        System.out.printf("Qual foi o menor valor digitado: %d%n", menorValor);
        System.out.printf("A média entre todos os valores: %.2f%n", media);
        System.out.printf("Quantos valores são pares: %d%n", valoresPares);
        
        entrada.close();
    }
}
