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
 Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
ela não pode exceder 30% do salário ou então o empréstimo será negado.
*/
public class TrigesimoTerceiroExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Qual o valor da casa: R$");
        float valorCasa = entrada.nextFloat();
        
        System.out.print("Digite o salário desse comprador: R$");
        double salarioComprador = entrada.nextFloat();
        
        System.out.print("Quantos ano(s) para pagar: ");
        int anosPagar = entrada.nextInt();
        
        int parcelasMensais = anosPagar * 12;
        double prestacaoMensal = (double) (valorCasa / parcelasMensais);
        double limite = (double) (salarioComprador * 0.3);
        
        System.out.printf("Valor da prestação mensal: R$%.2f%n", prestacaoMensal);
        System.out.printf("Limite permitido (30%% do salário): R$%.2f%n", limite);
        
        if(prestacaoMensal <= limite){
            System.out.print("Empréstimo aprovado");
        } else {
            System.out.print("Empréstimo negado");
        }
        
        entrada.close();
    }
}
