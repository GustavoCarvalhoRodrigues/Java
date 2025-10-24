package devgustavo.exerciciosjava;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
/*  Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai 
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre: 
a) qual é a maior idade lida 
b) quantos homens foram cadastrados 
c) qual é a idade da mulher mais jovem 
d) qual é a média de idade entre os homens  */
public class QuintagesimoNonoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int maiorIdade = 0;
        int somaIdadeHomens = 0;
        int qHomensCadastrados = 0;
        int mulherJovem = Integer.MAX_VALUE;
        
        while(true){
            System.out.print("Qual o sexo dessa pessoa (M ou F): ");
            String sexo = entrada.next().toUpperCase();
            
            System.out.print("Qual a idade dessa pessoa: ");
            int idade = entrada.nextInt();
            
            if(idade > maiorIdade){
                maiorIdade = idade;
            }
            
            if("M".equals(sexo)){
                qHomensCadastrados++;
                somaIdadeHomens += idade;
            }
            
            if("F".equals(sexo) && idade < mulherJovem){
               mulherJovem = idade;
            }
            
            System.out.print("Quer continuar (SIM ou NAO): ");
            String continuar = entrada.next().toUpperCase();
            if("NAO".equals(continuar)){
                break;
            }
        }
        double media = (qHomensCadastrados > 0) ? (double) somaIdadeHomens / qHomensCadastrados: 0;
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Homens cadastrados: " + qHomensCadastrados);
        if(mulherJovem != Integer.MAX_VALUE){
            System.out.println("Idade da mulher mais jovem: " + mulherJovem);
        } else{
            System.out.println("Nenhuma mulher cadastrada.");
        }
        System.out.println("Média da idade entre os homens: " + media);
    }
}





