/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author gusta
 */

/*
 Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
e mostre quantos dólares ela pode comprar.
*/

public class NonoExercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite quanto dinheiro você tem na carteira (em R$): ");
        double dinheiroReal = entrada.nextDouble();
        
        System.out.print("Digite a cotação atual do dólar (R$): ");
        double cotacaoDolar = entrada.nextDouble();
        
        double dinheiroDolar = dinheiroReal / cotacaoDolar;
        
        System.out.printf("Você tem R$%.2f na carteira e pode comprar US$%.2f\n", 
                          dinheiroReal, dinheiroDolar);
    }
}
