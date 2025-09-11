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
 Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou 
ÍMPAR.
*/
public class VigesimoExercicio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        String parImpar = (numero % 2 == 0) ? "PAR" : "ÍMPAR";
        
        System.out.printf("O número %d é %s.%n", numero, parImpar);
        
        entrada.close();
    }
}
