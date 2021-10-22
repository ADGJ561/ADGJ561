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
    
    public void fazerPublicacao(Utilizador u){
    System.out.println("Escreva a sua publicação");
    String corpo= scan.nextLine();
    Publicacao p= new Publicacao(corpo);
    }
    
    //Pedir amizade - adicionar um objeto à lista de relacionamentos dos utilizadores ativos e destino
    //esse relacionamento terá data igual à data em que foi aceite
    //estado false enquanto nao foi aceite
    
    public void pedirAmizade (Utilizador u, Rede r) {
        boolean sair = false;
        String input = "";        
        while (input.equals("")) {
            System.out.println("\n");
            System.out.println("Escreva o nome do utilizador que pretende adicionar como amigo:");
            input = scan.next();
            int i=0;
            for (Utilizador u : u.getListaUtilizadores) {
                if (input.compareTor.getlistaUtilizadores().get(0).getNome()))
            }
                
        }
        
    }
    
    
    
    private static int escolheMenu1(Scanner sc) {
        int opcao = -1;
        while (opcao < 0) {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 1                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Login;");
            System.out.println("2: Registar;");
            System.out.println("3: Sair;");            
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
            opcao = sc.nextInt();
        }

        return opcao;
    }
    
    private static int escolheMenu2(Scanner sc) {
        int opcao = -1;
        while (opcao < 0) {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 2                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Criar Utilizador;");
            System.out.println("2: Voltar;");        
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
            opcao = sc.nextInt();
        }

        return opcao;
    }
    
    private static int escolheMenu3(Scanner sc) {
        int opcao = -1;
        while (opcao < 0) {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 3                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Editar Perfil;");
            System.out.println("2: Criar Página;");
            System.out.println("3: Consultar página do utilizador ativo;");
            System.out.println("4: Consultar página de outro utilizador;");
            System.out.println("5: Pedir Amizade;");
            System.out.println("6: Fazer publicação;");
            System.out.println("7: Listar publicações do utilizador ativo;");
            System.out.println("8: Listar publicações partilhadas com o utilizador ativo;");
            System.out.println("9: Listar relacionamentos do utilizador ativo;");
            System.out.println("10: Comentar uma publicação;");
            System.out.println("11: Reagir a uma publicação;");
            System.out.println("12: Voltar;");
            
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
            opcao = sc.nextInt();
        }

        return opcao;
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
