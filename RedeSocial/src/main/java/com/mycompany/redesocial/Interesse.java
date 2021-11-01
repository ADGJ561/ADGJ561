/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;

/**
 *
 * @author airto
 */
public class Interesse implements Serializable {
    private String corpo;

    public Interesse(String corpo) {
        this.corpo = corpo;
    }

    public Interesse() {
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    @Override
    public String toString() {
        return "Interesses:" + "\n Interesse: " + corpo;
    }

    
    
}
