/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author OLAF
 */
public class Main implements Cloneable {

    static Scanner scan = new Scanner(System.in);
    private static String mail = "";
    private static String nomeFicheiro = "Social4.dat";

    /**
     * @param args the command line arguments
     */
    static String nomeLogin = "maria";
    static String nome, pwd = "";
    int opcaoMenu = 0;
    private static Rede rede1 = new Rede();    
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        int opcaoMenu = -1;
        rede1 = new Rede("nome rede",LocalDate.now(),3);
        
        Utilizador u2 = new Utilizador("maria", "maria", "123");
        rede1.adicionarUtilizador(u2);
        Utilizador u1 = new Utilizador("ze", "ze", "123");
        rede1.adicionarUtilizador(u1);       
        
        Eventos e1 = new Eventos("evento1","esta a funcionar sou o rei2");
        rede1.adicionarEventos(nomeLogin, "sdad", "sdadas", new Data(2022, 10, 20));
        rede1.adicionarEventos(nomeLogin, "Sou o 2", "Numero2", new Data(2023, 10, 20));
        rede1.adicionarEventos(nomeLogin, "aaaaaaaaaaaaa", "uuuuuuuuuuuuuuuuuuu", new Data(2023, 10, 25));
        rede1.adicionarEventos(nomeLogin, "aaaaaaaaaaaaa", "uuuuuuuuuuuuuuuuuuu", new Data(2023, 12, 20));
        rede1.adicionarEventos2(e1);
        System.out.println(listarEventosDoUtilizadorAtivo(rede1));
        System.out.println(ListarTodosOsEventos(rede1));
        System.out.println("Antes rede: "+rede1);
        
        //rede1 = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);          
        
