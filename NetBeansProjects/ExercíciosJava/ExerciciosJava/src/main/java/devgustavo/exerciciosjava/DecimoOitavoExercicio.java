/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;
import java.time.Year;
/**
 *
 * @author gusta
 */

/*  Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
dela e depois mostre se ela pode ou não votar.  */
public class DecimoOitavoExercicio {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoAtual = Year.now().getValue();
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        
        int idade = anoAtual- anoNascimento;
        String mensagem;
        
        if (idade < 16) {
            mensagem = ("NÃO PODE VOTAR!");
        } else if ((idade >= 16 && idade < 18) || (idade >= 70)) {
            mensagem = ("VOTO FACULTATIVO!");
        } else {
            mensagem = ("VOTO OBRIGATÓRIO!");
        }
        System.out.printf("Idade: %d anos -> %s%n", idade, mensagem);
        
        entrada.close();
    }
}
