package devgustavo.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
/*  
Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários. 
No final, mostre o total de salários pagos aos homens e o total pago às 
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não 
sempre que ler os dados de um funcionário.
*/
public class QuintagesimoSetimoExercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double totalSalarioM = 0;
        double totalSalarioF = 0;
        String continuar;

        while (true) {
            System.out.print("Digite o salário: R$");
            double salario = entrada.nextDouble();

            System.out.print("Digite o sexo desse funcionário (M ou F): ");
            String sexo = entrada.next().toUpperCase();

            if (sexo.equals("M")) {
                totalSalarioM += salario;
            } else if (sexo.equals("F")) {
                totalSalarioF += salario;
            } else {
                System.out.println("Sexo inválido! Dados ignorados.");
            }

            System.out.print("Quer continuar (SIM ou NAO)? ");
            continuar = entrada.next().toUpperCase();

            if (continuar.equals("NAO")) {
                break;
            }
        }

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.printf("Total de salários pagos aos homens: R$%.2f%n", totalSalarioM);
        System.out.printf("Total de salários pagos às mulheres: R$%.2f%n", totalSalarioF);
    }
}
