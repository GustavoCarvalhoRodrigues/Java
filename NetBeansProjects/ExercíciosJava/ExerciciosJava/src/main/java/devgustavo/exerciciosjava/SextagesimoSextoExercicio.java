/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
/*  Escreva um programa que leia um número qualquer e mostre a tabuada desse 
número, usando a estrutura “para”. 
Ex: Digite um valor: 5 
5 x 1 = 5 
5 x 2 = 10 
5 x 3 = 15 ... */
public class SextagesimoSextoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
 
        System.out.print("Digite um valor: ");
        int num = entrada.nextInt();
        
        for(int i = 1; i <= 10; i++){    
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
