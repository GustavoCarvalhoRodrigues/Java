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
/* Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela 
qual foi o maior e qual foi o menor preço digitados. 
 */
public class QuintagesimoPrimeiroExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        float maiorPreco = 0;
        float menorPreco = 0;
        
        for(int i = 1; i <= 8; i++){
            System.out.print("Digite o preço desse produto: R$");
            float preco = entrada.nextFloat();
            
            if(i == 1){
            maiorPreco = preco;
            menorPreco = preco;
            } else{
                if(preco > maiorPreco){
                    maiorPreco = preco;
                }
                if(preco < menorPreco){
                    menorPreco = preco;
                }
            }
        } 
        System.out.print("Maior preço R$: " + maiorPreco);
        System.out.print("\nMenor preço R$: " + menorPreco);
        
        entrada.close();
    }
}
