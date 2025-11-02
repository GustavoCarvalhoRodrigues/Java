/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package devgustavo.vetor04;

import java.util.Arrays;

/**
 *
 * @author gusta
 */
public class Vetor04 {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for(int v: vet){
            System.out.print(v + " ");
        }
        System.out.println("");
        int p = Arrays. binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição " + p);
    }
}
