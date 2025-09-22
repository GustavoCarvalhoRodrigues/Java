/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package devgustavo.exerciciosjava;
/*
 Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa 
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a 
tabela a seguir: 
- Carros populares (aluguel de R$90 por dia) 
- Até 100Km percorridos: R$0,20 por Km 
- Acima de 100Km percorridos: R$0,10 por Km 
- Carros de luxo (aluguel de R$150 por dia) 
- Até 200Km percorridos: R$0,30 por Km 
- Acima de 200Km percorridos: R$0,25 por Km
*/
import java.util.Scanner;

public class TrigesimoQuintoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o tipo de carro alugado (popular ou luxo): ");
        String tipoCarro = entrada.next().toLowerCase();

        System.out.print("Quantos dias alugados: ");
        int diasAlugados = entrada.nextInt();

        System.out.print("Quantos Km percorridos: ");
        float distanciaPercorrida = entrada.nextFloat();

        float precoTotal = 0;

        if ("popular".equals(tipoCarro)) {
            float precoDias = diasAlugados * 90;
            if (distanciaPercorrida <= 100) {
                precoTotal = precoDias + (distanciaPercorrida * 0.20f);
            } else {
                precoTotal = precoDias + (distanciaPercorrida * 0.10f);
            }
        } else if ("luxo".equals(tipoCarro)) {
            float precoDias = diasAlugados * 150;
            if (distanciaPercorrida <= 200) {
                precoTotal = precoDias + (distanciaPercorrida * 0.30f);
            } else {
                precoTotal = precoDias + (distanciaPercorrida * 0.25f);
            }
        } else {
            System.out.println("Tipo de carro inválido!");
            entrada.close();
            return; // encerra o programa caso o tipo seja inválido
        }

        System.out.printf("Preço a pagar: R$ %.2f%n", precoTotal);

        entrada.close();
    }
}


