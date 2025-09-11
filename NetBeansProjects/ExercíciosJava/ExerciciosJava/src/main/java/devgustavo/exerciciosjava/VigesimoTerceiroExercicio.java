/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author gusta
 */
/*
 Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos 
para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo 
que: 
- Homens ganham 5% de desconto 
- Mulheres ganham 13% de desconto
*/
public class VigesimoTerceiroExercicio {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Qual o seu sexo (M/F): ");
        String sexo = entrada.next();
        
        System.out.print("Qual o valor das compras: R$");
        float valorCompras = entrada.nextFloat();
        
        float precoComDesconto;
        
        if ("M".equalsIgnoreCase(sexo)){
             precoComDesconto = valorCompras - (valorCompras * 0.05f);    
        } else {
             precoComDesconto = valorCompras - (valorCompras * 0.13f);
        }
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Nome do cliente: %s | Sexo do cliente: %s | Preço com desconto: R$%.2f%n", 
                nome, sexo.toUpperCase(), precoComDesconto);
    
        entrada.close();
    }
}     
