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

/*  Faça um algoritmo que pergunte ao usuário um número inteiro e positivo 
qualquer e mostre uma contagem até esse valor: 
Ex: Digite um valor: 35 
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!   */
public class QuadragesimoSegundoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int num = entrada.nextInt();
        int contador = 0;
        
        while(contador < num){
            contador++;
            System.out.print(contador + " ");
        }
        System.out.print("Acabou!");
        entrada.close();
    }
}
