package devgustavo.exerciciosjava;

import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
/*  Faça um programa que preencha automaticamente um vetor numérico com 8 
posições, conforme abaixo: 
 
999 999 999 999 999 999 999 999 
0    1   2   3   4   5   6   7 */
public class SeptuagesimoPrimeiroExercicio {
    public static void main(String[] args){
        int n[] = new int[8];
        Arrays.fill(n, 999);
        
         for(int valor: n)
        System.out.print(valor + " ");
    }
}
