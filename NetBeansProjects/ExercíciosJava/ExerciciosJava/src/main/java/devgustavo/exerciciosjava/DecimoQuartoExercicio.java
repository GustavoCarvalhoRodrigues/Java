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
 A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. 
*/
public class DecimoQuartoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantos (Km) percorridos por esse carro alugado: ");
        float quilometrosPercorridos = entrada.nextFloat();
        
        System.out.print("Digite à quantidade de dias alugados: ");
        int diasAlugado = entrada.nextInt();
        
        float custoPorDia = diasAlugado * 90f;
        System.out.printf("Custo pelos dias: R$%.2f%n", custoPorDia);
        
        float custoPorKm = quilometrosPercorridos * 0.20f;
        System.out.printf("Custo pelos Km: R$%.2f%n", custoPorKm);
        
        float totalPagar = custoPorKm + custoPorDia;
        System.out.printf("Valor total a pagar: R$%.2f%n", totalPagar);
    }
}
