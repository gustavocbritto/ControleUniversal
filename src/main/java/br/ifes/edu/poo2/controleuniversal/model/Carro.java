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
public class Carro {
    public boolean portaAberta;
    public Carro(){
        portaAberta = false;
    }
    
    public boolean isOpen(){
        return portaAberta;
    }
    
    public void executa(){
        portaAberta = !portaAberta;
        if(portaAberta){
            System.out.println("Carro Aberto");
        }else
            System.out.println("Carro Fechado");
    }
}
