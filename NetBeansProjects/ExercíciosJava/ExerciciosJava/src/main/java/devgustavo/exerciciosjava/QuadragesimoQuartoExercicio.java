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
/* Crie um algoritmo que leia o valor inicial da contagem, o valor final e o 
incremento, mostrando em seguida todos os valores no intervalo: 
Ex: Digite o primeiro Valor: 3 
Digite o último Valor: 10 
Digite o incremento: 2 
Contagem: 3 5 7 9 Acabou!  */
public class QuadragesimoQuartoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = entrada.nextInt();
        
        System.out.print("Digite o último valor: ");
        int ultimoValor = entrada.nextInt();
        
        System.out.print("Digite o incremento: ");
        int incremento = entrada.nextInt();
        
        System.out.print("Contagem: ");
        
        do{
            System.out.print(primeiroValor + " ");
            primeiroValor += incremento;
           
        }while(primeiroValor <= ultimoValor);
        
        System.out.print("Acabou!");
        
        entrada.close();
    }
}
