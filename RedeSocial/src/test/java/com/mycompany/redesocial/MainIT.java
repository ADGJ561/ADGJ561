/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author airto
 */
public class MainIT {
    
    public MainIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reagirPublicacao method, of class Main.
     */
    @Test
    public void testReagirPublicacao() {
        System.out.println("reagirPublicacao");
        Rede rede = null;
        String nomeLogin = "";
        Main instance = new Main();
        instance.reagirPublicacao(rede, nomeLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comentarPublicacao method, of class Main.
     */
    @Test
    public void testComentarPublicacao() {
        System.out.println("comentarPublicacao");
        Rede rede = null;
        Main instance = new Main();
        instance.comentarPublicacao(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of procurarPublicacaoPaginas method, of class Main.
     */
    @Test
    public void testProcurarPublicacaoPaginas() {
        System.out.println("procurarPublicacaoPaginas");
        Rede r = null;
        int codigoAProcurar = 0;
        Main instance = new Main();
        PublicacaoPaginas expResult = null;
        PublicacaoPaginas result = instance.procurarPublicacaoPaginas(r, codigoAProcurar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarPagina method, of class Main.
     */
    @Test
    public void testConsultarPagina() {
        System.out.println("ConsultarPagina");
        Rede rede = null;
        Main.ConsultarPagina(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConsultarPaginaoOutro method, of class Main.
     */
    @Test
    public void testConsultarPaginaoOutro() {
        System.out.println("ConsultarPaginaoOutro");
        Rede rede = null;
        Main.ConsultarPaginaoOutro(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fazerPublicacao method, of class Main.
     */
    @Test
    public void testFazerPublicacao() {
        System.out.println("fazerPublicacao");
        Rede rede = new Rede();
        String nomeLogin = "Jose";
        Main.fazerPublicacao(rede, nomeLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   

    /**
     * Test of listarPublicacoesDoUtilizador method, of class Main.
     */
    @Test
    public void testListarPublicacoesDoUtilizador() {
        System.out.println("listarPublicacoesDoUtilizador");
        Rede rede = null;
        Main.listarPublicacoesDoUtilizador(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPublicacoesPartilhadasComUtilizador method, of class Main.
     */
    @Test
    public void testListarPublicacoesPartilhadasComUtilizador() {
        System.out.println("listarPublicacoesPartilhadasComUtilizador");
        Rede rede = null;
        String nomeLogin = "";
        Main.listarPublicacoesPartilhadasComUtilizador(rede, nomeLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPublicacoesDeUtilizadorEspecifico method, of class Main.
     */
    @Test
    public void testListarPublicacoesDeUtilizadorEspecifico() {
        System.out.println("listarPublicacoesDeUtilizadorEspecifico");
        String nome = "";
        Rede rede = null;
        Main.listarPublicacoesDeUtilizadorEspecifico(nome, rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdLikesPublicacaoPagina method, of class Main.
     */
    @Test
    public void testQtdLikesPublicacaoPagina() {
        System.out.println("qtdLikesPublicacaoPagina");
        Rede rede = null;
        int codigo = 0;
        Main instance = new Main();
        int expResult = 0;
        int result = instance.qtdLikesPublicacaoPagina(rede, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdDislikesPublicacaoPagina method, of class Main.
     */
    @Test
    public void testQtdDislikesPublicacaoPagina() {
        System.out.println("qtdDislikesPublicacaoPagina");
        Rede rede = null;
        int codigo = 0;
        Main instance = new Main();
        int expResult = 0;
        int result = instance.qtdDislikesPublicacaoPagina(rede, codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdRelacionamentosDeUtilizador method, of class Main.
     */
    @Test
    public void testQtdRelacionamentosDeUtilizador() {
        System.out.println("qtdRelacionamentosDeUtilizador");
        Rede rede = null;
        String nome = "";
        Main instance = new Main();
        int expResult = 0;
        int result = instance.qtdRelacionamentosDeUtilizador(rede, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdInteressesDeUtilizador method, of class Main.
     */
    @Test
    public void testQtdInteressesDeUtilizador() {
        System.out.println("qtdInteressesDeUtilizador");
        Rede rede = null;
        String nome = "";
        Main instance = new Main();
        int expResult = 0;
        int result = instance.qtdInteressesDeUtilizador(rede, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdPublicacoesDeUtilizador method, of class Main.
     */
    @Test
    public void testQtdPublicacoesDeUtilizador() {
        System.out.println("qtdPublicacoesDeUtilizador");
        Rede rede = null;
        String nome = "";
        Main instance = new Main();
        int expResult = 0;
        int result = instance.qtdPublicacoesDeUtilizador(rede, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of qtdPublicacoesTotaisNaRede method, of class Main.
     */
    @Test
    public void testQtdPublicacoesTotaisNaRede() {
        System.out.println("qtdPublicacoesTotaisNaRede");
        Rede rede = null;
        Main instance = new Main();
        int expResult = 0;
        int result = instance.qtdPublicacoesTotaisNaRede(rede);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of likesVsDislikesPublicacao method, of class Main.
     */
    @Test
    public void testLikesVsDislikesPublicacao() {
        System.out.println("likesVsDislikesPublicacao");
        Rede rede = null;
        int codigoP = 0;
        Main instance = new Main();
        instance.likesVsDislikesPublicacao(rede, codigoP);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of likesTotaisUtilizador method, of class Main.
     */
    @Test
    public void testLikesTotaisUtilizador() {
        System.out.println("likesTotaisUtilizador");
        Rede rede = null;
        String nome = "";
        Main instance = new Main();
        int expResult = 0;
        int result = instance.likesTotaisUtilizador(rede, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dislikesTotaisUtilizador method, of class Main.
     */
    @Test
    public void testDislikesTotaisUtilizador() {
        System.out.println("dislikesTotaisUtilizador");
        Rede rede = null;
        String nome = "";
        Main instance = new Main();
        int expResult = 0;
        int result = instance.dislikesTotaisUtilizador(rede, nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of likesVsDislikesUtilizador method, of class Main.
     */
    @Test
    public void testLikesVsDislikesUtilizador() {
        System.out.println("likesVsDislikesUtilizador");
        Rede rede = null;
        String nome = "";
        Main instance = new Main();
        instance.likesVsDislikesUtilizador(rede, nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of utilizadorConMaisLikes method, of class Main.
     */
    @Test
    public void testUtilizadorConMaisLikes() {
        System.out.println("utilizadorConMaisLikes");
        Rede rede = null;
        Main instance = new Main();
        Utilizador expResult = null;
        Utilizador result = instance.utilizadorConMaisLikes(rede);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaDeAmigos method, of class Main.
     */
    @Test
    public void testListaDeAmigos() {
        System.out.println("listaDeAmigos");
        Rede rede = null;
        String nomeLogin = "";
        Main instance = new Main();
        instance.listaDeAmigos(rede, nomeLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pedirAmizade method, of class Main.
     */
    @Test
    public void testPedirAmizade() {
        System.out.println("pedirAmizade");
        Rede rede = null;
        Main.pedirAmizade(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class Main.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        Rede rede = null;
        Main.Login(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registarUtilizador method, of class Main.
     */
    @Test
    public void testRegistarUtilizador() {
        System.out.println("registarUtilizador");
        Rede rede = null;
        Main.registarUtilizador(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CriarPaginaPessoal method, of class Main.
     */
    @Test
    public void testCriarPaginaPessoal() {
        System.out.println("CriarPaginaPessoal");
        Rede rede = null;
        Main.CriarPaginaPessoal(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarPerfil method, of class Main.
     */
    @Test
    public void testEditarPerfil() {
        System.out.println("EditarPerfil");
        Rede rede = null;
        Main.EditarPerfil(rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRelacionamento method, of class Main.
     */
    @Test
    public void testAddRelacionamento() {
        System.out.println("addRelacionamento");
        Rede rede = null;
        Utilizador u = null;
        String nomeLogin = "";
        LocalDateTime dataAceitacao = null;
        boolean estado = false;
        String nomeAmigo = "";
        Main.addRelacionamento(rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeRelacionamento method, of class Main.
     */
    @Test
    public void testRemoveRelacionamento() {
        System.out.println("removeRelacionamento");
        Relacionamento r = null;
        Rede rede = null;
        Utilizador u = null;
        String nomeLogin = "";
        LocalDateTime dataAceitacao = null;
        boolean estado = false;
        String nomeAmigo = "";
        Main.removeRelacionamento(r, rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarRelacionamentos method, of class Main.
     */
    @Test
    public void testListarRelacionamentos() {
        System.out.println("listarRelacionamentos");
        String nomeLogin = "";
        Rede rede = null;
        Main.listarRelacionamentos(nomeLogin, rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarPedidosAmizadeRecebidos method, of class Main.
     */
    @Test
    public void testListarPedidosAmizadeRecebidos() {
        System.out.println("listarPedidosAmizadeRecebidos");
        String nomeLogin = "";
        Rede rede = null;
        Main.listarPedidosAmizadeRecebidos(nomeLogin, rede);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
