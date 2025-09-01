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
 Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
seu novo salário, com 15% de aumento. 
*/
public class DecimoTerceiroExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: R$");
        double salario = entrada.nextDouble();
        
        double novoSalario = salario + (salario * (15.0 / 100));
        
        System.out.printf("O novo salário desse funcionário é R$%.2f%n", novoSalario);
    }
}
