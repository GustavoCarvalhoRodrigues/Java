/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */
/*  Faça um algoritmo que mostre na tela a seguinte contagem: 
10 9 8 7 6 5 4 3 Acabou! */
public class TrigesimoNonoExercicio {
    public static void main(String[] args){
        int num = 11;
        
        while(num > 3){
            num--;
            System.out.print(num + " ");
        }
        System.out.print("Acabou!");
    }
}
