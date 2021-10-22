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

    String filepath = "utilizador.txt";

    private static Scanner scanner;

    public static void main(String[] args) {
        String login = "123";
        String pwd = "123";
        String filepath = "utilizadores.txt";
        int id;
        System.out.println("funciona?");
       verificarLogin(login,pwd,filepath);
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
                System.out.println(found+"ajuda");
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
    
}
