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
 Crie um programa que leia duas notas de um aluno e calcule a sua média, 
mostrando uma mensagem no final, de acordo com a média atingida: 
- Média até 4.9: REPROVADO 
- Média entre 5.0 e 6.9: RECUPERAÇÃO 
- Média 7.0 ou superior: APROVADO
*/
public class VigesimoSetimoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Primeira nota: ");
        float primeiraNota = entrada.nextFloat();
        
        System.out.print("Segunda nota: ");
        float segundaNota = entrada.nextFloat();
        
        float media = (primeiraNota + segundaNota) / 2;
        
        String mensagem;
        if(media <= 4.9){
            mensagem = "REPROVADO";
        } else if(media <= 6.9) {
            mensagem = "RECUPERAÇÃO";
        } else {
            mensagem = "APROVADO";
        }
        System.out.printf("Primeira nota: %.1f | Segunda nota: %.1f | Média: %.1f | %s%n", 
                primeiraNota, segundaNota, media, mensagem);
        
        entrada.close();
    }
}
