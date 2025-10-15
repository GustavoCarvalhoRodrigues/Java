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
/* Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final: 
a) Quantos homens foram cadastrados 
b) Quantas mulheres foram cadastradas 
c) A média de idade do grupo 
d) A média de idade dos homens 
e) Quantas mulheres tem mais de 20 anos  */
public class QuintagesimoTerceiroExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int somaIdadeHomens = 0;
        int homensCadastrados = 0;
        int mulheresCadastradas = 0;
        int mulheresMaisdeVinteAnos = 0;
        
        for(int i = 1; i <= 5; i++){
           System.out.print("Qual a idade dessa pessoa: ");
           int idade = entrada.nextInt();
           soma+=idade; 
           
           entrada.nextLine();
           
           System.out.print("Qual o gênero (M ou F): ");
           String pessoa = entrada.nextLine().toUpperCase();
            
            if("M".equals(pessoa)){
                homensCadastrados++;
                somaIdadeHomens += idade;
            }else if ("F".equals(pessoa)){
                mulheresCadastradas++;
                if(idade > 20){
                    mulheresMaisdeVinteAnos++;
                }
            } else {
                System.out.println("Gênero inválido!!!");
            }
        }
        double mediaIdadeGrupo = (double) soma / 5;
        double mediaHomensCadastrados = homensCadastrados > 0 ? (double) somaIdadeHomens / homensCadastrados : 0;
        
        System.out.printf("Média idade do grupo: %.2f%n", mediaIdadeGrupo);
        System.out.printf("Homens cadastrados: %d%n", homensCadastrados);
        System.out.printf("Mulheres cadastradas: %d%n", mulheresCadastradas);
        System.out.printf("Média idade homens: %.2f%n", mediaHomensCadastrados);
        System.out.printf("Mulheres com mais de 20 anos: %d%n", mulheresMaisdeVinteAnos);
        
        entrada.close();
    }
}
