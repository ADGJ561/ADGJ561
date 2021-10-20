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
        String login = "";
        String pwd = "";
        String filepath = "utilizadores.txt";

    }

    public static void verificarLogin(String login, String pwd, String filepath) {
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
        try {
            scanner = new Scanner(new File(filepath));
            scanner.useDelimiter("[,\n");
            
            while  (scanner.hasNext() && !found){
                tempUsername = scanner.next();
                tempPassword = scanner.next();
                if(tempUsername.trim().equals(login.trim())&& tempPassword.trim().equals(pwd.trim()));
                
            }
            
            
            
            
        } catch (Exception e) {

        }
    }
}
