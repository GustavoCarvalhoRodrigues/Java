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

/*
 Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
situação em relação ao alistamento militar. - Se estiver antes dos 18 anos, mostre 
em quantos anos faltam para o alistamento. - Se já tiver depois dos 18 anos, 
mostre quantos anos já se passaram do alistamento.
*/
public class VigesimoSegundoExercicio {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int anoAtual = Year.now().getValue();
        
        System.out.print("Ano de nascimento desse rapaz: ");
        int anoNascimento = entrada.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        if (idade < 18) {
            int condicaoAlistamento = 18 - idade;
            System.out.printf("A idade desse rapaz é %d anos e faltará %d anos para o alistamento%n", idade, condicaoAlistamento);            
        } else {
            int condicaoAlistamento = idade - 18;
            System.out.printf("A idade desse rapaz é %d anos e já se passaram %d%n anos do alistamento%n", idade, condicaoAlistamento);
        }
        entrada.close();
    }
}