        processarOpcoesMenu1();
   
    }
    
    private static void escolheMenu1() {
        System.out.println("\n");
        System.out.println("________________________________________________\n");
        System.out.println("                    MENU 1                    ");
        System.out.println("                  Social Bit                    ");
        System.out.println("________________________________________________");
        System.out.println("1: Login;");
        System.out.println("2: Registar;");
        System.out.println("3: Sair;");
        System.out.println("________________________________________________");
        System.out.println("Escolher opção: ");
    }

    private static void escolheMenu2() {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("               MENU 2 - Registar                   ");
            System.out.println("________________________________________________");
            System.out.println("1: Criar Utilizador;");
            System.out.println("2: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
    }

    private static void escolheMenu3() {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 3                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Consultar Feed de notícias;");
            System.out.println("2: Editar Perfil;");
            System.out.println("3: Páginas;");
            System.out.println("4: Amizades;");
            System.out.println("5: Publicações;");
            System.out.println("6: Eventos;");
            System.out.println("7. Calendário;");
            System.out.println("8. Dados e Estatísticas;");
            System.out.println("9: Log out;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
    }
    
    private static void escolheMenuPagina () {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                 MENU Páginas                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Criar uma Página;");
            System.out.println("2: Consultar a minha página;");
            System.out.println("3: Consultar a página de outro utilizador;");
            System.out.println("4: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");          
    }
    
    private static void escolheMenuRelacionamentos () {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("             MENU Relacionamentos                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Pedir amizade a outro utilizador;");
            System.out.println("2: Consultar pedidos de amizade recebidos");
            System.out.println("3: Consultar a minha lista de amigos;");
            System.out.println("4: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");        
    }

    private static void escolheMenuPublicacao () {
        
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("              MENU Publicações                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Fazer publicação;");
            System.out.println("2: Consultar publicações criadas;");
            System.out.println("3: Consultar publicacões partilhadas comigo;");
            System.out.println("4: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");        
    }
    
    private static void escolheMenuEventos () {
    
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                MENU Eventos                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Criar evento;");
            System.out.println("2: Editar evento;");
            System.out.println("3: Consultar os meus eventos;");
            System.out.println("4: Consultar todos os eventos;");
            System.out.println("5: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");        
    }
    
    private static void escolheMenuCalendario () {
       
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("               MENU Calendário                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Consultar o meu calendário de eventos;");
            System.out.println("2: Adicionar um evento ao meu calendário;");
            System.out.println("3: Remover um evento do meu calendário;");
            System.out.println("4: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
       
    }
    
    private static void escolheMenuDadosEstatisticas () {
        
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("           MENU Dados e Estatísticas                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Consultar os dados analíticos de um utilizador;");
            System.out.println("2: Consultar os dados analíticos de uma publicação;");
            System.out.println("3: Consultar os dados analíticos da Social Bit;");
            System.out.println("4: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");        
    }
       
    
    private static void processarOpcoesMenu1(){
        
        int op = 0;            
        do {
            escolheMenu1();
            op = scan.nextInt();
            switch (op){
                case 1:
                    System.out.println("Escolheu opção 1: Login");
                    Login(rede1);
                    if (rede1.VerificarLogin(nome, pwd)) {
                        processarOpcoesMenu3();
                    }
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Registar");
                    processarOpcoesMenu2();
                    break;
                case 3:
                    System.out.println("Escolheu opção 3: Sair");
                    System.out.println(nomeLogin);
                    ManipulacaoSerializacao.gravarInformacaoFicheiro(nomeFicheiro, rede1);
                    System.out.println(rede1);
                    System.out.println("Antes ler ficheiro: +" + rede1);
                    rede1 = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);      
                    System.out.println("Depois de ler ficheiro: +" + rede1);      
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }
        while(op!=3);
    }
        
    private static void processarOpcoesMenu2(){
        
        int op1;       
        do {
            escolheMenu2();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Criar Utilizador");
                    registarUtilizador(rede1);
                    processarOpcoesMenu3();
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Voltar");
                    processarOpcoesMenu1();
                        break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=2);
    }

        private static void processarOpcoesMenu3(){
        int op1;       
        do {
            escolheMenu3();
            op1 = scan.nextInt();
            switch (op1){
                case 1:
                    System.out.println("Escolheu opção 1: Consultar Feed de notícias");
                    Feed(rede1); // !!!!!!!!!!! testar / melhorar
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Editar Perfil");
                    EditarPerfil(rede1);
                    break;
                case 3:
                    System.out.println("Escolheu opção 3: Páginas");
                    processarOpcoesMenuPagina();
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Amizades");
                    processarOpcoesMenuRelacionamentos();
                    break;
                case 5:
                    System.out.println("Escolheu opção 5: Publicações");
                    processarOpcoesMenuPublicacao();
                    break;
                case 6:
                    System.out.println("Escolheu opção 6: Eventos");
                    processarOpcoesMenuEventos();
                    break;
                case 7:
                    System.out.println("Escolheu opção 7: Calendário");
                    processarOpcoesMenuCalendario();
                    break;
                case 8:
                    System.out.println("Escolheu opção 8: Dados e Estatísticas");
                    processarOpcoesMenuDadosEstatisticas();
                    break;
                case 9:
                    System.out.println("Escolheu opção 9: Log out");
                    LogOut();
                    processarOpcoesMenu1();
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=9);
    }
        
        private static void processarOpcoesMenuPagina(){
        
        int op1;       
        do {
            escolheMenuPagina();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Criar uma Página");
                    CriarPaginaPessoal(rede1);
                    ConsultarPagina(rede1);
                    break;
                case 2: 
                    System.out.println("Escolheu opção 2: Consultar a minha página");
                    ConsultarPagina(rede1);  // testar
                    break;
                case 3: 
                    System.out.println("Escolheu opção 3: Consultar a página de outro utilizador");
                    ConsultarPaginaoOutro(rede1); // testar
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Voltar");
                    processarOpcoesMenu3();
                        break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=4);
    }
        
        private static void processarOpcoesMenuRelacionamentos(){
        
        int op1;       
        do {
            escolheMenuRelacionamentos();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Pedir amizade a outro utilizador");
                    pedirAmizade(rede1);
                    processarOpcoesMenuRelacionamentos();
                    break;
                case 2: 
                    System.out.println("Escolheu opção 2: Consultar pedidos de amizade recebidos;");
                    int contagem = listarPedidosAmizadeRecebidos (nomeLogin, rede1);
                    if (contagem != 0) {
                    aceitarRejeitarPedidosAmizadeRecebidos (nomeLogin,rede1);
                    }
                    processarOpcoesMenuRelacionamentos();
                    break;
                case 3: 
                    System.out.println("Escolheu opção 3: Consultar a minha lista de amigos");
                    listaDeAmigos(rede1, nomeLogin);
                    processarOpcoesMenuRelacionamentos();
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Voltar");
                    processarOpcoesMenu3();
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=4);
        }
        
        private static void processarOpcoesMenuPublicacao(){
        
        int op1;       
        do {
            escolheMenuPublicacao();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Fazer publicação");
                    fazerPublicacao(rede1, nomeLogin);
                    break;
                case 2: 
                    System.out.println("Escolheu opção 2: Consultar publicações criadas;");
                    
                    int qtd = listarPublicacoesDoUtilizador(rede1);
                    if (qtd !=0) {
                    comentarReagirPublicacaoCriadasUtilizador(rede1); // testar + comentar/reagir
                    }
                    break;
                case 3: 
                    System.out.println("Escolheu opção 3: Consultar publicacões partilhadas comigo");
                    int qtd2 = listarPublicacoesPartilhadasComUtilizador(rede1, nomeLogin);
                    if (qtd2 !=0) {
                    comentarReagirPublicacaoPartilhadasUtilizador(rede1); // testar + comentar/reagir
                    }
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Voltar");
                    processarOpcoesMenu3();
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=4);
        }
                
        private static void processarOpcoesMenuEventos(){
        
        int op1;       
        do {
            escolheMenuEventos();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Criar evento");
                    CriarEvento(rede1); // testar 
                    break;
                case 2: 
                    System.out.println("Escolheu opção 2: Editar evento");
                    EditarEventos(rede1); // testar 
                    break;
                case 3: 
                    System.out.println("Escolheu opção 3: Consultar os meus eventos");
                    listarEventosDoUtilizadorAtivo(rede1); // testar 
                    break;
                case 4: 
                    System.out.println("Escolheu opção 4: Consultar todos os eventos");
                    ListarTodosOsEventos(rede1); // testar 
                    break;
                case 5:
                    System.out.println("Escolheu opção 5: Voltar");
                    processarOpcoesMenu3();
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=5);
        }
        
        private static void processarOpcoesMenuCalendario(){
        
        int op1;       
        do {
            escolheMenuCalendario();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Consultar o meu calendário de eventos");
                    listarEventosCalendarioUtilizador(rede1); // testar 
                    break;
                case 2: 
                    System.out.println("Escolheu opção 2: Adicionar um evento ao meu calendário;");
                    AdicionarEventoCalendario(rede1); // testar 
                    break;
                case 3: 
                    System.out.println("Escolheu opção 3: Remover um evento do meu calendário");
                    RemoverEventoCalendario(rede1); // testar 
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Voltar");
                    processarOpcoesMenu3();
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=4);
        }
        
        private static void processarOpcoesMenuDadosEstatisticas(){
        
        int op1;       
        do {
            escolheMenuDadosEstatisticas();
            op1 = scan.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Consultar os dados analíticos de um utilizador");
                    String nome = "";
                    while (nome.equals("")) {
                    System.out.println("Insira o nome do Utilizador que deseja analisar.");
                    nome = scan.next();
                        if (rede1.procurarUtilizador(nome)==true) {
                            qtdRelacionamentosDeUtilizador(rede1, nome);
                            qtdInteressesDeUtilizador(rede1, nome);
                            qtdPublicacoesDeUtilizador(rede1, nome);
                            likesTotaisUtilizador(rede1, nome);
                            dislikesTotaisUtilizador(rede1, nome);
                            likesVsDislikesUtilizador(rede1, nome);
                            amigosEmComum(rede1, nomeLogin, nome);
                            interessesEmComum(rede1, nomeLogin, nome);
                        }
                        else {
                            nome = "";
                            System.out.println("Nome de utilizador inválido. Tente outra vez.");
                        }
                    }
                    break;
                case 2: 
                    System.out.println("Escolheu opção 2: Consultar os dados analíticos de uma publicação");
                    listarPublicacoes(rede1, nomeLogin);
                    int codigoP=0;
                    while(codigoP==0){
                        System.out.println("Insira o código da publicação que deseja analisar.");
                        codigoP = scan.nextInt();
                        if (rede1.verificarPublicacaoPaginas(codigoP)==true) {
                            qtdLikesPublicacaoPagina(rede1, codigoP);
                            qtdDislikesPublicacaoPagina(rede1, codigoP);
                            likesVsDislikesPublicacao(rede1, codigoP);
                        }
                        else {
                            codigoP = 0;
                            System.out.println("Código inválido. Tente outra vez.");
                    }
                }
                  
                    break;
                case 3: 
                    System.out.println("Escolheu opção 3: Consultar os dados analíticos da Social Bit");
                    qtdUtilizadoresNaRede(rede1);
                    qtdPublicacoesNaRede(rede1);
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Voltar");
                    processarOpcoesMenu3();
                    break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=4);
        }        
     
    public static void reagirPublicacao(Rede rede, int codigoProcura) {
        System.out.println("Selecione a reação desejada.");
        System.out.println("1-LIKE / 2-DISLIKE");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
               Reacao r = new Reacao(true); 
               rede.procurarPublicacaoPaginas(codigoProcura).adicionarReacao(r);// p.adicionarReacao(new Reacao(true));
                break;
            case 2:
                Reacao r2 = new Reacao(false);
                 rede.procurarPublicacaoPaginas(codigoProcura).adicionarReacao(r2);
                break;
        }
    } 
   //SEMANA 4 airton
   public static void comentarPublicacao(Rede rede, int codigo) {
       System.out.println("Escreva o seu comentario ");
       scan.nextLine();
       String corpoC= scan.nextLine();
        //String corpoC = JOptionPane.showInputDialog(null, "Escreva o seu comentario ");
       Comentario c = new Comentario(corpoC);
        procurarPublicacaoPaginas(rede,codigo).adicionarComentario(c); //procura a publicacaopagina com o codigo inserido e adiciona o comentario
    }
   
   //SEMANA 4 airton
   public static PublicacaoPaginas procurarPublicacaoPaginas(Rede r, int codigoAProcurar){
        
         int i=0;
        for (PublicacaoPaginas p : r.getListaPubPag()){
        if(codigoAProcurar==r.getListaPubPag().get(i).getPublicacao().getCodPb()){
            return r.getListaPubPag().get(i);
          } 
        } 
       return null;
  }
   
    
    public static void ConsultarPagina(Rede rede){
        Pagina p = rede.procurarUtilizador2(nomeLogin).getPagina();
        System.out.println(p.toString());
        listarPublicacoesDoUtilizador(rede1);
        listarPublicacoesPartilhadasComUtilizador(rede1,nomeLogin);
    }

    
    public static void ConsultarPaginaoOutro(Rede rede){
        String Utilizador = "";
        while (Utilizador.equals("")) {
        System.out.println("Nome do utlizador de que pretende ver a pagina?");
        Utilizador=scan.nextLine();
        }
        Utilizador u = rede.procurarUtilizador2(Utilizador);
        if (u.getPagina().getEstado()==true || u.procurarRelacionamento(u, nomeLogin)==true) {
            System.out.println(rede.procurarUtilizador2(Utilizador).getPagina());
            listarPublicacoesDoUtilizador(rede1,u.getLogin());
            listarPublicacoesPartilhadasComUtilizador(rede1,Utilizador);
        }
        else {
            System.out.println("nao tem acesso a esta pagina");

        }
    }

    //perguntar se está bem
    public static void fazerPublicacao(Rede rede, String nomeLogin) {
        String corpo = "";
        while (corpo.equals("")) {
            System.out.println("Escreva a sua publicação");
            corpo = scan.next();
        }
        System.out.println("Visibilidade da publicação: ");
        System.out.println("1-publica");
        System.out.println("2-so para amigos");
        int escolha = scan.nextInt();
        if (escolha == 1) {
          Utilizador u = rede.procurarUtilizador2(nomeLogin);
        Publicacao p = new Publicacao(corpo,true);
        u.adicionarPublicacoes(p);
        System.out.println(p.toString());  
        
        try {
            Publicacao p1 = (Publicacao) p.clone();  //Da erro quando utilizo o clone para fazer publicações-pagina
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        PublicacaoPaginas pAtivo = new PublicacaoPaginas(p, rede.procurarUtilizador2(nomeLogin).getPagina());
        rede.adicionarPublicacaoPaginas(pAtivo);
        int i = 0;
        for (Relacionamento re : u.getListaRelacionamentos()) {
            if (re.getNomeAmigo().equals(rede.getListaUtilizadores().get(i).getNome())) { //procura nome do amigo no array de utilizadores 
                PublicacaoPaginas pp = new PublicacaoPaginas(p, rede.getListaUtilizadores().get(i).getPagina());
                rede.adicionarPublicacaoPaginas(pp);
            }

            i++;
        }
        } else {
            Utilizador u = rede.procurarUtilizador2(nomeLogin);
        Publicacao p = new Publicacao(corpo,false);
        u.adicionarPublicacoes(p);
        System.out.println(p.toString());  
        
        try {
            Publicacao p1 = (Publicacao) p.clone();  //Da erro quando utilizo o clone para fazer publicações-pagina
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        PublicacaoPaginas pAtivo = new PublicacaoPaginas(p, rede.procurarUtilizador2(nomeLogin).getPagina());
        rede.adicionarPublicacaoPaginas(pAtivo);
        int i = 0;
        for (Relacionamento re : u.getListaRelacionamentos()) {
            if (re.getNomeAmigo().equals(rede.getListaUtilizadores().get(i).getNome())) { //procura nome do amigo no array de utilizadores 
                PublicacaoPaginas pp = new PublicacaoPaginas(p, rede.getListaUtilizadores().get(i).getPagina());
                rede.adicionarPublicacaoPaginas(pp);
            }

            i++;
        }
        }
        
 
        
    }

    //nomeLogin
    public static int listarPublicacoesDoUtilizador(Rede rede,String nome) {
        System.out.println("As suas publicações");
        Utilizador u = rede.procurarUtilizador2(nome);
        int i = 0;
        int qtd = 0;
        for (Publicacao p : u.getPublicacoes()) {
            System.out.println(u.getPublicacoes());
        //u.getPublicacoes().get(i).toString(); //fazer override de metodo toString
        }
        if (u.getPublicacoes().size() == 0) {
            qtd = 0;
        }
        return qtd;
    }   
    
    public static int listarPublicacoesDoUtilizador(Rede rede) {
        System.out.println("As suas publicações");
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        int i = 0;
        int qtd = 0;
        for (Publicacao p : u.getPublicacoes()) {
            System.out.println(u.getPublicacoes());
        //u.getPublicacoes().get(i).toString(); //fazer override de metodo toString
        }
        if (u.getPublicacoes().size() == 0) {
            qtd = 0;
        }
        return qtd;
    }
    
    
    public static int listarPublicacoesPartilhadasComUtilizador(Rede rede, String nomeLogin) {
        System.out.println("Publicações partilhadas consigo");
        Utilizador u = rede.procurarUtilizador2(nomeLogin); //utilizador ativo
        String nomeAmigo = "";
        int qtd =0;
        int i = 0;
        for (Relacionamento rel : u.getListaRelacionamentos()) {
            listarPublicacoesDeUtilizadorEspecifico(u.getListaRelacionamentos().get(i).getNomeAmigo(), rede); 
            Utilizador uA = rede.procurarUtilizador2(u.getListaRelacionamentos().get(i).getNomeAmigo());
                i++;
                if (uA.getPublicacoes().size() != 0) {
                    qtd++;
                }
        }
        
        return qtd;
    }

    
    public static void listarPublicacoesDeUtilizadorEspecifico(String nome, Rede rede) {
        Utilizador u = rede.procurarUtilizador2(nome);
        int i = 0;
        for (Publicacao p : u.getPublicacoes()) {
            u.getPublicacoes().get(i).toString();
            i++;
        }

    }
    //----------------------------------DADOS ANALITICOS------------------------------------------------------
    //SEMANA 4 airton
    public static int qtdLikesPublicacaoPagina(Rede rede, int codigo){
    int qtdLikes = procurarPublicacaoPaginas(rede,codigo).getQtdLikes();
    return qtdLikes;
    }
    //SEMANA 4 airton
    public static int qtdDislikesPublicacaoPagina(Rede rede, int codigo){
    int qtdDislikes = procurarPublicacaoPaginas(rede,codigo).getQtdDislikes();
    return qtdDislikes;
    }
    // Comentarios por publicações, fazer medias
    public static int qtdRelacionamentosDeUtilizador(Rede rede, String nome){
    int qtdR = rede.procurarUtilizador2(nome).getRelacionamentos().size();
    return qtdR;
    }
    public static int qtdInteressesDeUtilizador(Rede rede, String nome){
    int qtdI= rede.procurarUtilizador2(nome).getInteresses().size();
    return qtdI;
    }
    public static int qtdPublicacoesDeUtilizador(Rede rede, String nome){
    int qtdP= rede.procurarUtilizador2(nome).getPublicacoes().size();
    return qtdP;
    }
    public static void likesVsDislikesPublicacao(Rede rede, int codigoP){
    int qtdLikes = qtdLikesPublicacaoPagina(rede, codigoP);
    int qtdDislikes = qtdDislikesPublicacaoPagina(rede,codigoP);
    int total = qtdLikes + qtdDislikes;
    
    double percentagemLikes = (qtdLikes * 100)/total;
    double percentagemDislikes = (qtdDislikes * 100)/total;
    
    System.out.println(percentagemLikes+"% de likes");
    System.out.println(percentagemDislikes+"% de dislikes");
    }
    public static int likesTotaisUtilizador(Rede rede, String nome){
    Utilizador u = rede.procurarUtilizador2(nome);
    int likes= 0;
     for (Publicacao p : u.getPublicacoes()){
        likes+=qtdLikesPublicacaoPagina(rede,p.getCodPb());     
     }
     return likes;
    }
    public static int dislikesTotaisUtilizador(Rede rede, String nome){
    Utilizador u = rede.procurarUtilizador2(nome);
    int dislikes= 0;
     for (Publicacao p : u.getPublicacoes()){
        dislikes+=qtdLikesPublicacaoPagina(rede,p.getCodPb());     
     }
     return dislikes;
    }
    public static void likesVsDislikesUtilizador(Rede rede, String nome){
    int likes = likesTotaisUtilizador(rede,nome);
    int dislikes = dislikesTotaisUtilizador(rede,nome);
    int total= likes + dislikes;
    double percentagemLikes = (likes * 100)/total;
    double percentagemDislikes = (dislikes * 100)/total;
    
    System.out.println(percentagemLikes+"% de likes");
    System.out.println(percentagemDislikes+"% de dislikes");
    }
    //TESTAR
    public static void amigosEmComum(Rede rede, String nomeLogin, String nomeAmigo){
    Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin);
    Utilizador uAmigo= rede.procurarUtilizador2(nomeAmigo);
    int i = 0;
    int j =0;
    int qtdAComum=0;
     for(Relacionamento r : uAtivo.getListaRelacionamentos()){
         uAtivo.getListaRelacionamentos().get(i).getNomeAmigo();
          for(Relacionamento re : uAmigo.getListaRelacionamentos()){
          uAmigo.getListaRelacionamentos().get(j).getNomeAmigo();
          j++;
          if(uAtivo.getListaRelacionamentos().get(i).getNomeAmigo().equals(uAmigo.getListaRelacionamentos().get(j).getNomeAmigo())){
          System.out.println(uAtivo.getListaRelacionamentos().get(i).getNomeAmigo());}
          qtdAComum++;
          }
              i++ ;
            } 
     System.out.println("Tem "+qtdAComum+" amigos em comum com "+nomeAmigo);
     }
    public static void interessesEmComum(Rede rede, String nomeLogin, String nomeAmigo){
    Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin);
    Utilizador uAmigo= rede.procurarUtilizador2(nomeAmigo);
    int i = 0;
    int j =0;
    int qtdIComum=0;
     for(Interesse interesse : uAtivo.getInteresses()){
      uAtivo.getInteresses().get(i);
      for (Interesse i2 : uAmigo.getInteresses()){
      uAmigo.getInteresses().get(j);
      j++;
      if(uAtivo.getInteresses().get(i).equals(uAmigo.getInteresses().get(j))){
          System.out.println(uAtivo.getInteresses().get(i));
          qtdIComum++;
         }
      }
      i++;

      }

        System.out.println("Tem "+qtdIComum+" interesses em comum com "+nomeAmigo);
    }
    
    public static int qtdUtilizadoresNaRede(Rede rede){
    int qtdU= rede.getListaUtilizadores().size();
    return qtdU;
    }

    public static int qtdPublicacoesNaRede(Rede rede){
    int qtdU= rede.getListaUtilizadores().size();
    return qtdU;
    }
    
    
    
    ////////////////////////////////////////////////////////////////
     
    public static LocalDateTime dateInput(String userInput) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime date = LocalDateTime.parse(userInput, dateFormat);

        System.out.println(date);
    
    return date ;
}
    public int publicacoesEmIntervalo(Rede rede, String nome){
    Utilizador u = rede.procurarUtilizador2(nome);
        System.out.println("Insira a data a partir da qual pretende verificar o numero de publicações no intervalo");
        String dataString= scan.nextLine();
        LocalDateTime data1= dateInput(dataString);
        System.out.println("Insira a segunda data");
        String data2String= scan.nextLine();
        LocalDateTime data2= dateInput(dataString);
        int i = 0;
        int qtdPb=0;
        for (Publicacao p : u.getPublicacoes()){
            
         if(u.getPublicacoes().get(i).getDataPb().isAfter(data1) && u.getPublicacoes().get(i).getDataPb().isBefore(data2)){
         qtdPb++;
         }
        }
    return qtdPb;
    }
    
    
    
    public static void listaDeAmigos(Rede rede, String nomeLogin){
     Utilizador u = rede.procurarUtilizador2(nomeLogin); //utilizador ativo
     
        int i = 0;
        ArrayList <String> relac = new ArrayList <>();
        for (Relacionamento rel : u.getListaRelacionamentos()) {     
           if (rel.isEstado() == true) {
           System.out.println(u.getListaRelacionamentos().get(i).getNomeAmigo());
           relac.add(u.getListaRelacionamentos().get(i).getNomeAmigo());
           }
        i++;  
        }
        System.out.println("Tens "+relac.size() +" amigos!");
    }
   
    
    

    public static void pedirAmizade(Rede rede) {
        int opcaoMenu = -4;
        while (opcaoMenu == -4) {
        String input = "";
        int opcao = 0;
        while (input.equals("")) {
            System.out.println("\n");
            System.out.println("Escreva o nome do utilizador que pretende adicionar como amigo:");
            System.out.println("Escreva 'v' para voltar:");
            input = scan.next();
        }
        if (input.equals("v")) {
            opcaoMenu = -3;
        } else {// ta a procurar por todos os nomes e faz o else abaixo
                Utilizador u = rede.procurarUtilizador2(input);
                //preciso de de parar o varrimento da lista de utilizadores ate encontrar o nome que quer.
                if (input.equals(u.getLogin())) {
                    rede.adicionarRel(rede, u, nomeLogin, input);
                    System.out.println("Pedido de amizade enviado com sucesso ao utilizador: " + input);
                    opcaoMenu = -3; // como sair diretmente para o menu 3?
                }
                else {
                    opcao = 0;
                    while (opcao == 0) {
                        System.out.println("Nome de utilizador não existe.");
                        System.out.println("1. Tentar Novamente;");
                        System.out.println("2. Voltar;");
                        System.out.println("Escolher opção: ");
                        opcao = scan.nextInt();
                    }
                    if (opcao == 1) {
                        opcaoMenu = -4;
                    } else {
                        opcaoMenu = -3;
                    }
                }                        
                }
            }
        }
        
        
        
        

    
    public static void Login(Rede rede) {
        System.out.println("Username: ");
        nome = "";
        pwd = "";
        while (nome.equals("")) {
            nome = scan.nextLine();
        }
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false) {
            System.out.println("Username errado");
        } else {
            System.out.println("Palavra-Passe: ");
            pwd = scan.nextLine();
            boolean resp2 = rede.VerificarLogin(nome, pwd);
            if (resp2 == false) {
                System.out.println("Palavra passe errada");
                nome = "";
                pwd = "";
            } else {
                System.out.println("Palavra passe correta");
                nomeLogin = nome;
                System.out.println("Logado");
                System.out.println("Olá "+ nomeLogin +"!");
            }
        }
    }

    public static void registarUtilizador(Rede rede) {
        System.out.println("Insira username: ");
        String nome = "";
        String pwd = "";
        while (nome.equals("")) {
            nome = scan.nextLine();
        }
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == true) {
            System.out.println("username disponivel");
        } else {
            while (pwd.equals("")) {
                String nomeLogin = nome;
                System.out.println("Insira Palavra-passe: ");
                pwd = scan.nextLine();
            }
            System.out.println("Insira a sua data de nascimento");
            Data dataNas = new Data() {
            };
            rede.registarUtilizador(nome, dataNas, nomeLogin, pwd);
            System.out.println(dataNas);
          //  ManipulacaoSerializacao.gravarInformacaoFicheiro(nomeFicheiro, rede); //
           // rede = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);
            System.out.println(" == Informação do ficheiro ==\n" + rede.toString());
        }
    }

    public static void CriarPaginaPessoal(Rede rede) {
        
        int op = 0;
        String nomePagina = "";
        System.out.println("Nome da Pagina Pessoal?");
        while (nomePagina.equals("")) {
        nomePagina = scan.next();
        }
        while (op == 0) {
        System.out.println("Estado da Pagina:");
        System.out.println("1 - Público");
        System.out.println("2 - Só amigos");
        op = scan.nextInt();
        }
        boolean estado = true;
        if (op == 1) {
            estado = true;
        }
        
        else if(op == 2) {
                estado = false;
            }
            else {
                op = 0;
            }
        
        rede.CriarPagina(nomeLogin, nomePagina, estado);
    }

