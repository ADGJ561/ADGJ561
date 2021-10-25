/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.text.SimpleDateFormat;
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
 * @author OLAF
 */
public class RedeTest {
    
    public RedeTest() {
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
     * Test of getFormatter method, of class Rede.
     */
    @Test
    public void testGetFormatter() {
        System.out.println("getFormatter");
        Rede instance = new Rede();
        SimpleDateFormat expResult = null;
        SimpleDateFormat result = instance.getFormatter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQtdUt method, of class Rede.
     */
    @Test
    public void testGetQtdUt() {
        System.out.println("getQtdUt");
        Rede instance = new Rede();
        int expResult = 0;
        int result = instance.getQtdUt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeR method, of class Rede.
     */
    @Test
    public void testGetNomeR() {
        System.out.println("getNomeR");
        Rede instance = new Rede();
        String expResult = "";
        String result = instance.getNomeR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataC method, of class Rede.
     */
    @Test
    public void testGetDataC() {
        System.out.println("getDataC");
        Rede instance = new Rede();
        LocalDate expResult = null;
        LocalDate result = instance.getDataC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaUtilizadores method, of class Rede.
     */
    @Test
    public void testGetListaUtilizadores() {
        System.out.println("getListaUtilizadores");
        Rede instance = new Rede();
        ArrayList<Utilizador> expResult = null;
        ArrayList<Utilizador> result = instance.getListaUtilizadores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaPubPag method, of class Rede.
     */
    @Test
    public void testGetListaPubPag() {
        System.out.println("getListaPubPag");
        Rede instance = new Rede();
        ArrayList<PublicacaoPaginas> expResult = null;
        ArrayList<PublicacaoPaginas> result = instance.getListaPubPag();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarUtilizador method, of class Rede.
     */
    @Test
    public void testProcurarUtilizador() {
        System.out.println("procurarUtilizador");
        String nome = "";
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.procurarUtilizador(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarUtilizador2 method, of class Rede.
     */
    @Test
    public void testProcurarUtilizador2() {
        System.out.println("procurarUtilizador2");
        String nome = "";
        Rede instance = new Rede();
        Utilizador expResult = null;
        Utilizador result = instance.procurarUtilizador2(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarInteresses method, of class Rede.
     */
    @Test
    public void testAdicionarInteresses() {
        System.out.println("adicionarInteresses");
        Utilizador u = new Utilizador("ze", new Data(1999,1,1), "ze", "123");
        String adicionar = "netfeijoes";
        Rede instance = new Rede();
        instance.adicionarInteresses(u, adicionar);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(u);
//        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverInteresses method, of class Rede.
     */
    @Test
    public void testRemoverInteresses() {
        System.out.println("RemoverInteresses");
        Utilizador u = null;
        String i = "";
        Rede instance = new Rede();
        instance.RemoverInteresses(u, i);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificarLogin method, of class Rede.
     */
    @Test
    public void testVerificarLogin() {
        System.out.println("VerificarLogin");
        String nome = "";
        String pwd = "";
        Rede instance = new Rede();
        boolean expResult = false;
        boolean result = instance.VerificarLogin(nome, pwd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registarUtilizador method, of class Rede.
     */
    @Test
    public void testRegistarUtilizador() {
        System.out.println("registarUtilizador");
        String nome = "";
        Data dataNas = null;
        String login = "";
        String pwd = "";
        Rede instance = new Rede();
        instance.registarUtilizador(nome, dataNas, login, pwd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerUtilizador method, of class Rede.
     */
    @Test
    public void testRemoverUtilizador() {
        System.out.println("removerUtilizador");
        String nome = "";
        Data dataNas = null;
        String login = "";
        String pwd = "";
        Rede instance = new Rede();
        instance.removerUtilizador(nome, dataNas, login, pwd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contarUtilizadores method, of class Rede.
     */
    @Test
    public void testContarUtilizadores() {
        System.out.println("contarUtilizadores");
        ArrayList<Utilizador> listaUtilizadores = null;
        Rede instance = new Rede();
        int expResult = 0;
        int result = instance.contarUtilizadores(listaUtilizadores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarUtilizadores method, of class Rede.
     */
    @Test
    public void testListarUtilizadores() {
        System.out.println("listarUtilizadores");
        Rede instance = new Rede();
        instance.listarUtilizadores();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CriarPagina method, of class Rede.
     */
    @Test
    public void testCriarPagina() {
        System.out.println("CriarPagina");
        String nomeLogin = "";
        String nome = "";
        boolean estado = false;
        Rede instance = new Rede();
        instance.CriarPagina(nomeLogin, nome, estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarNomeUtilizador method, of class Rede.
     */
    @Test
    public void testAlterarNomeUtilizador() {
        System.out.println("alterarNomeUtilizador");
        Utilizador x = null;
        String u = "";
        Rede instance = new Rede();
        instance.alterarNomeUtilizador(x, u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarLogin method, of class Rede.
     */
    @Test
    public void testAlterarLogin() {
        System.out.println("alterarLogin");
        Utilizador x = null;
        String u = "";
        Rede instance = new Rede();
        instance.alterarLogin(x, u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarPwd method, of class Rede.
     */
    @Test
    public void testAlterarPwd() {
        System.out.println("alterarPwd");
        Utilizador x = null;
        String u = "";
        Rede instance = new Rede();
        instance.alterarPwd(x, u);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarRelacionamentoListaRelacionamentos method, of class Rede.
     */
    @Test
    public void testAdicionarRelacionamentoListaRelacionamentos() {
        System.out.println("adicionarRelacionamentoListaRelacionamentos");
        Utilizador u = null;
        Relacionamento re = null;
        Rede instance = new Rede();
        instance.adicionarRelacionamentoListaRelacionamentos(u, re);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerRelacionamentoListaRelacionamentos method, of class Rede.
     */
    @Test
    public void testRemoverRelacionamentoListaRelacionamentos() {
        System.out.println("removerRelacionamentoListaRelacionamentos");
        Utilizador u = null;
        Relacionamento re = null;
        Rede instance = new Rede();
        instance.removerRelacionamentoListaRelacionamentos(u, re);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarRelacionamento method, of class Rede.
     */
    @Test
    public void testAdicionarRelacionamento() {
        System.out.println("adicionarRelacionamento");
        Rede rede = null;
        Utilizador u = null;
        String nomeLogin = "";
        LocalDateTime dataAceitacao = null;
        boolean estado = false;
        String nomeAmigo = "";
        Rede instance = new Rede();
        instance.adicionarRelacionamento(rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarRel method, of class Rede.
     */
    @Test
    public void testAdicionarRel() {
        System.out.println("adicionarRel");
        Rede rede = null;
        Utilizador u = null;
        String nomeLogin = "";
        String nomeAmigo = "";
        Rede instance = new Rede();
        instance.adicionarRel(rede, u, nomeLogin, nomeAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerRelacionamento method, of class Rede.
     */
    @Test
    public void testRemoverRelacionamento() {
        System.out.println("removerRelacionamento");
        Relacionamento r = null;
        Rede rede = null;
        Utilizador u = null;
        String nomeLogin = "";
        LocalDateTime dataAceitacao = null;
        boolean estado = false;
        String nomeAmigo = "";
        Rede instance = new Rede();
        instance.removerRelacionamento(r, rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarUtilizador method, of class Rede.
     */
    @Test
    public void testAdicionarUtilizador_4args() {
        System.out.println("adicionarUtilizador");
        String nome = "";
        Data dataNas = null;
        String login = "";
        String pwd = "";
        Rede instance = new Rede();
        instance.adicionarUtilizador(nome, dataNas, login, pwd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adicionarUtilizador method, of class Rede.
     */
    @Test
    public void testAdicionarUtilizador_Utilizador() {
        System.out.println("adicionarUtilizador");
        Utilizador u1 = null;
        Rede instance = new Rede();
        instance.adicionarUtilizador(u1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Rede.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Rede instance = new Rede();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
