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
/* Função : Faça um programa usando a estrutura “faça enquanto” que leia a idade de
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual é a média entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais. */
public class SextagesimoSegundoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int idadesDigitadas = 0;
        int todasIdades = 0;
        int maiores21= 0;
        boolean continuar = true;
        
        do{
            System.out.print("Digite a idade dessa pessoa: ");
            int idade = entrada.nextInt();
            entrada.nextLine();
            
            idadesDigitadas++;
            todasIdades+=idade;
            
            if(idade >= 21){
                maiores21++;
            }
            
            System.out.println("Deseja continuar (SIM ou NAO)? ");
            String resposta = entrada.next().trim().toUpperCase();
            if("NAO".equals(resposta)){
                continuar = false;
            }
        }while(continuar);
        
        double media = idadesDigitadas > 0 ? (double) todasIdades / idadesDigitadas : 0;
        
        System.out.printf("Quantas idades foram digitadas: %d%n", idadesDigitadas);
        System.out.printf("Qual é a média entre as idades digitadas: %.2f%n", media);
        System.out.printf("Quantas pessoas tem 21 anos ou mais: %d%n", maiores21);
        
        entrada.close();
    }
    
}
