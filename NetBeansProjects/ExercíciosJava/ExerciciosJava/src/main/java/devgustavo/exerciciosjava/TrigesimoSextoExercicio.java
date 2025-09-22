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
Um programa de vida saudável quer dar pontos atividades físicas que podem 
ser trocados por dinheiro. O sistema funciona assim: 
- Cada hora de atividade física no mês vale pontos 
- até 10h de atividade no mês: ganha 2 pontos por hora 
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora 
- acima de 20h de atividade no mês: ganha 10 pontos por hora 
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)   
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, 
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
*/
public class TrigesimoSextoExercicio {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.print("Digite as horas dessas atividades realizadas por mês: ");
            int horasRealizadas = entrada.nextInt();
            
            int ganhoPontos; 
            float fatura;
            
            if(horasRealizadas <= 10){
                ganhoPontos = horasRealizadas * 2;
            } else if(horasRealizadas <= 20){
                ganhoPontos = horasRealizadas * 5;
            } else{
                ganhoPontos = horasRealizadas * 10;
            }
            
            fatura = ganhoPontos * 0.05f;
            
            System.out.printf("Total de pontos ganhos: %d | Total de ganho em dinheiro: R$%.2f%n", 
                    ganhoPontos, fatura);
            
            entrada.close();
        }
}
