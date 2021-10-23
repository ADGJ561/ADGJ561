/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author OLAF
 */
public class Rede implements Serializable {
       
    private final String NOMEREDE = "Social Bit";
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    private final LocalDate DATACRIACAO = java.time.LocalDate.now();
    private int qtdUt;
    
    private String nomeR;
    private LocalDate dataC;
    
//Arrays
    private ArrayList<Utilizador> listaUtilizadores = new ArrayList<>();       
    private ArrayList<PublicacaoPaginas> listaPubPag = new ArrayList<>();       

    
    public Rede () {
        this.nomeR = NOMEREDE;
        this.dataC = DATACRIACAO;
        this.qtdUt = qtdUt;
        this.listaUtilizadores = listaUtilizadores;
        this.listaPubPag = listaPubPag;
    }
    
    public Rede (String nomeR, LocalDate dataC, int qtdUt, ArrayList<Utilizador> listaUtilizadores, ArrayList<PublicacaoPaginas> listaPubPag) {
        this.nomeR = NOMEREDE;
        this.dataC = DATACRIACAO;
        this.qtdUt = qtdUt;
        this.listaUtilizadores = listaUtilizadores;
        this.listaPubPag = listaPubPag;
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public int getQtdUt() {
        return qtdUt;
    }

    public String getNomeR() {
        return nomeR;
    }

    public LocalDate getDataC() {
        return dataC;
    }

    public ArrayList<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }

    public ArrayList<PublicacaoPaginas> getListaPubPag() {
        return listaPubPag;
    }
    
    public boolean procurarUtilizador (String nome) {
        for (Utilizador u : listaUtilizadores)  {
            if(u.getNome().compareTo(nome) == 0) {
                return true;
                
            }
            
        }return false;
    }
    public Utilizador procurarUtilizador2 (String nome) {
        for (Utilizador u : listaUtilizadores) 
            if(u.getNome().compareTo(nome) == 0) {
                return u;
                
            }
            return null;
        }  
    
    
    
    void adicionarInteresses(Utilizador u,String adicionar){
        u.getInteresses().add(adicionar);
    }
    
    void RemoverInteresses(Utilizador u,String i){
       u.getInteresses().remove(i);
    }
    
    
    
    public boolean VerificarLogin (String nome, String pwd) {
        for (Utilizador u : listaUtilizadores) 
            if(u.getNome().compareTo(nome)==0 && u.getPwd().compareTo(pwd)== 0) {
                return true;
            }return false;
        }
        
     
    
        
    public void registarUtilizador (String nome, Data dataNas, String login, String pwd) {
        boolean x = procurarUtilizador(nome);
        if (x == false) {
            Utilizador u = new Utilizador (nome, dataNas, login, pwd);
            listaUtilizadores.add(u);
        }
    }
        
    public void removerUtilizador (String nome, Data dataNas, String login, String pwd) {
        boolean x = procurarUtilizador(nome);
        if (x == false) {
            Utilizador u = new Utilizador (nome, dataNas, login, pwd);
            listaUtilizadores.remove(u);
        }
    }
    
    public int contarUtilizadores (ArrayList<Utilizador> listaUtilizadores) {
        qtdUt = listaUtilizadores.size();
        return qtdUt;
    }
    
    public void listarUtilizadores () {
        int contagem = 0; // Para listar o numero ao utilizador para o selecionar no menu
        for (Utilizador u: listaUtilizadores) {
            contagem += 1;
            System.out.println(contagem + ". " + u.getNome()); 
        }
    }
    
    public void CriarPagina(String nomeLogin,String nome,boolean estado){
       Utilizador x = procurarUtilizador2(nomeLogin);
       x.getPagina().setNomePg(nome);
       x.getPagina().setEstado(estado);
    }
    
    public void alterarNomeUtilizador(Utilizador x,String u){
        
        x.setNome(u);
    }
         public void alterarLogin(Utilizador x,String u){
        
        x.setLogin(u);
    }
         
         public void alterarPwd(Utilizador x,String u){
        
        x.setPwd(u);
    }

    @Override
    public String toString() {
        return "Rede{" + "NOMEREDE=" + NOMEREDE + ", formatter=" + formatter + ", DATACRIACAO=" + DATACRIACAO + ", qtdUt=" + qtdUt + ", nomeR=" + nomeR + ", dataC=" + dataC + ", listaUtilizadores=" + listaUtilizadores + ", listaPubPag=" + listaPubPag + '}';
    }
         
}
