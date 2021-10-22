/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.util.Scanner;

/**
 *
 * @author airto
 */
public class teste {
public void reagirPublicacao(PublicacaoPaginas p){
     //PARA O MAIN
        Scanner scan = new Scanner(System.in);   
     System.out.println("1: like / 2: dislike");
     int r1 = scan.nextInt();
      switch(r1){
          case 1:
              p.adicionarReacao(new Reacao(true));
              break;
          case 2:
              p.adicionarReacao(new Reacao(false)); 
              break;
    }
      }
public void comentarPublicacao(PublicacaoPaginas p){
        //PARA O MAIN
        System.out.println("Escreva o seu comentario:");
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        p.adicionarComentario(c);
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
