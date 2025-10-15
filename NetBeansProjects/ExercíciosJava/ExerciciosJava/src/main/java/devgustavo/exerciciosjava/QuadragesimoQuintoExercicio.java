package devgustavo.exerciciosjava;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
/* 
 * O programa faz uma contagem entre dois valores, podendo ser crescente ou
 * decrescente, conforme o valor inicial e final informados.
 */
public class QuadragesimoQuintoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = entrada.nextInt();

        System.out.print("Digite o último valor: ");
        int ultimoValor = entrada.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = entrada.nextInt();

        // Evita incremento zero, que causaria loop infinito
        if (incremento <= 0) {
            System.out.println("O incremento deve ser maior que zero.");
        } else {
            System.out.print("Contagem: ");

            if (primeiroValor < ultimoValor) {
                // Contagem crescente
                do {
                    System.out.print(primeiroValor + " ");
                    primeiroValor += incremento;
                } while (primeiroValor <= ultimoValor);
            } else {
                // Contagem decrescente
                do {
                    System.out.print(primeiroValor + " ");
                    primeiroValor -= incremento;
                } while (primeiroValor >= ultimoValor);
            }

            System.out.println("Acabou!");
        }

        entrada.close();
    }
}
