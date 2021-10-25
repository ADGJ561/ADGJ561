/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.util.ArrayList;

/**
 *
 * @author OLAF
 */
public class Rede1 {
   
    private ArrayList<Utilizador> listaUtilizadores;
            
   
    
//Arrays
           

    
    public Rede1 () {
        
        this.listaUtilizadores = new ArrayList<>();
      
    }
    
  
    
    
     
   public void adicionarUtilizador(Utilizador u1) {
        listaUtilizadores.add(u1);
    }

    @Override
    public String toString() {
        return "Rede1{" + "listaUtilizadores=" + listaUtilizadores + '}';
    }
    
    
    
}
