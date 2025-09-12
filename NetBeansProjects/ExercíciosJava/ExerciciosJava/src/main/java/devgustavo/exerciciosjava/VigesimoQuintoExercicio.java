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
/*
[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. 
Analise seus comprimentos e diga se é possível formar um triângulo com essas 
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento 
de cada lado deve ser menor que a soma dos outros dois.
*/
public class VigesimoQuintoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Primeiro segmento: ");
        float primeiroSegmento = entrada.nextFloat();
        
        System.out.print("Segundo segmento: ");
        float segundoSegmento = entrada.nextFloat();
        
        System.out.print("Terceiro segmento: ");
        float terceiroSegmento = entrada.nextFloat();
        
        String mensagem;
        if(primeiroSegmento < segundoSegmento + terceiroSegmento && 
           segundoSegmento < primeiroSegmento + terceiroSegmento && 
           terceiroSegmento < primeiroSegmento + segundoSegmento){
            
           mensagem = "É POSSÍVEL FORMAR UM TRIÂNGULO";
        } else{
           mensagem = "NÃO É POSSÍVEL FORMAR UM TRIÂNGULO";
        }
        System.out.printf("1°reta: %.1f| 2°reta: %.1f| 3°reta: %.1f| mensagem: %s"
        , primeiroSegmento, segundoSegmento, terceiroSegmento, mensagem);
        
        entrada.close();
    }
}
