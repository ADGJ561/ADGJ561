/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author airto
 */
public class Pagina implements Serializable {

    private static int nrPaginas;
    private int codPg;
    private String nomePg;
    private LocalDateTime dataCriacao;
    private int qtdAmigos;
    private Data dataUtAlteracao;
    public boolean estado;
     private static final String NOME_PREDEFINIDO = "Nao definido";
    private static final int QTDAMIGOS_PREDEFINIDO = 0;
    private static final boolean ESTADO_POR_OMISSAO = true;
    

    public Pagina() {
        nrPaginas++;
        this.codPg=nrPaginas;
        this.nomePg=NOME_PREDEFINIDO;
        this.qtdAmigos=QTDAMIGOS_PREDEFINIDO;
        this.estado=ESTADO_POR_OMISSAO;
        this.dataCriacao = LocalDateTime.now();
    }

    public Pagina(String nomePg, int qtdAmigos, boolean estado) {
        nrPaginas++;
        this.codPg = nrPaginas;
        this.nomePg = nomePg;
        this.qtdAmigos = qtdAmigos;
        this.estado = estado;
        this.dataCriacao = LocalDateTime.now();
    }
    
    public Pagina(Pagina p){
        nrPaginas++;
        this.codPg=nrPaginas;
        this.estado=p.estado;
        this.nomePg=p.nomePg;
        this.qtdAmigos=p.qtdAmigos;
        this.dataCriacao = p.dataCriacao;
    }

    public static int getNrPaginas() {
        return nrPaginas;
    }

    public String getNomePg() {
        return nomePg;
    }

    public int getQtdAmigos() {
        return qtdAmigos;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setNomePg(String nomePg) {
        this.nomePg = nomePg;
    }

    public void setQtdAmigos(int qtdAmigos) {
        this.qtdAmigos = qtdAmigos;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  

    @Override
    public String toString() {
        return  "Código da página= " + codPg +
                "\nNome da página= " + nomePg + 
                "\nData de criação=" + dataCriacao.format(dtf); 
                }


}

