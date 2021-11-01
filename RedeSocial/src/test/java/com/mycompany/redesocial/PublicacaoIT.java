/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDate;
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
public class PublicacaoIT {
    
    public PublicacaoIT() {
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
    public void testGetCorpoPb() {
        System.out.println("getCorpoPb");
        Publicacao instance = new Publicacao("hey","airton");
        String expResult = "hey";
        String result = instance.getCorpoPb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testIsVisibilidade() {
        System.out.println("isVisibilidade");
        Publicacao instance = new Publicacao("hey","airton");
        boolean expResult = true;
        boolean result = instance.isVisibilidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
