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
 Desenvolva uma lógica que leia os valores de A, B e C de uma equação do 
segundo grau e mostre o valor de Delta. 
*/
public class DecimoPrimeiroExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        float valorA = entrada.nextFloat();
        
        System.out.print("Digite o valor de B: ");
        float valorB = entrada.nextFloat();
        
        System.out.print("Digite o valor de C: ");
        float valorC = entrada.nextFloat();
        
        // x^2 + bx + c = 0
        float delta = (float) Math.pow(valorB, 2) - 4 * valorA * valorC;
        
        System.out.printf("Valor de delta é: %.2f%n", delta);
    }
}
