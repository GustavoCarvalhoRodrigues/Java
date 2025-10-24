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
/*  Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando 
no final: 
a) Qual foi a média de altura do grupo 
b) Quantas pessoas pesam mais de 90Kg 
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m 
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.  */
public class QuintagesimoQuartoExercício {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        float somaAltura = 0;
        int pessoaAcimaDoPeso = 0;
        int pessoaAlturaBaixa = 0;
        int pessoaAbaixoDoPeso = 0;
        int pessoaAlturaAcima = 0;
        
        for(int i = 1; i <= 7; i++){
            System.out.printf("Pessoa %d:%n", i);
            
            System.out.print("Qual o peso dessa pessoa (Kg): ");
           float pesoPessoas = entrada.nextFloat();
            
            System.out.print("Qual a altura dessa pessoa (m): ");
           float alturaPessoas = entrada.nextFloat();
            somaAltura += alturaPessoas;
            
            if(pesoPessoas > 90 ){
                pessoaAcimaDoPeso++;
            }
            if(pesoPessoas < 50 && alturaPessoas < 1.60){
                pessoaAbaixoDoPeso++;
                pessoaAlturaBaixa++;
            }
            if(alturaPessoas > 1.90 && pesoPessoas > 100){
                pessoaAlturaAcima++;
            }
        }
        double mediaAltura = (double) somaAltura / 7;
        
        
        System.out.format("Qual a média da altura desse grupo? %.2f%n", mediaAltura);
        System.out.format("Quntas pessoas pesam mais de 90Kg? %d%n", pessoaAcimaDoPeso);
        System.out.format("Quantas pessoas pesam menos de 50kg? %d e tem menos de 1.60m? %d%n", pessoaAbaixoDoPeso, pessoaAlturaBaixa);
        System.out.format("Quantas pessoas medem mais de 1.90m e pesam mais de 100Kg? %d%n", pessoaAlturaAcima);
        
        entrada.close();
    }
}
