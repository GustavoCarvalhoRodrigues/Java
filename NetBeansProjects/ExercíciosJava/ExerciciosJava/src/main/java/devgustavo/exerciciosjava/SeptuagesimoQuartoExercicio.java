/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Arrays;

/**
 *
 * @author gusta
 */
/*  Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo: 
 
5 3 5 3 5 3 5 3 5 3 
0 1 2 3 4 5 6 7 8 9 */
public class SeptuagesimoQuartoExercicio {
    public static void main(String[] args){
        int posicoes[] = new int[10];
        
        for(int c  = 0; c < posicoes.length; c++){
            if(c % 2 == 0){
                posicoes[c] = 5;
            } else {
                posicoes[c] = 3;
            }
        }
        System.out.println(Arrays.toString(posicoes));
        
        for(int c = 0; c < posicoes.length; c++){
            System.out.print(c + " ");
        }
    }
}
