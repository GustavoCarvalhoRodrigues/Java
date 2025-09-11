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
 Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
BISSEXTO.
*/
public class VigesimoPrimeiroExercicio {
    
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);
         
         System.out.print("Digite determinado ano: ");
         int ano = entrada.nextInt();
         
         if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
             System.out.print("É ano BISSEXTO");
         } else {
             System.out.println("Não é ano BISSEXTO");
         }
    }
}
