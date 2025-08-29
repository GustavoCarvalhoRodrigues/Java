/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author gusta
 */

/*  Crie um programa que leia o nome e o salário de um funcionário, mostrando no 
final uma mensagem.*/

public class TerceiroExercicio {
    public static void main(String[] args) {
        // Locale (permitindo vírgula no salário)
       Scanner funcionario = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));
       
        System.out.print("Nome do Funcionário: "); 
        String nome = funcionario.nextLine();
        
        System.out.print("Salário: ");
        double salario = funcionario.nextDouble();
        
        // Formatação monetária para Real (R$)
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")); 
        
        System.out.printf("O funcionário(a) %s tem um salário de %s em Junho. %n", nome, nf.format(salario));
    }
}
