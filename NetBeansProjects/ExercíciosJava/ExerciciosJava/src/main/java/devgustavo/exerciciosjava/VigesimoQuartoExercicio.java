/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
/**
 *
 * @author gusta
 */
/*
 Faça um algoritmo que pergunte a distância que um passageiro deseja 
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para 
viagens até 200Km e R$0.45 para viagens mais longas.
*/
public class VigesimoQuartoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantos (Km) esse passageiro deseja percorrer: ");
        float distanciaPercorrida = entrada.nextFloat();
        
        float precoPassagem;
        if(distanciaPercorrida <= 200){
            precoPassagem = distanciaPercorrida * 0.50f;
        } else{
            precoPassagem = distanciaPercorrida * 0.45f;
        }
        NumberFormat moedaBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")); 
        
        System.out.printf("Distância: %.1f Km | Preço da passagem: %s%n", 
                          distanciaPercorrida, moedaBR.format(precoPassagem));
        entrada.close();
    }
}
