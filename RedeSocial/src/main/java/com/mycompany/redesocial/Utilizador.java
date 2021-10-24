/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.File;
import java.time.LocalDateTime;
//import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import com.mycompany.utilitarios.Data;
import java.io.Serializable;

/**
 *
 * @author Fac
 */
public class Utilizador implements Serializable {

    private static int nrUtilizadores;
    private int codUT;
    private String nome;
    private Data dataNas;
    private ArrayList listaInteresses = new ArrayList<>();
//    private LocalDateTime dataNascimento;
//    private String interesses;
    private ArrayList<Publicacao> Publicacoes = new ArrayList<>();
    private ArrayList<Relacionamento> listaRelacionamentos = new ArrayList<>();
    private Pagina pagina;

//    public LocalDateTime getDataNascimento() {
//        return dataNascimento;
//    }
    
   

    public ArrayList<Publicacao> getPublicacoes() {
        return Publicacoes;
    }

    public ArrayList<Relacionamento> getRelacionamentos() {
        return listaRelacionamentos;
    }

    //adicionar Relacionamentos
    public Pagina getPagina() {
        return pagina;
    }

   

    public void setPublicacoes(ArrayList<Publicacao> Publicacoes) {
        this.Publicacoes = Publicacoes;
    }

    public void setRelacionamentos(ArrayList<Relacionamento> Relacionamentos) {
        this.listaRelacionamentos = Relacionamentos;
//    public void setDataNascimento(LocalDateTime dataNascimento) {
//        this.dataNascimento = dataNascimento;
  }

    public void setListaRelacionamentos(ArrayList<Relacionamento> listaRelacionamentos) {
        this.listaRelacionamentos = listaRelacionamentos;
    }

    

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }
    
    private String login;
    private String pwd;

    private static final String NOME_PREDEFINIDO = "Nao definido";
    private static final String LOGIN_PREDEFINIDO = "";
    private static final String PWD_PREDEFINIDO = "";

    private static Scanner scanner;

    public Utilizador() {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = NOME_PREDEFINIDO;
        this.dataNas = new Data();
        this.listaInteresses =new ArrayList<>() ;
        this.login = LOGIN_PREDEFINIDO;
        this.pwd = PWD_PREDEFINIDO;
         this.Publicacoes = new ArrayList<>();
          this.listaRelacionamentos = new ArrayList<>();
          this.pagina = new Pagina();
    }

    public Utilizador(String nome, Data dataNas, String login, String pwd) {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = nome;
        this.dataNas = new Data();
        this.listaInteresses = new ArrayList<>();
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
        this.dataNas = new Data(u.dataNas);
        this.listaInteresses = u.listaInteresses;
//        this.dataNascimento = u.dataNascimento;
//        this.interesses = u.interesses;
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

    public ArrayList getInteresses() {
        return listaInteresses;
    }

    public String getLogin() {
        return login;
    }

    public String getPwd() {
        return pwd;
    }

    public ArrayList<Relacionamento> getListaRelacionamentos() {
        return listaRelacionamentos;
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

    public void setListaInteresses(ArrayList listaInteresses) {
        this.listaInteresses = listaInteresses;
    }

    

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public void adicionarPublicacoes(Publicacao p){
    Publicacoes.add(p);
    
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
    public void fazerPublicacao(){ //apagar XD 
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
    
    public boolean procurarRelacionamento (Utilizador u, String nomeAmigo) {
        for (Relacionamento r : u.getListaRelacionamentos()) {
            if(r.getNomeAmigo().compareTo(nomeAmigo) == 0) {
                return true;
            }
        }
        return false;
    }   
    
}
  