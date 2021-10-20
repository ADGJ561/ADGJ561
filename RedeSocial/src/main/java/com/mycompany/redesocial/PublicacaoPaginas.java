/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.util.ArrayList;

/**
 *
 * @author airto
 */
public class PublicacaoPaginas {
    private Publicacao publicacao;
    private Pagina pagina;
    private ArrayList <Comentario> comentarios = new ArrayList<>();
    private ArrayList <Reacao> reacoes = new ArrayList<>();
    
    public PublicacaoPaginas(Publicacao publicacao, Pagina pagina) {
        this.publicacao = publicacao;
        this.pagina = pagina;
    }

    
    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    
    public void adicionarReacao(Reacao reacao){
        reacoes.add(reacao);
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
