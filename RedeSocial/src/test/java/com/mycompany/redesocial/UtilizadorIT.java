/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDate;
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
public class UtilizadorIT {
    
    public UtilizadorIT() {
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
    public void testGetDescricaoEvento() {
        System.out.println("getDescricaoEvento");
         LocalDate data1 = LocalDate.of(2000, 10, 1);
        Eventos instance = new Eventos("hey","hey",1,data1);
        String expResult = "hey";
        String result = instance.getDescricaoEvento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetCodCriador() {
        System.out.println("getCodCriador");
         LocalDate data1 = LocalDate.of(2000, 10, 1);
        Eventos instance = new Eventos("hey","hey",1,data1);
        int expResult = 1;
        int result = instance.getCodCriador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
