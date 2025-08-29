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

/*  Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas
vindas para ela: */

public class SegundoExercicio {
    
    public static void main(String[] args){
        Scanner pessoa = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = pessoa.nextLine();
        System.out.format("Seja bem vindo(a), %s!",nome);
    
    }
}
