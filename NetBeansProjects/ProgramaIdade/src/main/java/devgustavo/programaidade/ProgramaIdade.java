/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package devgustavo.programaidade;

import java.util.Scanner;
/**
 *
 * @author gusta
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Rm que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2025 - nasc;
        System.out.println("Sua idade é " + i);
        if (i >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
