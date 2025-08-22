/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idiomasistema;

import java.util.Locale;

/**
 *
 * @author gusta
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "Br"));
        System.out.println(Locale.getDefault());
        System.out.println("Seu sistema está em Português");
    }
}