public static void EditarPerfil(Rede rede) {
        
        int op = 0;
        while (op == 0) {
            System.out.println("Nome: "+rede.procurarUtilizador2(nomeLogin).getNome());
        System.out.println("Data de nascimento: "+rede.procurarUtilizador2(nomeLogin).getDataNas());
            System.out.println("Lista de interesses: "+rede.procurarUtilizador2(nomeLogin).getInteresses());
            System.out.println("Username de login: "+rede.procurarUtilizador2(nomeLogin).getLogin());
            System.out.println("Password atual: "+rede.procurarUtilizador2(nomeLogin).getPwd());
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("Selecione o numero do que pretende editar");
            System.out.println("1-nome");
            System.out.println("2-data de Nascimento");
            System.out.println("3-Interesses");
            System.out.println("4-Login");
            System.out.println("5-Password");
            System.out.println("6-Voltar");
            op = scan.nextInt();
        }
        switch (op) {
            case 1:
                String nomePretendido = "";
                while (nomePretendido.equals("")) {
                System.out.println("Nome pretendido?");
                nomePretendido = scan.next();
                }
                rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), nomePretendido);
                System.out.println("Nome alterado com sucesso para: "+nomePretendido);                
                break;
               
            case 2:                           
                System.out.println("Data nasicmento pretendida?");
                    System.out.println("Insira o ano de nascimento: ");
                    int ano = scan.nextInt();
                    System.out.println("Insira o mes de nascimento: ");
                    int mes = scan.nextInt();
                    System.out.println("insira o dia de nascimento");
                    int dia = scan.nextInt();
                Data dataNascimento = new Data(ano,mes,dia);
                
                rede.alterarDataNascimento(rede.procurarUtilizador2(nomeLogin), dataNascimento);
                System.out.println("Data de nascimento alterada com sucesso para"+dataNascimento);
                break;
            case 3:
                int dec = 0;
                while (dec < 1 || dec > 2) {
                System.out.println("Pretende adicionar ou remover interesses?");
                System.out.println("1-Adicionar");
                System.out.println("2-Remover");
                dec = scan.nextInt();
                }                
                Interesse interesse = new Interesse();
                if (dec == 1) {                   
                    System.out.println("Qual interesse pretende inserir?");
                    String interesseCorpo = "";
                    while  (interesseCorpo.equals("")) {
                    interesseCorpo = scan.nextLine();
                    }
                    rede.adicionarInteresses(rede.procurarUtilizador2(nomeLogin), new Interesse(interesseCorpo));
                    System.out.println("O interesse " + interesseCorpo + " foi adicionado com sucesso");
                } else {
                    Utilizador u = rede.procurarUtilizador2(nomeLogin);
                    for (int i =0; i <  u.getListaInteresses().size(); i++) {
                        System.out.println(i+"- "+u.getListaInteresses().get(i).toString());                 
                    }
                    System.out.println("Qual o numero do interesse pretende remover?");
                       int escolhaInteresse = scan.nextInt();
                       
                     System.out.println("Interesse"+u.getListaInteresses().get(escolhaInteresse) +"removido com sucesso");
                    rede.RemoverInteresses(rede.procurarUtilizador2(nomeLogin), escolhaInteresse);
                    System.out.println("Interesses restantes");
                    for (int i =0; i <  u.getListaInteresses().size(); i++) {
                        System.out.println(i+"- "+u.getListaInteresses().get(i).toString());                  
                    }
                }
                break;
            case 4:
                String NovoLogin = "";
                while (NovoLogin.equals("")) {
                System.out.println("Novo login?");
                NovoLogin = scan.next();
                }
                rede.alterarLogin(rede.procurarUtilizador2(nomeLogin), NovoLogin);
                nomeLogin = NovoLogin;
                System.out.println("Nome de login alterado com sucesso para: " + NovoLogin);
                break;
            case 5:
                String pwd = "";
                while (pwd.equals("")) {
                System.out.println("Nova Password?");
                pwd = scan.next();
                }
                rede.alterarPwd(rede.procurarUtilizador2(nomeLogin), pwd);
                System.out.println("Palavra passe alterada com sucesso");
                break;               
            case 6:
                break;
        }
    }
    

    public static void addRelacionamento (Rede rede, Utilizador u, String nomeLogin, LocalDateTime dataAceitacao, boolean estado, String nomeAmigo) {
        rede.adicionarRelacionamento(rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
}
    
    public static void removeRelacionamento (Relacionamento r, Rede rede, Utilizador u, String nomeLogin, LocalDateTime dataAceitacao, boolean estado, String nomeAmigo) {
        rede.removerRelacionamento(r, rede, u, nomeLogin, dataAceitacao, estado, nomeAmigo);
    }

    public static void listarRelacionamentos(String nomeLogin, Rede rede) {
        int contagem = 0;
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        for (Relacionamento r : u.getListaRelacionamentos()) {
            if (r.isEstado() == true) {
            contagem += 1;
            System.out.println(contagem + ". " + r.getNomeAmigo());
            }
        }
    }
    public static int listarPedidosAmizadeRecebidos (String nomeLogin, Rede rede) {
        int contagem = 0;
        String nomeAmigo = "";
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        for (Relacionamento r : u.getListaRelacionamentos()) {
            nomeAmigo = r.getNomeAmigo();
            if (r.isEstado() == false && nomeLogin.compareTo(nomeAmigo) == 0) {
                contagem +=1;
                System.out.println("Pedidos Recebidos de:");
                System.out.println(contagem + ". " + r.getNomeAmigo());
            }
            if (contagem == 0) {
                System.out.println("Não tem pedidos de amizade");
            }
        }
        return contagem;
    }
    
    public static void aceitarRejeitarPedidosAmizadeRecebidos (String nomeLogin, Rede rede) {
        System.out.println("Deseja aceitar ou rejeitar algum pedido de amizade");
        int opcao = 0;
        while (opcao < 1 || opcao > 2) {
                    System.out.println("Selecione 1 para continuar.");
                    System.out.println("Selecione 2 para voltar.");
                    opcao = scan.nextInt();
                    }
                        if (opcao == 2) {
                            System.out.println("Selecionou a opção 2: Voltar");
                            processarOpcoesMenuRelacionamentos();
                        }
                        if (opcao == 1) {
                            int contagem = 0;
                            Utilizador u = rede.procurarUtilizador2(nomeLogin);
                            for (Relacionamento r : u.getListaRelacionamentos()) {
                                if (r.isEstado() == false) {
                                    contagem +=1;
                                }
                            }
                            int contagem2 = 0;
                            while (contagem2 == 0) {
                            System.out.println("Selecione o número do utilizador.");
                            contagem2 = scan.nextInt();
                            }
                            int i = 0;
                            
                            
                            int aR = 0;
                            Relacionamento re1 = new Relacionamento();
                            for (Relacionamento re : u.getListaRelacionamentos()) {
                                    if ((contagem2-1) == i) {
                                        while (aR < 1 || aR > 2) {
                                        System.out.println("Selecionou o pedido do utilizador"+ re.getNomeAmigo());
                                        System.out.println("Selecione 1 para aceitar.");
                                        System.out.println("Selecione 2 para rejeitar.");
                                        aR = scan.nextInt();
                                        re1 = re;
                                        }
                                    }
                                    i++;       
                            }   
                                        if (aR == 1) {
                                            re1.setEstado(true);
                                              System.out.println("Utilizador " + re1.getNomeAmigo() + ("é seu amigo!"));
                                            }
                                            if (aR == 2) {
                                                rede.removerRelacionamentoListaRelacionamentos(u, re1);   
                                                System.out.println("Pedido rejeitado com sucesso");
                                            }
                                
                            }
                    }
    
    public static void comentarReagirPublicacaoCriadasUtilizador (Rede rede) {
        System.out.println("Deseja comentar ou reagir a alguma publicação?");
        int opcao = 0;
        while (opcao < 1 || opcao > 2) {
            System.out.println("Selecione 1 para continuar.");
            System.out.println("Selecione 2 para voltar.");
            opcao = scan.nextInt();
        }
        if (opcao == 2) {
            System.out.println("Selecionou a opção 2: Voltar");
            processarOpcoesMenuPublicacao();
        }
        if (opcao == 1) {
            int codigo = 0;
            while (codigo == 0) {
                System.out.println("Selecione o código da publicação que deseja comentar ou reagir.");
                codigo = scan.nextInt();
            }

            PublicacaoPaginas pp = rede.procurarPublicacaoPaginas(codigo);

            int opcao2 = 0;
            while (opcao2 < 1 || opcao2 > 2) {
                System.out.println("Selecione 1 para comentar.");
                System.out.println("Selecione 2 para reagir.");
                opcao2 = scan.nextInt();
            }
            if (opcao2 == 1) {
                comentarPublicacao(rede1, codigo);
            }
            if (opcao2 == 2) {
                reagirPublicacao(rede1, codigo);
            }

        }
    }
    
    public static void comentarReagirPublicacaoPartilhadasUtilizador (Rede rede) {
        System.out.println("Deseja comentar ou reagir a alguma publicação?");
        int opcao = 0;
        while (opcao < 1 || opcao > 2) {
                    System.out.println("Selecione 1 para continuar.");
                    System.out.println("Selecione 2 para voltar.");
                    opcao = scan.nextInt();
                    }
                        if (opcao == 2) {
                            System.out.println("Selecionou a opção 2: Voltar");
                            processarOpcoesMenuPublicacao();
                        }
                        if (opcao == 1) {
                            int codigo = 0;
                            while (codigo == 0) {
                                System.out.println("Selecione o código da publicação que deseja comentar ou reagir.");
                                codigo = scan.nextInt();
                            }
                            PublicacaoPaginas pp = rede.procurarPublicacaoPaginas(codigo);
                           // pp.getPublicacao().getCodPb();
                            
                            int opcao2 = 0;
                            while (opcao2 < 1 || opcao2 > 2) {
                                System.out.println("Selecione 1 para comentar.");
                                System.out.println("Selecione 2 para reagir.");
                                opcao2 = scan.nextInt();
                            }
                            if (opcao2 == 1) {
                                comentarPublicacao(rede1, codigo);
                            }
                            if (opcao2 == 2) {
                                reagirPublicacao(rede1, codigo);
                            }
                            
        }   
    }
    
    
    
    public static void CriarEvento(Rede rede){
        
        String titulo = "";
        String texto = "";
        while (titulo.equals("")) {
        System.out.println("titulo");
        titulo=scan.nextLine();
        }
        while (texto.equals("")) {
        System.out.println("Descricao do evento");
        texto=scan.next();
        }
        System.out.println("Ano do evento");
        int ano = scan.nextInt();
        System.out.println("Mes do evento");
        int mes = scan.nextInt();
        System.out.println("Dia do evento");
        int dia = scan.nextInt();
        Data dataEvento=new Data(ano,mes,dia);
        rede.adicionarEventos(nomeLogin, titulo, texto, new Data(dataEvento));
    }

public static ArrayList<Eventos>listarEventosDoUtilizadorAtivo(Rede rede) {
        System.out.println("Os eventos do utilizador ativo são: ");
        return rede.listarEventos2(rede.procurarEventos(nomeLogin));
       
    }
    
    public static ArrayList<Eventos> ListarTodosOsEventos(Rede rede){
       return rede.listarEventos();
        
    }
 
public static void EditarEventos(Rede rede) {
        
        int op = 0;
        while (op == 0) {
            System.out.println("Selecione o numero do que pretende editar");
            System.out.println("1-Título");
            System.out.println("2-Descrição");
            System.out.println("3-Apagar");
            op = scan.nextInt();
        }
        switch (op) {
            case 1:
                System.out.println(listarEventosDoUtilizadorAtivo(rede));
                System.out.println("Numero do evento que pretende mudar o nome?");
                int escolha = scan.nextInt();
                String nomePretendido = "";
                while (nomePretendido.equals("")) {
                System.out.println("Título pretendido?");
                nomePretendido = scan.nextLine();
                }
                rede.AlterarNomeEventos(rede.procurarEventos(nomeLogin).get(escolha-1), nomePretendido);
                System.out.println(rede.procurarEventos(nomeLogin));
                break;
            case 2:
               System.out.println(listarEventosDoUtilizadorAtivo(rede));
                System.out.println("Numero do evento que pretende mudar a descrição?");
                int escolha2 = scan.nextInt();
                String DescPetendida = "";
                while (DescPetendida.equals("")) {
                System.out.println("Qual a descrição pretendida?");
                DescPetendida = scan.nextLine();
                }
                System.out.println(rede.procurarEventos(nomeLogin).get(escolha2 - 1));
                rede.alterarDescricaoEventos(rede.procurarEventos(nomeLogin).get(escolha2 -1), DescPetendida);
                System.out.println(listarEventosDoUtilizadorAtivo(rede));
                break;
            case 3:
               System.out.println(listarEventosDoUtilizadorAtivo(rede));
                System.out.println("Numero do evento que pretende Remover");
                int escolha3 = scan.nextInt();
                rede.removerEvento(nomeLogin, escolha3);
                System.out.println(listarEventosDoUtilizadorAtivo(rede));
                break;
        }
    }

        public static void ListarEventosAdicionadosCalendario (Rede rede) {
            System.out.println(listarEventosDoUtilizadorAtivo(rede));
        }
        
        public static void listarEventosCalendarioUtilizador (Rede rede) {
            if (rede.procurarUtilizador2(nomeLogin).getListaEventosCalendario() == null) {
                System.out.println("Não tem eventos adicionados ao seu calendário");
            } else {
                System.out.println(rede.procurarUtilizador2(nomeLogin).getListaEventosCalendario());
            }
        }
        
        public static void RemoverEventoCalendario(Rede rede) {
        if (rede.procurarUtilizador2(nomeLogin).getListaEventosCalendario() == null) {
            System.out.println("Não tem eventos adicionados ao seu calendário");
        } else {
            int contagem = 0;
            for (Eventos e : rede.procurarUtilizador2(nomeLogin).getListaEventosCalendario()) {
                System.out.println("Evento " + (contagem + 1) + ". " + e.getNomeEv());
            }
            int opcao = 0;
            while (opcao == 0) {
                System.out.println("Escolha o número do Evento que deseja remover ao seu calendário");
                opcao = scan.nextInt();
            }
            rede.procurarUtilizador2(nomeLogin).getListaEventosCalendario().remove(opcao-1);
        }

    }
        
        public static void AdicionarEventoCalendario (Rede rede) {
            int contagem = 0;
            int opcao = 0;
            LocalDate data = LocalDate.now();
            int comparacaoDatas = 0;
            for (Eventos e : rede.getListaEventos()) {
                data.plusDays(30).compareTo((ChronoLocalDate) e.getDataEvento());
                if (comparacaoDatas > 0) {
                contagem ++;
                System.out.println(contagem + ". " + e.getNomeEv());                
            }
            while (opcao == 0) {
            System.out.println("Escolha o número do Evento que deseja adicionar ao seu calendário");
            opcao = scan.nextInt();
            }
            int i = 1;
            for (Eventos eve : rede.getListaEventos()) {
                if (opcao == i) {
                rede.adicionarEventoListaEventos(rede.procurarUtilizador2(nomeLogin), eve);
                }
                i++;
            }
        }
    }
        // Adicionar pedidos de amizade
        public static void Feed(Rede rede){
        System.out.println("--------------------FEED DE NOTICIAS------------------------");
            System.out.println("Eventos: ");
        System.out.println(rede.listarEventos3());
            System.out.println("publicações: ");
         ArrayList<String> FEED = new ArrayList<>();

       for (Utilizador u : rede.getListaUtilizadores()){
            //if(u.getPublicacoes().get(0).isVisibilidade()==false) {
            rede.procurarUtilizador2(u.getNome());

           for (int i =0; i <  u.getPublicacoes().size(); i++) {
               if ( u.getPublicacoes().get(i).isVisibilidade()==true) {
                   //System.out.println(u.getPublicacoes().get(i).toString());
                   String x = "Publicacao: "+u.getPublicacoes().get(i).getCorpoPb() +" Data: "+ u.getPublicacoes().get(i).getDataPb();
                   FEED.add(x);

                   //if (u.getPublicacoes().get(i).getDataPb()) {

                   }
               for (int j = 0; j < u.getRelacionamentos().size(); j++) {
                   if (u.getPublicacoes().get(i).isVisibilidade()==false && u.getRelacionamentos().get(j).isEstado()==true) {
                       String x = "Publicacao: "+u.getPublicacoes().get(i).getCorpoPb() +" Data: "+ u.getPublicacoes().get(i).getDataPb();
                   FEED.add(x);
                   }
               }

               }Collections.sort(FEED);

               }
            System.out.println(FEED);
           }

        
        
        public static void LogOut(){
            nomeLogin = "";
        }
 
        public static void listarPublicacoes(Rede rede, String nomeLogin){
        ArrayList<String> listaP = new ArrayList<>();
        for (Utilizador u : rede.getListaUtilizadores()){
            //if(u.getPublicacoes().get(0).isVisibilidade()==false) {


           for (int i =0; i <  u.getPublicacoes().size(); i++) {
               if ( u.getPublicacoes().get(i).isVisibilidade()==true) {
                   //System.out.println(u.getPublicacoes().get(i).toString());
                   String x = "Publicacao: "+u.getPublicacoes().get(i).getCorpoPb() +" Codigo: "+ u.getPublicacoes().get(i).getCodPb();
                   listaP.add(x);

                   //if (u.getPublicacoes().get(i).getDataPb()) {

                   }
               for (int j = 0; j < u.getRelacionamentos().size(); j++) {
                   if (u.getPublicacoes().get(i).isVisibilidade()==false && u.getRelacionamentos().get(j).isEstado()==true) {
                       String x = "Publicacao: "+u.getPublicacoes().get(i).getCorpoPb() +" Codigo "+ u.getPublicacoes().get(i).getCodPb();
                   listaP.add(x);
                   }
               }

       }
    }
    for (String s : listaP){
             System.out.println(s); 
             }
    }
}

