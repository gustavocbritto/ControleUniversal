/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.controleuniversal.model;

/**
 *
 * @author Gustavo
 */
public class AControle implements Controle{
    private Carro carro;
    private Portao portao;
    
    public AControle(){
        carro = new Carro();
        portao = new Portao();
    }
    public void botao1(){
        if(!carro.isOpen()){
            carro.executa();
        }
        if(!portao.isOpen()){
            portao.executa();
        }
            
    } 
    
    public void botao2(){
        if(carro.isOpen()){
            carro.executa();
        }
        if(portao.isOpen()){
            portao.executa();
        }
    }  
}
