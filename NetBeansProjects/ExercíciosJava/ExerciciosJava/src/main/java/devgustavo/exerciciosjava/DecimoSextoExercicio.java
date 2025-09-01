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
 [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um 
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele 
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule 
quantos dias de vida um fumante perderá e exiba o total em dias. 
*/
public class DecimoSextoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantos cigarros esse fumante fuma por dia: ");
        int cigarrosFumados = entrada.nextInt();
        
        System.out.print("Quantos anos esse fumante já fumou: ");
        int anosFumados = entrada.nextInt();
        
        int totalCigarros = cigarrosFumados * anosFumados * 365;
        
        int minutosPerdidos = totalCigarros * 10;
        
        int diasPerdidos = minutosPerdidos / (60 * 24);
        
        System.out.printf("Esse fumante perdeu aproximadamente %d dias de vida.%n", diasPerdidos);
    }
}
