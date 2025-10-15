package devgustavo.exerciciosjava;

/**
 *
 * @author gusta
 */
/*  Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 
450 + 400 + 350 + 300 + ... + 50 + 0  */
public class QuadragesimoSetimoExercicio {
    public static void main(String[] args) {
        int num = 500;
        int resultado = 0;

        do {
            System.out.print(num);
            resultado += num;
            num -= 50;

            if (num >= 0) {
                System.out.print(" + ");
            } else {
                System.out.print(".\n");
            }

        } while (num >= 0);

        System.out.println("Resultado: " + resultado);
    }
}
