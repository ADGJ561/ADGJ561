/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author OLAF
 */
public class Relacionamento implements Serializable {

    private LocalDateTime dataAceitacao;
    //private LocalDateTime dataEnvio;
    private boolean estado;
    private String nomeAmigo;

    public Relacionamento() {
        this.dataAceitacao = LocalDateTime.now();
        this.estado = false;
        this.nomeAmigo = getNomeAmigo();
    }

    public Relacionamento(LocalDateTime dataAceitacao, boolean estado, String nomeAmigo) {
        this.dataAceitacao = dataAceitacao;
        this.estado = estado;
        this.nomeAmigo = nomeAmigo;
    }

    public Relacionamento(Relacionamento r) {
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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Relacionamento{" + "dataAceitacao=" + dataAceitacao + ", estado=" + estado + ", nomeAmigo=" + nomeAmigo + '}';
    }

   

    

}
