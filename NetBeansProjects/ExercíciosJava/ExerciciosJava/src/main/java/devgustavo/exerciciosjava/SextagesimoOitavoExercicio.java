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
/*  Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura 
“para”. No final, mostre na tela: 
a) Quantas mulheres foram cadastradas 
b) Quantos homens pesam mais de 100Kg 
c) A média de peso entre as mulheres  
d) O maior peso entre os homens  */
public class SextagesimoOitavoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int qMulheresCadastradas = 0;
        int qHomensCemKgOuMais = 0;
        int pesoMulheres = 0;
        int maiorPesoHomens = 0;
        
        for(int i = 1; i <= 8; i++){
            System.out.println("\nPessoa " + i + ":");
            
            System.out.print("Digite o sexo (M ou F): ");
            String sexo = entrada.next().toUpperCase();
            
            System.out.print("Digite o peso dessa pessoa: ");
            int peso = entrada.nextInt();
            
            if("F".equals(sexo)){
                qMulheresCadastradas++;
                pesoMulheres += peso;
            }
            
            if("M".equals(sexo)){
                if(peso > 100){
                qHomensCemKgOuMais++;
                }
                if(peso > maiorPesoHomens){
                    maiorPesoHomens = peso;
                }
            }
        }
        
        double media = qMulheresCadastradas > 0? (double) pesoMulheres / qMulheresCadastradas: 0;
        
        System.out.println("--------" + " Resultado " + "--------");
        System.out.printf("Quantas mulheres foram cadastradas: %d%n", qMulheresCadastradas);
        System.out.printf("Quantos homens pesam mais de 100Kg: %d%n", qHomensCemKgOuMais);
        System.out.printf("A média de peso entre as mulheres: %.2f%n", media);
        System.out.print("O maior peso entre os homens: " + maiorPesoHomens);
        
        entrada.close();
    }
}
