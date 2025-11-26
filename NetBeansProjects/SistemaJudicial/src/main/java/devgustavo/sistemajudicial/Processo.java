package devgustavo.sistemajudicial;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusta
 */
public class Processo extends Object{
    private String numero;
    private String dataCriacao;
    
    public Processo(String numero, String dataCriacao){ // Construtor
        super();
        this.numero = numero;
        this.dataCriacao = dataCriacao;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getDataCriacao(){
        return dataCriacao;
    }
    
    public void setDataCriacao(String dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        // Text Blocks
        return "Processo\n N° " + getNumero();
    }
}
