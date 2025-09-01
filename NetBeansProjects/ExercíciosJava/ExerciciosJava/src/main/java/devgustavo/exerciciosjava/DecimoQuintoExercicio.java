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

/*
 Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada.
*/
public class DecimoQuintoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de dias trabalhados no mês: ");
        int diasTrabalhadosNoMes = entrada.nextInt();
        
        int horasPorDia = 8;
        double valorPorHora = 25.0;
        
        double salarioTotal = diasTrabalhadosNoMes * horasPorDia * valorPorHora;
        
        System.out.printf("O salário total desse funcionário é R$%.2f", salarioTotal);
    }
}
