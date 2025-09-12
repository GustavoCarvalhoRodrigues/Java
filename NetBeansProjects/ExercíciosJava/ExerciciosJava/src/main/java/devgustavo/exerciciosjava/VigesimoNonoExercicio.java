/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
/**
 *
 * @author gusta
 */
/*
 Desenvolva um programa que leia o nome de um funcionário, seu salário, 
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
acordo com a tabela a seguir: 
- Até 3 anos de empresa: aumento de 3%  
- entre 3 e 10 anos: aumento de 12.5% 
- 10 anos ou mais: aumento de 20% 
*/
public class VigesimoNonoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat moedaBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")); 
        
        System.out.print("Qual o nome desse funcionário: ");
        String nome = entrada.next(); 
        
        System.out.printf("Quanto ganha %s (R$): ", nome);
        double salario = entrada.nextDouble();
        
        System.out.printf("Quantos anos %s trabalha na empresa: ", nome);
        int anosTrabalhados = entrada.nextInt();
        
        float aumento;
        if(anosTrabalhados <= 3){
           aumento = (float) 0.03;
        } else if(anosTrabalhados < 10){
            aumento = (float) 0.125;
        } else {
            aumento = (float) 0.2;
        }
        
        double novoSalario = (double)(salario + (salario * aumento));
        
        System.out.println("\n--- RELATÓRIO DO FUNCIONÁRIO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Salário atual: " + moedaBR.format(salario));
        System.out.println("Anos de empresa: " + anosTrabalhados);
        System.out.println("Percentual de aumento: " + (aumento * 100) + "%");
        System.out.println("Novo salário: " + moedaBR.format(novoSalario));
        
        entrada.close();
    }
}