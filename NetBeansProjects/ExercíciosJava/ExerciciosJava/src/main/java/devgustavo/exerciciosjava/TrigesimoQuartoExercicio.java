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
 O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no 
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas. 
- abaixo de 18.5: Abaixo do peso 
- entre 18.5 e 25: Peso ideal 
- entre 25 e 30: Sobrepeso 
- entre 30 e 40: Obesidade 
- acima de 40: Obseidade mórbida 
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado 
da altura) 
*/
public class TrigesimoQuartoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite seu peso (KG): ");
        float peso = entrada.nextFloat();
        
        System.out.print("Digite sua altura (m): ");
        float altura = entrada.nextFloat();
        
        double calculoImc = peso / Math.pow(altura, 2);
        String mensagem;
        
        if(calculoImc < 18.5){
            mensagem = "ABAIXO DO PESO";
        }else if(calculoImc < 25){
            mensagem = "PESO IDEAL";
        }else if(calculoImc < 30){
            mensagem = "SOBREPESO";
        }else if(calculoImc < 40){
            mensagem = "OBESIDADE";
        }else{
            mensagem = "OBESIDADE MÓRBIDA";
        }
        System.out.printf("Peso: %.2fKg | Altura: %.2fm | Cálculo do IMC: %.1f | Resultado: %s%n", 
                peso, altura, calculoImc ,mensagem);
        
        entrada.close();
    }
}
