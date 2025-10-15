/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */

/*  Desenvolva um programa que mostre na tela a seguinte contagem: 
100 95 90 85 80 ... 0 Acabou!  */
public class QuadragesimoPrimeiroExercicio {
    public static void main(String[] args){
        int num = 100;
        
        while(num >= 0){
            System.out.print(num + " ");
            num-=5;
        }
        System.out.print("Acabou!");
    }
}
