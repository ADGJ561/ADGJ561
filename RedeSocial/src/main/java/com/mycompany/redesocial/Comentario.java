/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDateTime;

/**
 *
 * @author airto
 */
public class Comentario {
 
    private String corpoComentario;
    private LocalDateTime dataComentario;//é melhor localdatetime
    
    public Comentario(String corpoComentario) {
        this.corpoComentario = corpoComentario;
        this.dataComentario= LocalDateTime.now();
    }

    public void editarComentario(String corpoComentario) {
        this.corpoComentario = corpoComentario;
    }
    
}
