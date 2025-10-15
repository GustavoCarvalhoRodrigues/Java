package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */
/*  Crie um programa que calcule e mostre na tela o resultado da soma entre 
6 + 8 + 10 + 12 + 14 + ... + 98 + 100.  */
public class QuadragesimoSextoExercicio {
    public static void main(String[] args) {
        int num = 6;
        int resultado = 0;

        do {
            System.out.print(num);
            resultado += num;
            num += 2;

            if (num <= 100) {
                System.out.print(" + ");
            } else {
                System.out.print(".\n");
            }

        } while (num <= 100);

        System.out.println("Resultado: " + resultado);
    }
}
