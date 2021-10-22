/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author OLAF
 */
public class Rede {
    
    private ArrayList<Utilizador> listaUtilizadores = new ArrayList<>();

    
    private final String NOMEREDE = "Social Bit";
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    private final LocalDate DATACRIACAO = java.time.LocalDate.now();
    private int qtdUt;
    
    private String nomeR;
    private LocalDate dataC;
    //Arrays
    
    
        

    
    public Rede () {
     this.nomeR = NOMEREDE;
     this.dataC = DATACRIACAO;
     this.qtdUt = qtdUt;
     
    }
    
    public void adicionarUtilizadores (String nome, Data dataNas, String interesses, String login, String pwd) {
        listaUtilizadores.add(new Utilizador(nome, dataNas, interesses, login, pwd));
    }
    
}
