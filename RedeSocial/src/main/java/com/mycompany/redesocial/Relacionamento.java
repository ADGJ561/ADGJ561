/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import javax.xml.crypto.Data;


/**
 *
 * @author OLAF
 */
public class Relacionamento {
    
    private Data dataAceitacao = new Data();
    private boolean estado;
    private String nomeAmigo;
    
    
    public Relacionamento () {
        this.dataAceitacao = new Data();
        this.estado = false;
        this.nomeAmigo = getNomeAmigo();
    }

    public Relacionamento (Data dataAceitacao, boolean estado, String nomeAmigo) {
        this.dataAceitacao = dataAceitacao;
        this.estado = estado;
        this.nomeAmigo = nomeAmigo;
    }
    
    public Relacionamento (Relacionamento r) {
        this.dataAceitacao = r.dataAceitacao;
        this.estado = r.estado;
        this.nomeAmigo = r.nomeAmigo;
    }
    
    public Data getDataAceitacao() {
        return dataAceitacao;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }
    
    
    
    
}