/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author airto
 */
public class PublicacaoPaginasIT {
    
    public PublicacaoPaginasIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   @Test
    public void testAdicionarReacao() {
        System.out.println("adicionarReacao");
        Utilizador u = new Utilizador("airton","airton","abc");
        Publicacao p = new Publicacao("a","airton");
        Reacao reacao = new Reacao(true);
        PublicacaoPaginas instance = new PublicacaoPaginas(p,u.getPagina());
        instance.adicionarReacao(reacao);
        int q = instance.getQtdLikes();
        System.out.println("QUANTIDADE DE LIKES: "+q);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getNroComentarios method, of class PublicacaoPaginas.
     */
//    @Test
    public void testGetNroComentarios() {
        System.out.println("getNroComentarios");
        Utilizador u = new Utilizador("airton","airton","abc");
        Comentario c1 = new Comentario("nice");
        Comentario c2 = new Comentario("nicee");
        Comentario c3 = new Comentario("niceeee");
        Comentario c4 = new Comentario("niceeeee");
        Publicacao p = new Publicacao("Hey","airton");
        PublicacaoPaginas pp= new PublicacaoPaginas(p,u.getPagina());
        pp.adicionarComentario(c1); pp.adicionarComentario(c2);  pp.adicionarComentario(c3);  pp.adicionarComentario(c4);
        int expResult = 4;
        int result = PublicacaoPaginas.getNroComentarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
