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
 
9 8 7 6 5 4 3 2 1 0 
0 1 2 3 4 5 6 7 8 9 */
public class SeptuagesimoTerceiroExercicio {
    public static void main(String[] args){
        int num[] = new int[10];
        
        for(int c = 0; c < num.length; c++){
            num[c] = 9 - c ;
        }   
        
        System.out.println(Arrays.toString(num));
            
         for(int c = 0; c < num.length; c++){
             System.out.print(c + " ");    
        }
    }
}
