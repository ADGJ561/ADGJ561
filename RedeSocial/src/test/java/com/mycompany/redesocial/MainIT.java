/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

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
public class MainIT {
    
    public MainIT() {
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
     * Test of main method, of class Main.
     */
//    @Test
//    public void testMain() throws Exception {
//        System.out.println("main");
//        String[] args = null;
//        Main.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reagirPublicacao method, of class Main.
//     */
//    @Test
//    public void testReagirPublicacao() {
//        System.out.println("reagirPublicacao");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main instance = new Main();
//        instance.reagirPublicacao(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of comentarPublicacao method, of class Main.
//     */
//    @Test
//    public void testComentarPublicacao() {
//        System.out.println("comentarPublicacao");
//        Rede rede = null;
//        Main instance = new Main();
//        instance.comentarPublicacao(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of procurarPublicacaoPaginas method, of class Main.
//     */
//    @Test
//    public void testProcurarPublicacaoPaginas() {
//        System.out.println("procurarPublicacaoPaginas");
//        Rede r = null;
//        int codigoAProcurar = 0;
//        Main instance = new Main();
//        PublicacaoPaginas expResult = null;
//        PublicacaoPaginas result = instance.procurarPublicacaoPaginas(r, codigoAProcurar);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultarPagina method, of class Main.
//     */
//    @Test
//    public void testConsultarPagina() {
//        System.out.println("ConsultarPagina");
//        Rede rede = null;
//        Main.ConsultarPagina(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultarPaginaoOutro method, of class Main.
//     */
//    @Test
//    public void testConsultarPaginaoOutro() {
//        System.out.println("ConsultarPaginaoOutro");
//        Rede rede = null;
//        Main.ConsultarPaginaoOutro(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fazerPublicacao method, of class Main.
//     */
    /*
    @Test
    public void testFazerPublicacao() {
        //procurar utilizador 2 is null ERRO
        System.out.println("fazerPublicacao");
        Rede rede = new Rede();
        Utilizador u = new Utilizador("airton","airton","abc");
        String nomeLogin = "airton";
        rede.adicionarUtilizador(u);
        Main.fazerPublicacao(rede, nomeLogin);
        System.out.println(rede.procurarUtilizador2(nomeLogin).getPublicacoes().toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }
               */

//    /**
//     * Test of listarPublicacoesDoUtilizador method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoesDoUtilizador() {
//        System.out.println("listarPublicacoesDoUtilizador");
//         Rede rede = new Rede();
//        Main instance = new Main();
//        Utilizador u = new Utilizador("airton","airton","abc");
//        String nomeLogin = "airton";
//        rede.adicionarUtilizador(u);
//        Publicacao p = new Publicacao("hey");
//        Publicacao p1 = new Publicacao("hey 2");
//        Publicacao p2 = new Publicacao("hey 3");
//        Publicacao p3 = new Publicacao("hey 4");
//        Publicacao p4 = new Publicacao("hey 5");
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p); 
//        Main.listarPublicacoesDoUtilizador(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        
//}
//
//    /**
//     * Test of listarPublicacoesPartilhadasComUtilizador method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoesPartilhadasComUtilizador() {
//        System.out.println("listarPublicacoesPartilhadasComUtilizador");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main.listarPublicacoesPartilhadasComUtilizador(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPublicacoesDeUtilizadorEspecifico method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoesDeUtilizadorEspecifico() {
//        System.out.println("listarPublicacoesDeUtilizadorEspecifico");
//        String nome = "airton";
//        Rede rede = new Rede();
//        Main instance = new Main();
//        Utilizador u = new Utilizador("airton","airton","abc");
//        String nomeLogin = "airton";
//        rede.adicionarUtilizador(u);
//        Publicacao p = new Publicacao("hey");
//        Publicacao p1 = new Publicacao("hey 2");
//        Publicacao p2 = new Publicacao("hey 3");
//        Publicacao p3 = new Publicacao("hey 4");
//        Publicacao p4 = new Publicacao("hey 5");
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p1);
//        u.adicionarPublicacoes(p2);
//        u.adicionarPublicacoes(p3);
//        u.adicionarPublicacoes(p4); 
//        Main.listarPublicacoesDeUtilizadorEspecifico(nome, rede);
//        System.out.println(u.getPublicacoes());
//        // TODO review the generated test code and remove the default call to fail.
//    }
//
//    /**
//     * Test of qtdLikesPublicacaoPagina method, of class Main.
//     */
    
