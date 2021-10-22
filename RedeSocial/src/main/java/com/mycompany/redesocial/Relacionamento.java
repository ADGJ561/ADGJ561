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
    private int codUtAmigo;
    
    
    public Relacionamento () {
        this.dataAceitacao = new Data();
        this.estado = false;
        this.codUtAmigo = getCodUtAmigo();
    }

    public Relacionamento (Data dataAceitacao, boolean estado, int codUtAmigo) {
        this.dataAceitacao = dataAceitacao;
        this.estado = estado;
        this.codUtAmigo = codUtAmigo;
    }
    
    public Relacionamento (Relacionamento r) {
        this.dataAceitacao = r.dataAceitacao;
        this.estado = r.estado;
        this.codUtAmigo = r.codUtAmigo;
    }
    
    public Data getDataAceitacao() {
        return dataAceitacao;
    }

    public boolean isEstado() {
        return estado;
    }

    public int getCodUtAmigo() {
        return codUtAmigo;
    }
    
    
    
    
    public Relacionamento ()
    
}