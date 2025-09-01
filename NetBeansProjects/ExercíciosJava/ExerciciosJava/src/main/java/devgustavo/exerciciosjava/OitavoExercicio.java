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
 Desenvolva um programa que leia uma distância em metros e mostre os valores 
relativos em outras medidas. 
*/

public class OitavoExercicio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite uma distância em metros: ");
        double distanciaMetros = entrada.nextDouble();
        
        System.out.printf("A distância de %.1fm corresponde a: %n", distanciaMetros);
        System.out.println((distanciaMetros / 1000) + "Km\n" + (distanciaMetros / 100) + "Hm\n" + (distanciaMetros / 10) + "Dam\n"
        + (distanciaMetros * 10) + "Dm\n" + (distanciaMetros * 100) + "Cm\n" + (distanciaMetros * 1000) + "Mm");
        
        entrada.close();
    }
}
