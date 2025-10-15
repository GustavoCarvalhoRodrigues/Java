/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package devgustavo.exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int num;
        int numPares = 0;
        int numImpares = 0;
        int acimaDeCem = 0;
        int totalValores = 0;
        int somaValores = 0;

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor <br>" +
                    "(0 interrompe) </html>"));

            if (num != 0) { // só conta se não for 0
                totalValores++;  // conta o número digitado
                somaValores += num; // acumula para calcular a média

                if (num % 2 == 0) {
                    numPares++;
                } else {
                    numImpares++;
                }

                if (num > 100) {
                    acimaDeCem++;
                }
            }

        } while (num != 0);

        int mediaValores = (totalValores > 0) ? somaValores / totalValores : 0;

        JOptionPane.showMessageDialog(null, "<html>Resultado: <hr><br>" +
                "Total de valores: " + totalValores +
                "<br>Total de Pares: " + numPares +
                "<br>Total de Ímpares: " + numImpares +
                "<br>Acima de 100: " + acimaDeCem +
                "<br>Média dos valores: " + mediaValores +
                "</html>");
    }
}

