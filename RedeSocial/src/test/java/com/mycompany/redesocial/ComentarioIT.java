/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

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
public class ComentarioIT {
    
    public ComentarioIT() {
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

    /**
     * Test of editarComentario method, of class Comentario.
     */
     public void testEditarComentario() {
        System.out.println("editarComentario");
        String corpoComentario = "hey 2";
        Comentario instance = new Comentario("hey");
        instance.editarComentario(corpoComentario);
        System.out.println(instance.getCorpoComentario());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test
    public void testGetCorpoComentario() {
        System.out.println("getCorpoComentario");
        Comentario instance = new Comentario("hey");
        String expResult = "hey";
        String result = instance.getCorpoComentario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
