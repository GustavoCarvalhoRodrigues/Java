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
/* ) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa 
vai parar quando for digitada a idade 999. No final, mostre quantos alunos 
existem na turma e qual é a média de idade do grupo.  */
public class QuintagesimoOitavoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        int qAlunos = 0;
        int idade;
        
        System.out.println("Se digitar 999 na idade, o loop será encerrado!");
        
        while(true){
            System.out.print("Digite a idade do aluno: ");
            idade = entrada.nextInt();
            
            if(idade == 999){
                break;
            }
            soma+=idade;
            qAlunos++;
        }
        float media = (qAlunos > 0) ? (float) soma / qAlunos: 0;
       
        System.out.printf("Quantos alunos existem na turma: %d%n", qAlunos);
        System.out.printf("Média de idade do grupo: %.2f%n", Math.floor(media));
    }
}
