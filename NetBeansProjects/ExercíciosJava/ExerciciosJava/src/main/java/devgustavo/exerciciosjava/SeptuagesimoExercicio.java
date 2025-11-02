/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */
/* ] Faça um programa que mostre os 10 primeiros elementos da Sequência 
de Fibonacci: 
1 1 2 3 5 8 13 21... */
public class SeptuagesimoExercicio {
    public static void main(String[] args){
        
        int a = 1;
        int b = 1;
        
        System.out.print(a + " " + b + " ");
        
        for(int i = 3; i <= 10; i++){
           int proximo = a + b;
            System.out.print(proximo + " ");
            a = b;
            b = proximo;
        }
    }
}
