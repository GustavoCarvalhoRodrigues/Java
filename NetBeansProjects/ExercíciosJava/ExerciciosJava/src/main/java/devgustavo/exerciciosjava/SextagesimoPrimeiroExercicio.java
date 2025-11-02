/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */
/*  Função : Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
“faça enquanto” 0 3 6 9 12 15 18 21 24 27 30 Acabou! */
public class SextagesimoPrimeiroExercicio {
    public static void main(String[] args){
        
        int num = 0;
       
        do{ 
          System.out.print(num + " ");
          num+=3;
        }while(num <= 30);
        System.out.print("Acabou!");
    }
}
