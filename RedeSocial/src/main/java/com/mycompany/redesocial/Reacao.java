
package com.mycompany.redesocial;

import java.io.Serializable;

/**
 *
 * @author airto
 */
public class Reacao implements Serializable {
    boolean tipo;

    public Reacao(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Reacao: " + " / tipo= " + tipo;
    }
    
}