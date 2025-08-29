/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author gusta
 */

/*
 Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte. 
*/

public class SetimoExercicio {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.getDefault());
        
        System.out.print("Digite um número: ");
        double numero = entrada.nextDouble();
        
        double dobro = numero * 2; 
        double tercaParte = numero / 3;
        
        System.out.printf("O dobro de %.1f é %.1f%n", numero, dobro);
        System.out.printf("A terça parte de %.1f é %.2f%n", numero, tercaParte);
        
        entrada.close();
    }
}
