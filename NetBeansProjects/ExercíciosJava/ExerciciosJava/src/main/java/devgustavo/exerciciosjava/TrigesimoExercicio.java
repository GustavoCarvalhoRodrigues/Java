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
 [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
de triângulo será formado:  
- EQUILÁTERO: todos os lados iguais 
- ISÓSCELES: dois lados iguais 
- ESCALENO: todos os lados diferentes 
*/
public class TrigesimoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Primeiro segmento: ");
        float primeiroSegmento = entrada.nextFloat();
        
        System.out.print("Segundo segmento: ");
        float segundoSegmento = entrada.nextFloat();
        
        System.out.print("Terceiro segmento: ");
        float terceiroSegmento = entrada.nextFloat();
        
        String triangulo;
        
        if(primeiroSegmento < segundoSegmento + terceiroSegmento 
        && segundoSegmento < primeiroSegmento + terceiroSegmento 
        && terceiroSegmento < primeiroSegmento + segundoSegmento){
          
           if(primeiroSegmento == segundoSegmento && segundoSegmento == terceiroSegmento){
               triangulo = "EQUILÁTERO";
           } else if(primeiroSegmento == segundoSegmento || segundoSegmento == terceiroSegmento 
                   || terceiroSegmento == primeiroSegmento) {
               triangulo = "ISÓSCELES";
           } else{
               triangulo = "ESCALENO";
           }
           
            System.out.printf("Os segmentos informados formam um triângulo %s.%n", triangulo);
        } else {
            System.out.println("Os segmentos informados NÃO podem formar um triângulo.");
        }
        entrada.close();
    }
}
