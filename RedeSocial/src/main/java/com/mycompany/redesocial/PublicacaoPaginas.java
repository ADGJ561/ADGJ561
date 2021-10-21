/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author airto
 */
public class PublicacaoPaginas {
    private Publicacao publicacao;
    private Pagina pagina;
    private ArrayList <Comentario> comentarios = new ArrayList<>();
    private ArrayList <Reacao> reacoes = new ArrayList<>();
    int nroReacoes;
    int nroComentarios;
    
    public PublicacaoPaginas(Publicacao publicacao, Pagina pagina) {
        this.publicacao = publicacao;
        this.pagina = pagina;
    }
    
    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
        nroComentarios++;
    }
    
    public void adicionarReacao(Reacao reacao){
        reacoes.add(reacao);
        nroReacoes++;
    }
    public void comentarPublicacao(){
        System.out.println("Escreva o seu comentario:");
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        comentarios.add(new Comentario(c));
        nroComentarios++;
    }
    public void reagirPublicacao(){
     Scanner scan = new Scanner(System.in);   
     System.out.println("1: like / 2: dislike");
     int r = scan.nextInt();
     if (r==1){
     reacoes.add(new Reacao(true)); //
     }
     
    }
    

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public ArrayList<Reacao> getReacoes() {
        return reacoes;
    }
    
}
