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
 Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto. 
*/
public class DecimoSegundoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o preço do produto: R$");
        float precoProduto = entrada.nextFloat();
        
        float precoPromocional = precoProduto - (precoProduto * (5f / 100));
        
        System.out.printf("O valor total do produto com desconto é R$%.2f%n", precoPromocional);
    }
}
