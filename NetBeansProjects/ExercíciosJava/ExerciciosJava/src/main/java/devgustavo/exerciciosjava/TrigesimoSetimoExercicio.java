/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
/*
 Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, 
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. 
No final, mostre o seu novo salário, baseado na tabela a seguir: 
- Mulheres 
- menos de 15 anos de empresa: +5% 
- de 15 até 20 anos de empresa: +12% 
- mais de 20 anos de empresa: +23% 
- Homens 
- menos de 20 anos de empresa: +3% 
- de 20 até 30 anos de empresa: +13% 
- mais de 30 anos de empresa: +25% 

*/
public class TrigesimoSetimoExercicio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o salário desse funcionário: R$");
        double salarioFuncionario = entrada.nextDouble();
        
        System.out.print("Digite o gênero do funcionário (MULHER / HOMEM): ");
        String generoFuncionario =  entrada.next().toUpperCase();
        
        System.out.print("Quantos anos esse funcionário trabalha na empresa: ");
        int anosTrabalhados = entrada.nextInt();
        
        double novoSalario = 0;
        boolean generoValido = true;
        
        if("MULHER".equals(generoFuncionario)){ 
            if(anosTrabalhados < 15){
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.05);
            } else if(anosTrabalhados <= 20){
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.12);
            } else{
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.23);
            }
        } else if("HOMEM".equals(generoFuncionario)){
            if(anosTrabalhados < 20){
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.03);
            } else if(anosTrabalhados <= 30){
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.13);
            } else{
                novoSalario = salarioFuncionario + (salarioFuncionario * 0.25);
            }
        } else{
            generoValido = false;
            System.out.println("⚠️ Gênero inválido! Use MULHER ou HOMEM.");
        }
        
        if(generoValido){
            System.out.printf("Gênero: %s | Novo salário: R$%.2f", 
                    generoFuncionario, novoSalario); 
        }
     entrada.close();
    }
}
