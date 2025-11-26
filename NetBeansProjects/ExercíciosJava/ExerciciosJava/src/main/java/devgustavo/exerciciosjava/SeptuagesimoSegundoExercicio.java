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
 
5 10 15 20 25 30 35 40 45 50 
0 1  2  3  4  5  6  7  8  9  */
public class SeptuagesimoSegundoExercicio {
    public static void main(String[] args){
        int posicoes[] = new int[10];
        
        // preenchimento
        for(int c = 0; c <= posicoes.length - 1; c++){
            posicoes[c] = (c + 1) * 5;
        }
       
        // Saida do valor formatado
        System.out.println(Arrays.toString(posicoes));
       
        // mostrando índice
        for(int c = 0; c <= posicoes.length - 1; c++){
            System.out.print(c + " ");
        }
    }
}
