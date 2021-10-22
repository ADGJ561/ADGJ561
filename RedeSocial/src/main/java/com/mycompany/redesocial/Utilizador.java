/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.crypto.Data;

/**
 *
 * @author Fac
 */
public class Utilizador {

    private static int nrUtilizadores;
    private int codUT;
    private String nome;
    private Data dataNascimento;
    private String interesses;
    private ArrayList<Publicacao> Publicacoes = new ArrayList<>();
    private ArrayList<Relacionamento> listaRelacionamentos = new ArrayList<>();
    private Pagina pagina;
    
    //adicionar Relacionamentos
    
    private String login;
    private String pwd;

    private static final String NOME_PREDEFINIDO = "Nao definido";
    private static final String INTERESSES_PREDEFINIDO = "";
    private static final String LOGIN_PREDEFINIDO = "";
    private static final String PWD_PREDEFINIDO = "";

    private static Scanner scanner;

    public Utilizador() {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = NOME_PREDEFINIDO;
        this.dataNas = new Data();
        this.interesses = INTERESSES_PREDEFINIDO;
        this.login = LOGIN_PREDEFINIDO;
        this.pwd = PWD_PREDEFINIDO;
         this.Publicacoes = new ArrayList<>();
          this.listaRelacionamentos = new ArrayList<>();
          this.pagina = new Pagina();
    }

    public Utilizador(String nome, Data dataNas, String interesses, String login, String pwd) {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = nome;
        this.dataNas = new Data();
        this.interesses = interesses;
        this.login = login;
        this.pwd = pwd;
        this.Publicacoes = new ArrayList<>();
          this.listaRelacionamentos = new ArrayList<>();
          this.pagina = new Pagina();

    }

    public Utilizador(Utilizador u) {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = u.nome;
        this.dataNascimento = new Data(u.dataNasc);
        this.interesses = u.interesses;
        this.login = u.login;
        this.pwd = u.pwd;
        this.Publicacoes = u.Publicacoes;
          this.listaRelacionamentos = u.listaRelacionamentos;
          this.pagina = u.pagina;
    }

    public static int getNrUtilizadores() {
        return nrUtilizadores;
    }

    public int getCodUT() {
        return codUT;
    }

    public String getNome() {
        return nome;
    }

    public String getInteresses() {
        return interesses;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public static void setNrUtilizadores(int nrUtilizadores) {
        Utilizador.nrUtilizadores = nrUtilizadores;
    }

    public void setCodUT(int codUT) {
        this.codUT = codUT;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static void verificarLogin(String login, String pwd, String filepath) {
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
        try {
            scanner = new Scanner(new File(filepath));
            scanner.useDelimiter("[,\n");

            while (scanner.hasNext() && !found) {
                tempUsername = scanner.next();
                tempPassword = scanner.next();
                if (tempUsername.trim().equals(login.trim()) && tempPassword.trim().equals(pwd.trim()));
                {
                    found = true;
                }
                scanner.close();
                System.out.println(found + "ajuda");
            }

        } catch (Exception e) {

        }
    }
    public void fazerPublicacao(){
       Scanner scan = new Scanner(System.in);
     System.out.println("Agora pode escrever a sua publicacção");
       String p= scan.next();
       Publicacao pb= new Publicacao(p);
     System.out.println("1-Fazer publicacao na sua pagina pessoal / 2-Fazer publicacao na pagina de um amigo");   
     int opcao= scan.nextInt();
     switch(opcao){
         case 1:
             //preciso de utilizadores com a sua pagina pessoal completo para finalizar esta funcao
            break;
     }
    
    }
    
    private boolean procurarRelacionamento (String nomeAmigo) {
        for (Relacionamento r : listaRelacionamentos) {
            if(r.getNomeAmigo().compareTo(nomeAmigo) == 0) {
                return true;
            }
        }
        return false;
    }   
    
    public void listarRelacionamentos () {
        int contagem = 0; // Para listar o numero ao utilizador para o selecionar no menu
        for (Relacionamento r: listaRelacionamentos) {
            contagem += 1;
            System.out.println(contagem + ". " + r.getNomeAmigo()); 
        }
    }    
    
    public void adicionarRelacionamento (Data dataAceitacao, boolean estado, String nomeAmigo) {
        boolean x = procurarRelacionamento(nomeAmigo);
        if (x == false) {
            Relacionamento r = new Relacionamento (dataAceitacao, estado, nomeAmigo);
            listaRelacionamentos.add(r);
        }
    }
        
    public void removerRelacionamento (Data dataAceitacao, boolean estado, String nomeAmigo) {
        boolean x = procurarRelacionamento(nomeAmigo);
        if (x == false) {
            Relacionamento r = new Relacionamento (dataAceitacao, estado, nomeAmigo);
            listaRelacionamentos.remove(r);
        }
    }
}
