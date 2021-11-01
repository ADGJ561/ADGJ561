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
public class ReacaoIT {
    
    public ReacaoIT() {
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

  public void testIsTipo() {
        System.out.println("isTipo");
        Reacao instance = new Reacao(true);
        boolean expResult = true;
        boolean result = instance.isTipo();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTipo method, of class Reacao.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        boolean tipo = true;
        Reacao instance = new Reacao(tipo);
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.

    }

}
