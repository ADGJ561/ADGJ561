/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 


// Trocar codigo por nome

//Adicionar data aos eventos



*/
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Fac
 */
public class Eventos implements Serializable {
    
    private static int nrEventos;
    private int codEv;
    private String nomeEv;
    private String descricaoEvento;
    private LocalDateTime dataCriacao;
    private Data dataEvento;
    private int codCriador;
    private static final String NOME_PREDEFINIDO = "Nao definido";
    private static final int INT_PREDEFINIDO = 0;

    //public Eventos() {
      //  nrEventos++;
        //this.codEv = nrEventos;
        //this.nomeEv = NOME_PREDEFINIDO;
        //this.descricaoEvento = NOME_PREDEFINIDO;
        //this.dataEvento = new Data();
        //this.dataCriacao = LocalDateTime.now();
        //this.codCriador = INT_PREDEFINIDO;
    //}

    public Eventos(String nomeEv, String descricaoEvento) {
        nrEventos++;
        this.codEv = nrEventos;
        this.nomeEv = nomeEv;
        this.descricaoEvento = descricaoEvento;
        this.dataEvento = new Data();
        this.dataCriacao = LocalDateTime.now();
        this.codCriador = INT_PREDEFINIDO;
    }

    public Eventos(String nomeEv, String descricaoEvento,int criador, Data dataEvento) {
        nrEventos++;
        this.codEv = nrEventos;
        this.nomeEv = nomeEv;
        this.descricaoEvento = descricaoEvento;
        this.dataEvento = new Data(dataEvento);
        this.dataCriacao = LocalDateTime.now();
        this.codCriador = criador;
    }

    public void setDataEvento(Data dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Data getDataEvento() {
        return dataEvento;
    }
    public static int getNrEventos() {
        return nrEventos;
    }

    public int getCodEv() {
        return codEv;
    }
    

    public String getNomeEv() {
        return nomeEv;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public int getCodCriador() {
        return codCriador;
    }
    
    

    public static void setNrEventos(int nrEventos) {
        Eventos.nrEventos = nrEventos;
    }

    public void setCodEv(int codEv) {
        this.codEv = codEv;
    }

    public void setNomeEv(String nomeEv) {
        this.nomeEv = nomeEv;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setCodCriador(int codCriador) {
        this.codCriador = codCriador;
    }

    //mudar

    @Override
    public String toString() {
        return "Eventos{" + "codEv=" + codEv + ", nomeEv=" + nomeEv + ", descricaoEvento=" + descricaoEvento + ", dataCriacao=" + dataCriacao + ", dataEvento=" + dataEvento + ", codCriador=" + codCriador + '}';
    }
    
   
    
}
