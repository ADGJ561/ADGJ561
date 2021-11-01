/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
public class RedeIT {
    
    public RedeIT() {
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

   public void testProcurarUtilizador() {
        System.out.println("procurarUtilizador");
        String nome = "joao";
        Rede instance = new Rede();
        Utilizador u = new Utilizador("joao","joao","abc");
        instance.adicionarUtilizador(u);
        boolean expResult = true;
        boolean result = instance.procurarUtilizador(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of procurarUtilizador2 method, of class Rede.
     */
    @Test
    public void testProcurarUtilizador2() {
        System.out.println("procurarUtilizador2");
        String nome = "";
        Rede instance = new Rede();
        Utilizador u = new Utilizador("joao","joao","abc");
        instance.adicionarUtilizador(u);

        Utilizador result = instance.procurarUtilizador2(nome);
        Utilizador expResult =result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
