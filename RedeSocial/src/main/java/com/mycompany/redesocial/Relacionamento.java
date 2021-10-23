/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDateTime;


/**
 *
 * @author OLAF
 */
public class Relacionamento {
    
    private LocalDateTime dataAceitacao;
    private boolean estado;
    private String nomeAmigo;
    
    
    public Relacionamento () {
        this.dataAceitacao = LocalDateTime.now();
        this.estado = false;
        this.nomeAmigo = getNomeAmigo();
    }

    public Relacionamento (LocalDateTime dataAceitacao, boolean estado, String nomeAmigo) {
        this.dataAceitacao = dataAceitacao;
        this.estado = estado;
        this.nomeAmigo = nomeAmigo;
    }
    
    public Relacionamento (Relacionamento r) {
        this.dataAceitacao = r.dataAceitacao;
        this.estado = r.estado;
        this.nomeAmigo = r.nomeAmigo;
    }
    
    public LocalDateTime getDataAceitacao() {
        return dataAceitacao;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }
    
    
    
    
}