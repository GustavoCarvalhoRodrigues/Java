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
/* Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas. 
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre: 
a) O nome da pessoa mais velha 
b) O nome da mulher mais jovem 
c) A média de idade do grupo 
d) Quantos homens tem mais de 30 anos 
e) Quantas mulheres tem menos de 18 anos */
public class SextagesimoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int idadeVelha = 0;
        String nomePessoaVelha = null;
        String nomeMulherJovem = null;
        int idadeMulherNova = Integer.MAX_VALUE;
        int somaIdades = 0;
        int qIdades = 0;
        int totalHomensIdade = 0;
        int totalMulheresIdade = 0;
        
        while(true){
            System.out.println("Digite o nome dessa pessoa: ");
            String nome = entrada.nextLine();
            
            System.out.println("Digite a idade dessa pessoa: ");
            int idade = entrada.nextInt();
            entrada.nextLine();
            
            somaIdades+=idade;
            qIdades++;
            
            System.out.println("Digite o sexo (M ou F): ");
            String sexo = entrada.next().toUpperCase();
            entrada.nextLine();
            
            if(idade > idadeVelha){
                idadeVelha = idade;
                nomePessoaVelha = nome;
            }
            
            if("F".equals(sexo)){
                if(idade < idadeMulherNova){
                    idadeMulherNova = idade;
                    nomeMulherJovem = nome;
                }
            }
           
            if("M".equals(sexo) && idade > 30){
                totalHomensIdade++;
            }
            
            if("F".equals(sexo) && idade < 18){
                totalMulheresIdade++;
            }
            
            System.out.println("Deseja continuar (SIM ou NAO): ");
            String continuar = entrada.next().toUpperCase();
            
            if("NAO".equals(continuar)){
                break;
            }
        }
        double mediaIdade = qIdades > 0 ? (double) somaIdades / qIdades : 0;
        System.out.println("--------------------------------");
        System.out.printf("O nome da pessoa mais velha: %s%n", nomePessoaVelha);
        System.out.printf("O nome da mulher mais jovem: %s%n", nomeMulherJovem);
        System.out.printf("A média de idade do grupo: %.2f%n", mediaIdade);
        System.out.printf("Quantos homens tem mais de 30 anos: %d%n", totalHomensIdade);
        System.out.printf("Quantas mulheres tem menos de 18 anos: %d%n", totalMulheresIdade);
    }
}
