/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package devgustavo.contador01;

/**
 *
 * @author gusta
 */
public class Contador01 {

    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10){
            contador++;
            if(contador == 2 || contador == 3 || contador == 4){
                continue;
            }
            if(contador == 7){
                break;
            }
            System.out.println("Cambalhota " + contador);
            
        }
    }
}
