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

    /**
     * @param args the command line arguments
     */
    String nomeLogin = "";
         



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
       r.getListaUtilizadores().get(i); //ACABAR XD
         i++; 
     
     
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
    
    public void Login(Rede rede){
        System.out.println("Username: ");
        String nome = scan.nextLine();
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false){
        System.out.println("nao existe");
        }else {
        System.out.println("Palavra-Passe: ");
        String pwd = scan.nextLine();
        boolean resp2 = rede.VerificarLogin(nome, pwd);
            if (resp2 == false) {
                System.out.println("Palavra passe errada");
            }else {
                System.out.println("Palavra passe correta");
                String nomeLogin = nome;
                System.out.println("Logado");
            }
        }
    }
    public void registarUtilizador(Rede rede){
        System.out.println("Insira username: ");
        String nome = scan.nextLine();
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == true){
        System.out.println("username disponivel");
        }
        else {
       String nomeLogin = nome;
       System.out.println("Insira Palavra-passe: ");
        String pwd = scan.nextLine();
            System.out.println("Insira a sua data de nascimento");
            Data dataNas = new Data();
        rede.registarUtilizador(nome, dataNas, nomeLogin, pwd);
        }
    }
    
    public void EditarPerfil(Rede rede){
        System.out.println("Selecione o numero do que pretende editar");
        System.out.println("1-nome");
        System.out.println("2-data de Nascimento");
        System.out.println("3-Interesses");
        System.out.println("4-Login");
        System.out.println("5-Password");
        int op = scan.nextInt();
        switch (op) {
            case 1:
            System.out.println("Nome pretendido?");
            String nomePretendido = scan.nextLine();
            rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), nomePretendido);
            break;
            case 2:
            System.out.println("Data nasicmento pretendida?");
            String dataNascimento = scan.nextLine();
            rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), dataNascimento);
            break;
            case 3:
                System.out.println("Pretende adicionar ou remover?");
                System.out.println("1-Adicionar");
                System.out.println("2-Remover");
            int dec = scan.nextInt();
                if (dec==0) {
                    System.out.println("Qual interesse pretende inserir?");
                    String interesse = scan.nextLine();
                    rede.adicionarInteresses(rede.procurarUtilizador2(nomeLogin),interesse);
                }else{
                     System.out.println("Qual interesse pretende remover?");
                     String interesse = scan.nextLine();
                    rede.RemoverInteresses(rede.procurarUtilizador2(nomeLogin),interesse);
                }
            break;
            case 4:
                System.out.println("Novo login?");
            String NovoLogin = scan.nextLine();
            rede.alterarLogin(rede.procurarUtilizador2(nomeLogin), NovoLogin);
            break;
            case 5:System.out.println("Nova Password?");
            String pwd = scan.nextLine();
            rede.alterarPwd(rede.procurarUtilizador2(nomeLogin),pwd);
            break;
        
        }
        
        
        
    }
    
}
