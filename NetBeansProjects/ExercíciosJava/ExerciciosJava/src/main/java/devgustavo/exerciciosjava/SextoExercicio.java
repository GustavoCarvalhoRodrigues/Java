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
 Faça um programa que leia um número inteiro e mostre o seu antecessor e seu 
sucessor.
*/

public class SextoExercicio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
                
        System.out.printf("O antecessor de %d é %d%n", numero, (numero - 1));
        System.out.printf("O sucessor de %d é %d%n", numero, (numero + 1));
        
        entrada.close();
    }
}
