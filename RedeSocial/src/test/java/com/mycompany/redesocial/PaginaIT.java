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
public class PaginaIT {
    
    public PaginaIT() {
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
    public void testGetNrPaginas() {
        System.out.println("getNrPaginas");
        int expResult = 0;
        int result = Pagina.getNrPaginas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getNomePg method, of class Pagina.
     */
    @Test
    public void testGetNomePg() {
        System.out.println("getNomePg");
        Pagina instance = new Pagina();
        String expResult = "Nao definido";
        String result = instance.getNomePg();
        assertEquals(expResult, result);
    }

   
    
}
