/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author gusta
 */

/*
 Faça um algoritmo que leia a largura e altura de uma parede, calcule e 
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, 
sabendo que cada litro de tinta pinta uma área de 2metros quadrados. 
*/
public class DecimoExercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a largura dessa parede: ");
        float largura = entrada.nextFloat();
        
        System.out.print("Digite a altura dessa parede: ");
        float altura = entrada.nextFloat();
        
        float area = largura * altura;
        float tinta = area / 2;
        
        System.out.printf("A parede tem largura de %.1fm e altura de %.1fm.%n", largura, altura);
        System.out.printf("A área total é de %.2fm² e serão necessários %.2f litros de tinta.%n", area, tinta);
    }
}