//    public void testQtdLikesPublicacaoPagina() {
//        System.out.println("qtdLikesPublicacaoPagina");
//        Rede rede = new Rede();
////        int codigo = 0;
//        Main instance = new Main();
//        Utilizador u = new Utilizador("airton","airton","abc");
//        String nomeLogin = "airton";
//        rede.adicionarUtilizador(u);
//        Publicacao p = new Publicacao("hey");
//        u.adicionarPublicacoes(p);
//        int codigo = p.getCodPb();
//        PublicacaoPaginas pp = new PublicacaoPaginas(p,u.getPagina());
//        rede.adicionarPublicacaoPaginas(pp);
//        Reacao r1 = new Reacao(true);
//        Reacao r2 = new Reacao(true);
//        pp.adicionarReacao(r1); 
//        pp.adicionarReacao(r2);
//        pp.adicionarReacao(r1);
//        
//        int expResult = 3;
//        int result = instance.qtdLikesPublicacaoPagina(rede, codigo);
//        System.out.println("NUMERO DE LIKES "+result);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        
//   }
//
//    /**
//     * Test of qtdDislikesPublicacaoPagina method, of class Main.
//     */
//    @Test
//    public void testQtdDislikesPublicacaoPagina() {
//        System.out.println("qtdDislikesPublicacaoPagina");
//        Rede rede = null;
//        int codigo = 0;
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.qtdDislikesPublicacaoPagina(rede, codigo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of qtdRelacionamentosDeUtilizador method, of class Main.
//     */
//    @Test
//    public void testQtdRelacionamentosDeUtilizador() {
//        System.out.println("qtdRelacionamentosDeUtilizador");
//   
//        String nome = "airton";
//        Rede rede = new Rede();
//        Main instance = new Main();
//        Utilizador u = new Utilizador("airton","airton","abc");
//        String nomeLogin = "airton";
//        rede.adicionarUtilizador(u);
//        Relacionamento r = new Relacionamento();
//        Relacionamento r2 = new Relacionamento();
//        Relacionamento r3 = new Relacionamento();
//        Relacionamento r4 = new Relacionamento();
//        ArrayList<Relacionamento> relacionamentos = new ArrayList<>();
//        relacionamentos.add(r);relacionamentos.add(r2);relacionamentos.add(r3);relacionamentos.add(r4);
//        u.setRelacionamentos(relacionamentos);
//        int expResult = 4;
//        int result = instance.qtdRelacionamentosDeUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        System.out.println("NUMERO DE AMIGOS: "+result);
//        System.out.println("RESULTADO EXPECTAVEL "+expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        
//    }
//
//    /**
//     * Test of qtdInteressesDeUtilizador method, of class Main.
//     */
//    @Test
//    public void testQtdInteressesDeUtilizador() {
//        System.out.println("qtdInteressesDeUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.qtdInteressesDeUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of qtdPublicacoesDeUtilizador method, of class Main.
//     */
//    @Test
//    public void testQtdPublicacoesDeUtilizador() {
//        System.out.println("qtdPublicacoesDeUtilizador");
//        Rede rede = new Rede();
//        Main instance = new Main();
//        Utilizador u = new Utilizador("airton","airton","abc");
//        String nomeLogin = "airton";
//        rede.adicionarUtilizador(u);
//        Publicacao p = new Publicacao("hey");
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);
//        u.adicionarPublicacoes(p);     
//        int expResult = 5;
//        int result = instance.qtdPublicacoesDeUtilizador(rede, nomeLogin);
//        System.out.println("NUMERO DE PB: "+result);
//        System.out.println("RESULTADO EXPECTAVEL: "+expResult);
//        rede.listarUtilizadores();
//    
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        }
//
//    /**
//     * Test of likesVsDislikesPublicacao method, of class Main.
//     */
//    @Test
//    public void testLikesVsDislikesPublicacao() {
//        System.out.println("likesVsDislikesPublicacao");
//        Rede rede = null;
//        int codigoP = 0;
//        Main instance = new Main();
//        instance.likesVsDislikesPublicacao(rede, codigoP);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of likesTotaisUtilizador method, of class Main.
//     */
//    @Test
//    public void testLikesTotaisUtilizador() {
//        System.out.println("likesTotaisUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.likesTotaisUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dislikesTotaisUtilizador method, of class Main.
//     */
//    @Test
//    public void testDislikesTotaisUtilizador() {
//        System.out.println("dislikesTotaisUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.dislikesTotaisUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of likesVsDislikesUtilizador method, of class Main.
//     */
//    @Test
//    public void testLikesVsDislikesUtilizador() {
//        System.out.println("likesVsDislikesUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        instance.likesVsDislikesUtilizador(rede, nome);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of amigosEmComum method, of class Main.
//     */
//    @Test
//    public void testAmigosEmComum() {
//        System.out.println("amigosEmComum");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main instance = new Main();
//        instance.amigosEmComum(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of interessesEmComum method, of class Main.
//     */
//    @Test
//    public void testInteressesEmComum() {
//        System.out.println("interessesEmComum");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main instance = new Main();
//        instance.interessesEmComum(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dateInput method, of class Main.
//     */
//    @Test
//    public void testDateInput() {
//        System.out.println("dateInput");
//        String userInput = "";
//        LocalDateTime expResult = null;
//        LocalDateTime result = Main.dateInput(userInput);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of publicacoesEmIntervalo method, of class Main.
//     */
    @Test
    public void testQtdUtilizadoresNaRede() {
        System.out.println("qtdUtilizadoresNaRede");
        Rede rede = new Rede();
        int expResult = 1;
        Utilizador u = new Utilizador("airton","airton","abc");
        rede.adicionarUtilizador(u);
        int result = Main.qtdUtilizadoresNaRede(rede);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void testPublicacoesEmIntervalo() {
        System.out.println("publicacoesEmIntervalo");
        Rede rede = new Rede();
        String nome = "airton";
        Utilizador u = new Utilizador("airton","airton","abc");
        rede.adicionarUtilizador(u);
        Publicacao p1 = new Publicacao("a","airton");
        Publicacao p2 = new Publicacao("b","airton");
        u.adicionarPublicacoes(p2);u.adicionarPublicacoes(p1);
        Main instance = new Main();
        int expResult = 2;
        int result = instance.publicacoesEmIntervalo(rede, nome);
        assertEquals(expResult, result);

    }
//
//    /**
//     * Test of listaDeAmigos method, of class Main.
//     */
//    @Test
//    public void testListaDeAmigos() {
//        System.out.println("listaDeAmigos");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main instance = new Main();
//        instance.listaDeAmigos(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of pedirAmizade method, of class Main.
//     */
//    @Test
//    public void testPedirAmizade() {
//        System.out.println("pedirAmizade");
//        Rede rede = null;
//        Main.pedirAmizade(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Login method, of class Main.
//     */
//    @Test
//    public void testLogin() {
//        System.out.println("Login");
//        Rede rede = null;
//        Main.Login(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of registarUtilizador method, of class Main.
//     */
//    @Test
//    public void testRegistarUtilizador() {
//        System.out.println("registarUtilizador");
//        Rede rede = null;
//        Main.registarUtilizador(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CriarPaginaPessoal method, of class Main.
//     */
//    @Test
//    public void testCriarPaginaPessoal() {
//        System.out.println("CriarPaginaPessoal");
//        Rede rede = null;
//        Main.CriarPaginaPessoal(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of EditarPerfil method, of class Main.
//     */
//    @Test
//    public void testEditarPerfil() {
//        System.out.println("EditarPerfil");
//        Rede rede = null;
//        Main.EditarPerfil(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addRelacionamento method, of class Main.
//     */
//    @Test
//    public void testAddRelacionamento() {
//        System.out.println("addRelacionamento");
//        Rede rede = null;
//        Utilizador u = null;
//        String nomeLogin = "";
//        LocalDateTime dataAceitacao = null;
//        boolean estado = false;
//        String nomeAmigo = "";
//        Main.addRelacionamento(rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeRelacionamento method, of class Main.
//     */
//    @Test
//    public void testRemoveRelacionamento() {
//        System.out.println("removeRelacionamento");
//        Relacionamento r = null;
//        Rede rede = null;
//        Utilizador u = null;
//        String nomeLogin = "";
//        LocalDateTime dataAceitacao = null;
//        boolean estado = false;
//        String nomeAmigo = "";
//        Main.removeRelacionamento(r, rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarRelacionamentos method, of class Main.
//     */
//    @Test
//    public void testListarRelacionamentos() {
//        System.out.println("listarRelacionamentos");
//        String nomeLogin = "";
//        Rede rede = null;
//        Main.listarRelacionamentos(nomeLogin, rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPedidosAmizadeRecebidos method, of class Main.
//     */
//    @Test
//    public void testListarPedidosAmizadeRecebidos() {
//        System.out.println("listarPedidosAmizadeRecebidos");
//        String nomeLogin = "";
//        Rede rede = null;
//        Main.listarPedidosAmizadeRecebidos(nomeLogin, rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CriarEvento method, of class Main.
//     */
//    @Test
//    public void testCriarEvento() {
//        System.out.println("CriarEvento");
//        Rede rede = null;
//        String titulo = "";
//        String texto = "";
//        Main.CriarEvento(rede, titulo, texto);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarEventosDoUtilizadorAtivo method, of class Main.
//     */
//    @Test
//    public void testListarEventosDoUtilizadorAtivo() {
//        System.out.println("listarEventosDoUtilizadorAtivo");
//        Rede rede = null;
//        ArrayList<Eventos> expResult = null;
//        ArrayList<Eventos> result = Main.listarEventosDoUtilizadorAtivo(rede);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ListarTodosOsEventos method, of class Main.
//     */
//    @Test
//    public void testListarTodosOsEventos() {
//        System.out.println("ListarTodosOsEventos");
//        Rede rede = null;
//        ArrayList<Eventos> expResult = null;
//        ArrayList<Eventos> result = Main.ListarTodosOsEventos(rede);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of EditarEventos method, of class Main.
//     */
//    @Test
//    public void testEditarEventos() {
//        System.out.println("EditarEventos");
//        Rede rede = null;
//        Main.EditarEventos(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    

    /**
     * Test of main method, of class Main.
     */
//    @Test
//    public void testMain() throws Exception {
//        System.out.println("main");
//        String[] args = null;
//        Main.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of reagirPublicacao method, of class Main.
//     */
//    @Test
//    public void testReagirPublicacao() {
//        System.out.println("reagirPublicacao");
//        Rede rede = null;
//        int codigoProcura = 0;
//        Main.reagirPublicacao(rede, codigoProcura);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of comentarPublicacao method, of class Main.
//     */
//    @Test
//    public void testComentarPublicacao() {
//        System.out.println("comentarPublicacao");
//        Rede rede = null;
//        int codigo = 0;
//        Main.comentarPublicacao(rede, codigo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of procurarPublicacaoPaginas method, of class Main.
//     */
//    @Test
//    public void testProcurarPublicacaoPaginas() {
//        System.out.println("procurarPublicacaoPaginas");
//        Rede r = null;
//        int codigoAProcurar = 0;
//        PublicacaoPaginas expResult = null;
//        PublicacaoPaginas result = Main.procurarPublicacaoPaginas(r, codigoAProcurar);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultarPagina method, of class Main.
//     */
//    @Test
//    public void testConsultarPagina() {
//        System.out.println("ConsultarPagina");
//        Rede rede = null;
//        Main.ConsultarPagina(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ConsultarPaginaoOutro method, of class Main.
//     */
//    @Test
//    public void testConsultarPaginaoOutro() {
//        System.out.println("ConsultarPaginaoOutro");
//        Rede rede = null;
//        Main.ConsultarPaginaoOutro(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of fazerPublicacao method, of class Main.
//     */
//    @Test
//    public void testFazerPublicacao() {
//        System.out.println("fazerPublicacao");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main.fazerPublicacao(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPublicacoesDoUtilizador method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoesDoUtilizador() {
//        System.out.println("listarPublicacoesDoUtilizador");
//        Rede rede = null;
//        Main.listarPublicacoesDoUtilizador(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPublicacoesPartilhadasComUtilizador method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoesPartilhadasComUtilizador() {
//        System.out.println("listarPublicacoesPartilhadasComUtilizador");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main.listarPublicacoesPartilhadasComUtilizador(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPublicacoesDeUtilizadorEspecifico method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoesDeUtilizadorEspecifico() {
//        System.out.println("listarPublicacoesDeUtilizadorEspecifico");
//        String nome = "";
//        Rede rede = null;
//        Main.listarPublicacoesDeUtilizadorEspecifico(nome, rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPublicacoes method, of class Main.
//     */
//    @Test
//    public void testListarPublicacoes() {
//        System.out.println("listarPublicacoes");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main.listarPublicacoes(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of qtdLikesPublicacaoPagina method, of class Main.
//     */
//    @Test
//    public void testQtdLikesPublicacaoPagina() {
//        System.out.println("qtdLikesPublicacaoPagina");
//        Rede rede = null;
//        int codigo = 0;
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.qtdLikesPublicacaoPagina(rede, codigo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of qtdDislikesPublicacaoPagina method, of class Main.
//     */
//    @Test
//    public void testQtdDislikesPublicacaoPagina() {
//        System.out.println("qtdDislikesPublicacaoPagina");
//        Rede rede = null;
//        int codigo = 0;
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.qtdDislikesPublicacaoPagina(rede, codigo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of qtdInteressesDeUtilizador method, of class Main.
//     */
//    @Test
//    public void testQtdInteressesDeUtilizador() {
//        System.out.println("qtdInteressesDeUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.qtdInteressesDeUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of qtdPublicacoesDeUtilizador method, of class Main.
//     */
//    @Test
//    public void testQtdPublicacoesDeUtilizador() {
//        System.out.println("qtdPublicacoesDeUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.qtdPublicacoesDeUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of likesVsDislikesPublicacao method, of class Main.
//     */
//    @Test
//    public void testLikesVsDislikesPublicacao() {
//        System.out.println("likesVsDislikesPublicacao");
//        Rede rede = null;
//        int codigoP = 0;
//        Main instance = new Main();
//        instance.likesVsDislikesPublicacao(rede, codigoP);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of likesTotaisUtilizador method, of class Main.
//     */
//    @Test
//    public void testLikesTotaisUtilizador() {
//        System.out.println("likesTotaisUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.likesTotaisUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dislikesTotaisUtilizador method, of class Main.
//     */
//    @Test
//    public void testDislikesTotaisUtilizador() {
//        System.out.println("dislikesTotaisUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        int expResult = 0;
//        int result = instance.dislikesTotaisUtilizador(rede, nome);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of likesVsDislikesUtilizador method, of class Main.
//     */
//    @Test
//    public void testLikesVsDislikesUtilizador() {
//        System.out.println("likesVsDislikesUtilizador");
//        Rede rede = null;
//        String nome = "";
//        Main instance = new Main();
//        instance.likesVsDislikesUtilizador(rede, nome);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of amigosEmComum method, of class Main.
//     */
//    @Test
//    public void testAmigosEmComum() {
//        System.out.println("amigosEmComum");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main instance = new Main();
//        instance.amigosEmComum(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of interessesEmComum method, of class Main.
//     */
//    @Test
//    public void testInteressesEmComum() {
//        System.out.println("interessesEmComum");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main instance = new Main();
//        instance.interessesEmComum(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of dateInput method, of class Main.
     */
//    @Test
//    public void testDateInput() {
//        System.out.println("dateInput");
//        String userInput = "";
//        LocalDateTime expResult = null;
//        LocalDateTime result = Main.dateInput(userInput);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of publicacoesEmIntervalo method, of class Main.
     */
   

    /**
     * Test of listaDeAmigos method, of class Main.
     */
//    @Test
//    public void testListaDeAmigos() {
//        System.out.println("listaDeAmigos");
//        Rede rede = null;
//        String nomeLogin = "";
//        Main.listaDeAmigos(rede, nomeLogin);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of pedirAmizade method, of class Main.
     */
//    @Test
//    public void testPedirAmizade() {
//        System.out.println("pedirAmizade");
//        Rede rede = null;
//        Main.pedirAmizade(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of Login method, of class Main.
     */
//    @Test
//    public void testLogin() {
//        System.out.println("Login");
//        Rede rede = null;
//        Main.Login(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of registarUtilizador method, of class Main.
//     */
//    @Test
//    public void testRegistarUtilizador() {
//        System.out.println("registarUtilizador");
//        Rede rede = null;
//        Main.registarUtilizador(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CriarPaginaPessoal method, of class Main.
//     */
//    @Test
//    public void testCriarPaginaPessoal() {
//        System.out.println("CriarPaginaPessoal");
//        Rede rede = null;
//        Main.CriarPaginaPessoal(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of EditarPerfil method, of class Main.
//     */
//    @Test
//    public void testEditarPerfil() {
//        System.out.println("EditarPerfil");
//        Rede rede = null;
//        Main.EditarPerfil(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addRelacionamento method, of class Main.
//     */
//    @Test
//    public void testAddRelacionamento() {
//        System.out.println("addRelacionamento");
//        Rede rede = null;
//        Utilizador u = null;
//        String nomeLogin = "";
//        LocalDateTime dataAceitacao = null;
//        boolean estado = false;
//        String nomeAmigo = "";
//        Main.addRelacionamento(rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of removeRelacionamento method, of class Main.
     */
//    @Test
//    public void testRemoveRelacionamento() {
//        System.out.println("removeRelacionamento");
//        Relacionamento r = null;
//        Rede rede = null;
//        Utilizador u = null;
//        String nomeLogin = "";
//        LocalDateTime dataAceitacao = null;
//        boolean estado = false;
//        String nomeAmigo = "";
//        Main.removeRelacionamento(r, rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarRelacionamentos method, of class Main.
//     */
//    @Test
//    public void testListarRelacionamentos() {
//        System.out.println("listarRelacionamentos");
//        String nomeLogin = "";
//        Rede rede = null;
//        Main.listarRelacionamentos(nomeLogin, rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarPedidosAmizadeRecebidosEnviados method, of class Main.
//     */
//    @Test
//    public void testListarPedidosAmizadeRecebidosEnviados() {
//        System.out.println("listarPedidosAmizadeRecebidosEnviados");
//        String nomeLogin = "";
//        Rede rede = null;
//        Main.listarPedidosAmizadeRecebidosEnviados(nomeLogin, rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of aceitarRejeitarPedidosAmizadeRecebidos method, of class Main.
//     */
//    @Test
//    public void testAceitarRejeitarPedidosAmizadeRecebidos() {
//        System.out.println("aceitarRejeitarPedidosAmizadeRecebidos");
//        String nomeLogin = "";
//        Rede rede = null;
//        Main.aceitarRejeitarPedidosAmizadeRecebidos(nomeLogin, rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of comentarReagirPublicacaoCriadasUtilizador method, of class Main.
//     */
//    @Test
//    public void testComentarReagirPublicacaoCriadasUtilizador() {
//        System.out.println("comentarReagirPublicacaoCriadasUtilizador");
//        Rede rede = null;
//        Main.comentarReagirPublicacaoCriadasUtilizador(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of comentarReagirPublicacaoPartilhadasUtilizador method, of class Main.
//     */
//    @Test
//    public void testComentarReagirPublicacaoPartilhadasUtilizador() {
//        System.out.println("comentarReagirPublicacaoPartilhadasUtilizador");
//        Rede rede = null;
//        Main.comentarReagirPublicacaoPartilhadasUtilizador(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of CriarEvento method, of class Main.
//     */
//    @Test
//    public void testCriarEvento() {
//        System.out.println("CriarEvento");
//        Rede rede = null;
//        String titulo = "";
//        String texto = "";
//        Data dataEvento = null;
//        Main.CriarEvento(rede, titulo, texto, dataEvento);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of listarEventosDoUtilizadorAtivo method, of class Main.
//     */
//    @Test
//    public void testListarEventosDoUtilizadorAtivo() {
//        System.out.println("listarEventosDoUtilizadorAtivo");
//        Rede rede = null;
//        ArrayList<Eventos> expResult = null;
//        ArrayList<Eventos> result = Main.listarEventosDoUtilizadorAtivo(rede);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ListarTodosOsEventos method, of class Main.
//     */
//    @Test
//    public void testListarTodosOsEventos() {
//        System.out.println("ListarTodosOsEventos");
//        Rede rede = null;
//        ArrayList<Eventos> expResult = null;
//        ArrayList<Eventos> result = Main.ListarTodosOsEventos(rede);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of EditarEventos method, of class Main.
//     */
//    @Test
//    public void testEditarEventos() {
//        System.out.println("EditarEventos");
//        Rede rede = null;
//        Main.EditarEventos(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of ListarEventosAdicionadosCalendario method, of class Main.
//     */
//    @Test
//    public void testListarEventosAdicionadosCalendario() {
//        System.out.println("ListarEventosAdicionadosCalendario");
//        Rede rede = null;
//        Main.ListarEventosAdicionadosCalendario(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of AdicionarEventoCalendario method, of class Main.
//     */
//    @Test
//    public void testAdicionarEventoCalendario() {
//        System.out.println("AdicionarEventoCalendario");
//        Rede rede = null;
//        Eventos e = null;
//        Main.AdicionarEventoCalendario(rede, e);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of Feed method, of class Main.
//     */
//    @Test
//    public void testFeed() {
//        System.out.println("Feed");
//        Rede rede = null;
//        Main.Feed(rede);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of LogOut method, of class Main.
//     */
//    @Test
//    public void testLogOut() {
//        System.out.println("LogOut");
//        Main.LogOut();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
