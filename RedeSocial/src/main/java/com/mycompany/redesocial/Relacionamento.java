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
    private String utilizadorEnviaPedido;   
    
    private static String STRING_DEFAULT = "";
    

    public Relacionamento() {
        this.dataAceitacao = LocalDateTime.now();
        this.estado = false;
        this.nomeAmigo = getNomeAmigo();
        this.utilizadorEnviaPedido = STRING_DEFAULT;
    }

    public Relacionamento(LocalDateTime dataAceitacao, boolean estado, String nomeAmigo, String utilizadorEnviaPedido) {
        this.dataAceitacao = dataAceitacao;
        this.estado = estado;
        this.nomeAmigo = nomeAmigo;
        this.utilizadorEnviaPedido = utilizadorEnviaPedido;
    }

    public Relacionamento(Relacionamento r) {
        this.dataAceitacao = r.dataAceitacao;
        this.estado = r.estado;
        this.nomeAmigo = r.nomeAmigo;
        this.utilizadorEnviaPedido = r.utilizadorEnviaPedido;
    }

    public LocalDateTime getDataAceitacao() {
        return dataAceitacao;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getUtilizadorEnviaPedido() {
        return utilizadorEnviaPedido;
    }

    public void setUtilizadorEnviaPedido(String utilizadorEnviaPedido) {
        this.utilizadorEnviaPedido = utilizadorEnviaPedido;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
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
