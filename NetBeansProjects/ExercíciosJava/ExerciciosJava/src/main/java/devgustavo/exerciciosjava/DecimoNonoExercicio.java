/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;

public class DecimoNonoExercicio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Qual o nome desse aluno(a): ");
        String nome = entrada.nextLine();
        
        System.out.print("Qual a primeira nota: ");
        float primeiraNota = entrada.nextFloat();
        
        System.out.print("Qual a segunda nota: ");
        float segundaNota = entrada.nextFloat();
        
        float media = (primeiraNota + segundaNota) / 2;
        String mensagem = (media >= 7.0) 
                ? "BOM APROVEITAMENTO" 
                : "MAL APROVEITAMENTO";
        
        System.out.printf("Aluno: %s | Média: %.1f | Resultado: %s%n", nome, media, mensagem);
        
        entrada.close();
    }
}

