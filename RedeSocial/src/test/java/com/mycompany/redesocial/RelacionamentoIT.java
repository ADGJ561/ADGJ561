/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDateTime;
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
public class RelacionamentoIT {
    
    public RelacionamentoIT() {
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
    public void testIsEstado() {
        System.out.println("isEstado");
        Relacionamento instance = new Relacionamento();
        boolean expResult = false;
        boolean result = instance.isEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }


    @Test
    public void testGetNomeAmigo() {
        System.out.println("getNomeAmigo");
        LocalDateTime t = LocalDateTime.now();
        Relacionamento instance = new Relacionamento(t,true,"joao","Rodrigo");
        String expResult = "joao";
        String result = instance.getNomeAmigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
