/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package funcao01;

import Classes.Fatorial;

/**
 *
 * @author gusta
 */
public class Funcao01 {

    public static void main(String[] args) {
        Fatorial f = new Fatorial();
        f.setValor(5);
        System.out.print(f.getFormula());
        System.out.println(f.getFatorial());
    }
}
