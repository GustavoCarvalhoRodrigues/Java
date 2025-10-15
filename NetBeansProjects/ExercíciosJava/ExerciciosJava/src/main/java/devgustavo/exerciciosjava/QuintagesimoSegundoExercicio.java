package devgustavo.exerciciosjava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */

import java.util.Scanner;
/*  Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final: 
a) Qual é a média de idade do grupo 
b) Quantas pessoas tem mais de 18 anos 
c) Quantas pessoas tem menos de 5 anos 
d) Qual foi a maior idade lida  */
public class QuintagesimoSegundoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        int soma = 0;
        int maiorDeDezoito = 0;
        int menorDeCinco = 0;
        int maiorIdade = 0;
        
        for(int i = 1; i <= 10; i++){
        System.out.print("Digite a idade dessa pessoa: ");
        idade = entrada.nextInt();
        soma += idade;
       
        if(idade > 18){
                maiorDeDezoito++;
            }else if(idade < 5){
                menorDeCinco++;
            }
        if(i == 1){
                maiorIdade = idade;
            } else {
                 if(idade > maiorIdade){
                    maiorIdade = idade;
                }
            }
        }
        double media = soma / 10.0;
        System.out.print("A média das idades: " + media);
        System.out.print("\nPessoas com mais de dezoito anos: " + maiorDeDezoito);
        System.out.print("\nPessoas com menos de cinco anos: " + menorDeCinco);
        System.out.print("\nPessoa com maior idade: " + maiorIdade);
        
        entrada.close();
    }
}
