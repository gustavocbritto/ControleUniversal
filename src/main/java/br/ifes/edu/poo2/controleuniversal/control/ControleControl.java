/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo2.controleuniversal.control;

import br.ifes.edu.poo2.controleuniversal.model.Controle;
import br.ifes.edu.poo2.controleuniversal.model.ControleImpl;

/**
 *
 * @author Gustavo
 */
public class ControleControl {
    private Controle controle = new ControleImpl();
    
    public void execute(){
        controle.botao1();
        controle.botao2();
        controle.botao1();
    }
}
