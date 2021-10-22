/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.util.Scanner;

/**
 *
 * @author OLAF
 */
public class Main {
Scanner scan = new Scanner(System.in);
private static String mail="";

         



    public void reagirPublicacao(PublicacaoPaginas p){
    System.out.println("1-LIKE / 2-DISLIKE");
    int opcao = scan.nextInt();
    switch(opcao){
        case 1:
            p.adicionarReacao(new Reacao(true));
            break;
        case 2:
            p.adicionarReacao(new Reacao(false));
    }
      }
    public void comentarPublicacao(PublicacaoPaginas p){
    System.out.println("Escreva o seu comentario ");
    String corpoC= scan.nextLine();
    p.adicionarComentario(new Comentario(corpoC));
     }
    
    public void fazerPublicacao(Utilizador u, Rede r){
    System.out.println("Escreva a sua publicação");
    String corpo= scan.nextLine();
    Publicacao p= new Publicacao(corpo);
    int i=0;
    for (Relacionamento re : u.getListaRelacionamentos()){
     if(re.getNomeAmigo().equals(r.getListaUtilizadores().get(i).getNome())){
     i++; //ACABAR
     
     }
    
    
    }
     
    
    
    
    
    
    }
    
    public static void main(String[] args) {

        /*
        private Rede rede = ManipulacaoSerializacao.lerInformacaoFicheiro("rede.obj");
        
        loginUtilizador(r);
        
        processarMenu(r);
        
        public void registarUtilicador(Rede rede) {
        
        //Pedir dados ao utilizador
        
        nome = ...
        
        rede.registarUtilizador(nome,...
        
        Login
        
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false)
        System.out.println("nao existe");
        else
        nomeLogin = nome;
        
        Passoword
        
        if (resp == false)
        System.out.println("pass incorreta");
        else
        pwdLogin = pwd;
        
        */
    }
    
}
