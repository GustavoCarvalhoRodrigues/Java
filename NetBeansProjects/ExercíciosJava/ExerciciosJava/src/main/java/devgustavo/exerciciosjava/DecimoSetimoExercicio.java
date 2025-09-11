/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;
import java.text.NumberFormat; // formatar números de várias formas com casas decimais
import java.util.Locale; // representa uma configuração regional (idioma + país).
/**
 *
 * @author gusta
 */

/*  Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.  */
public class DecimoSetimoExercicio {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat formataMoeda  = NumberFormat.getCurrencyInstance(new Locale("pt", "Br")); 
        
        System.out.print("Quantos (Km) estava esse carro: ");
        float velocidade = entrada.nextFloat();
        
        if (velocidade <= 80) {
            System.out.println("VELOCIDADE DENTRO DOS LIMITES DA VIA");
        } else {
            float valorMulta = (velocidade - 80) * 5;
            System.out.println("MULTADO! VALOR DA MULTA: " + formataMoeda.format(valorMulta));
        }
        entrada.close();
    }
}
