/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.resolucaotela;


import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Pega as informações da tela do sistema
         Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tela = tk.getScreenSize();

        // Mostra a largura e altura
        System.out.println("A resolução da sua tela é: " 
                           + tela.width + " x " + tela.height);
    }
}



