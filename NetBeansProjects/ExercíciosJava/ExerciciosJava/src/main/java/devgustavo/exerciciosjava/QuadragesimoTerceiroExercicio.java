/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */
/* Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, 
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo: 
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...  */
public class QuadragesimoTerceiroExercicio {
    public static void main(String[] args){
        int num = 30;
        do{
            if(num % 4 == 0){
                System.out.print("[" + num + "] ");
            } else {
                System.out.print(num + " ");
            }
            num--;
        }while(num >= 1);
    }
}
