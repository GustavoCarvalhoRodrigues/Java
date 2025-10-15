/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */

/*  Crie um aplicativo que mostre na tela a seguinte contagem: 
0 3 6 9 12 15 18 Acabou!  */
public class QuadragesimoExercicio {
    public static void main(String[] args){
        int num = 0;
        
        while(num <= 18){
            System.out.print(num + " ");
            num+=3;
        }
        System.out.print("Acabou!");
    }
}
