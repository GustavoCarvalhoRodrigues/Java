/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package devgustavo.sistemajudicial;

/**
 *
 * @author gusta
 */
public class ProcessoCivel extends Processo{
    private String parte;
    
    public ProcessoCivel(String numero, String dataCriacao, String parte) {
        super(numero, dataCriacao);
        this.parte = parte;
    }
}
