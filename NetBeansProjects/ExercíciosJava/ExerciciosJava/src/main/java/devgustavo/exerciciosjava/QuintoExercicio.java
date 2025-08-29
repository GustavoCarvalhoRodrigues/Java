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
Faça um programa que leia as duas notas de um aluno em uma matéria e mostre 
na tela a sua média na disciplina. 
*/

public class QuintoExercicio {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.getDefault());

        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.printf("A média entre %.1f e %.1f é igual a %.1f%n", nota1, nota2, media);
        
        entrada.close();
    }
}
