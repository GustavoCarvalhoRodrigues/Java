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
 Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório 
entre eles.*/

public class QuartoExercicio {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int numero1 = entrada.nextInt();
        
        System.out.print("Digite outro valor: ");
        int numero2 = entrada.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.printf("A soma entre %d e %d é igual a %d%n", numero1, numero2, soma);
        
        entrada.close();
    }
}
