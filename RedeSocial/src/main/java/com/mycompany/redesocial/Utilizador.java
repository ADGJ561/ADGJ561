/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.File;
import java.util.Scanner;

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

    }

    public Utilizador(String nome, Data dataNas, String interesses, String login, String pwd) {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = nome;
        this.dataNas = new Data();
        this.interesses = interesses;
        this.login = login;
        this.pwd = pwd;

    }

    public Utilizador(Utilizador u) {
        nrUtilizadores++;
        this.codUT = nrUtilizadores;
        this.nome = u.nome;
        this.dataNascimento = new Data(u.dataNasc);
        this.interesses = u.interesses;
        this.login = u.login;
        this.pwd = u.pwd;
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
}
