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
    private Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    String nomeLogin = "";
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
        String nome = sc.nextLine();
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false){
        System.out.println("nao existe");
        }else {
        System.out.println("Palavra-Passe: ");
        String pwd = sc.nextLine();
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
        String nome = sc.nextLine();
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == true){
        System.out.println("username disponivel");
        }
        else {
       String nomeLogin = nome;
       System.out.println("Insira Palavra-passe: ");
        String pwd = sc.nextLine();
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
        int op = sc.nextInt();
        switch (op) {
            case 1:
            System.out.println("Nome pretendido?");
            String nomePretendido = sc.nextLine();
            rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), nomePretendido);
            break;
            case 2:
            System.out.println("Data nasicmento pretendida?");
            String dataNascimento = sc.nextLine();
            rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), dataNascimento);
            break;
            case 3:
                
        
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
