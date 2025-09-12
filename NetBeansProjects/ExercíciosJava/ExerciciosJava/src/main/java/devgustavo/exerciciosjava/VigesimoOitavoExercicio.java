/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author gusta
 */
/*
 Faça um programa que leia a largura e o comprimento de um terreno 
retangular, calculando e mostrando a sua área em m². O programa também 
devemostrar a classificação desse terreno, de acordo com a lista abaixo: 
- Abaixo de 100m² = TERRENO POPULAR 
- Entre 100m² e 500m² = TERRENO MASTER 
- Acima de 500m² = TERRENO VIP 
*/
public class VigesimoOitavoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Qual a largura desse terreno: ");
        float largura = entrada.nextFloat();
        
        System.out.print("Qual o comprimento desse terreno: ");
        float comprimento = entrada.nextFloat();
        
        float area = largura * comprimento;
        
        String classificacaoTerreno;
        if(area < 100) {
            classificacaoTerreno = "TERRENO POPULAR";
        } else if(area <= 500){
            classificacaoTerreno = "TERRENO MASTER";
        } else{
            classificacaoTerreno = "TERRENO VIP";
        }
        System.out.printf("Largura: %.1fm%nComprimento: %.1fm%nÁrea: %.1fm²%nClassificação desse terreno: %s%n", 
                largura, comprimento, area, classificacaoTerreno);
        
        entrada.close();
    }
}
