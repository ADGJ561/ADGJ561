/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDateTime;
import java.util.Random;

/**
 *
 * @author airto
 */
public class Publicacao {
  private int codPb;
  private String corpoPb;
  private LocalDateTime dataPb; 


    public Publicacao(String corpoPb) {
        Random rand= new Random();
        this.codPb=rand.nextInt(300); //int random de 0 a 300
        this.corpoPb = corpoPb;
        dataPb= LocalDateTime.now();
    }
    

    public int getCodPb() {
        return codPb;
    }

    public String getCorpoPb() {
        return corpoPb;
    }

    public LocalDateTime getDataPb() {
        return dataPb;
    }
}
