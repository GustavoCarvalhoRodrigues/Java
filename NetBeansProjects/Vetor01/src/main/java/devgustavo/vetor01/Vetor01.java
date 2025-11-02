/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package devgustavo.vetor01;

/**
 *
 * @author gusta
 */
public class Vetor01 {

    public static void main(String[] args) {
        int n[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N " + n.length);
        for(int c = 0; c <= n.length - 1; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c] + " ");
        }
    }
}
