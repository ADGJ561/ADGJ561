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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
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
    static String nomeLogin = "";
    int opcaoMenu = 0;
    private static Rede rede1 = new Rede();

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        int opcaoMenu = -1;
        rede1 = new Rede("nome rede",LocalDate.now(),3);
        rede1 = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);      
        //  Utilizador u2 = new Utilizador("maria", "maria", "123");
        //rede1.adicionarUtilizador(u2);
        //rede1.adicionarUtilizador(u1);
        Eventos e1 = new Eventos("evento1","esta a funcionar sou o rei2",1);
        rede1.adicionarEventos(nomeLogin, "sdad", "sdadas");
        rede1.adicionarEventos(nomeLogin, "Sou o 2", "Numero2");
        rede1.adicionarEventos(nomeLogin, "aaaaaaaaaaaaa", "uuuuuuuuuuuuuuuuuuu");
        rede1.adicionarEventos(nomeLogin, "aaaaaaaaaaaaa", "uuuuuuuuuuuuuuuuuuu");
        rede1.adicionarEventos2(e1);
        System.out.println(listarEventosDoUtilizadorAtivo(rede1));
        System.out.println(ListarTodosOsEventos(rede1));
        System.out.println("Antes rede: "+rede1);
            
        /*
        //
        main args
        processarOpcoesMenu1();
        //ends
        
        
        int opcaoMenu = -1;
       
        private static void processarOpcoesMenu1(){
        
        escolheMenu1();
        do {
            op = in.nextInt();
            switch (op){
                case 1:
                    System.out.println("Escolheu opção 1: Login");
                    Login(rede1); // while com password. usar ficheiros com utilizadores
                    processarOpcoesMenu3();
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Registar");
                    opcaoMenu = -2;
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
        }while(op!=9);
    }    
        
    private static void processarOpcoesMenu2(){
            int op1;
            escolheMenu2();
        do {
            op1 = in.nextInt();
            switch (op1){
                case 1: 
                    System.out.println("Escolheu opção 1: Criar Utilizador");
                    registarUtilizador(rede1);
                    processarOpcoesMenu3;
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Voltar");
                    processarOpcoesMenu1();
                        break;
                default:
                    System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=9);
    }

        private static void processarOpcoesMenu3(){
        int op1;
        
        escolheMenu3();
        do {
            op1 = in.nextInt();
            switch (op1){
                case 1: { System.out.println("Foi selecionada a opção de 1 do menu 3 "); mostrarMenu3(); break;}
                case 2: { System.out.println("Foi selecionada a opção de 2 do menu 3 "); mostrarMenu3(); break;}
                case 3: { System.out.println("Foi selecionada a opção de 2 do menu 3 "); mostrarMenu3(); break;}
                case 9: { System.out.println("Foi selecionada a opção de 9 do menu 3 "); break;}
                default: System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=9);
    }
    
    
    private static void processarOpcoesMenu4(){
        int op1;
        mostrarMenu4();
        do {
            op1 = in.nextInt();
            switch (op1){
                case 1: { System.out.println("Foi selecionada a opção 1 do menu 4 ");mostrarMenu4(); break;}
                case 2: { System.out.println("Foi selecionada a opção 2 do menu 4 ");mostrarMenu4(); break;}
                case 3: { System.out.println("Foi selecionada a opção 3 do menu 4 "); mostrarMenu4();break;}
                case 9: { System.out.println("Foi selecionada a opção de 9 do menu 4 "); break;}
                default: System.out.println("Opção inválda. Selecione nova opção");
            }
        }while(op1!=9);
    }
        
        */
        
        while (opcaoMenu > -5) {
            while (opcaoMenu == -1) {
                opcaoMenu = escolheMenu1(scan);
                switch (opcaoMenu) {
                    case 1:
                        System.out.println("Escolheu opção 1: Login");
                        Login(rede1); // while com password. usar ficheiros com utilizadores
                        opcaoMenu = -3;
                        break;
                    case 2:
                        System.out.println("Escolheu opção 2: Registar");
                        opcaoMenu = -2;
                        break;
                    case 3:
                        System.out.println("Escolheu opção 3: Sair");
                        System.out.println(nomeLogin);
                        ManipulacaoSerializacao.gravarInformacaoFicheiro(nomeFicheiro, rede1);
                        System.out.println(rede1);
                        System.out.println("Antes ler ficheiro: +" + rede1);
                        rede1 = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);      
                        System.out.println("Depois de ler ficheiro: +" + rede1);      
                        opcaoMenu = -6;
                        break;
                    default:
                        System.out.println("Opção inexistente. Tente novamente.");
                        opcaoMenu = -1;
                }
            }
            
            while (opcaoMenu == -2) {
                opcaoMenu = escolheMenu2(scan);
                switch (opcaoMenu) {
                    case 1:
                        System.out.println("Escolheu opção 1: Criar Utilizador");
                        registarUtilizador(rede1);
                        opcaoMenu = -1;
                        break;
                    case 2:
                        System.out.println("Escolheu opção 2: Voltar");
                        opcaoMenu = -1;
                        break;
                    default:
                        System.out.println("Opção inexistente. Tente novamente.");
                        opcaoMenu = -2;
                }
            }

            while (opcaoMenu == -3) {
                opcaoMenu = escolheMenu3(scan);
                switch (opcaoMenu) {
                    case 1:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 1: Editar Perfil");
                        EditarPerfil(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 2:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 2: Criar Página");
                        CriarPaginaPessoal(rede1);
                        ConsultarPagina(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 3:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 3: Consultar página do utilizador ativo");
                        ConsultarPagina(rede1); 
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 4:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 4: Consultar página de outro utilizador");
                        ConsultarPaginaoOutro(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 5:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 5: Pedir Amizade");
                        pedirAmizade(rede1); // erro.........................................
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 6:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 6: Consultar Pedidos de Amizade Recebidos");
                        listarPedidosAmizadeRecebidos(nomeLogin, rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;    
                    case 7:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 7: Fazer publicação");
                        fazerPublicacao(rede1, nomeLogin); 
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 8:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 8: Listar publicações do utilizador ativo");
                        listarPublicacoesDoUtilizador(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 9:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 9: Listar publicações partilhadas com o utilizador ativo");
                        listarPublicacoesPartilhadasComUtilizador(rede1, nomeLogin);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 10:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 10: Listar relacionamentos do utilizador ativo");
                        listarRelacionamentos(nomeLogin, rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 11:
                        opcaoMenu = -6;
                        String input = "";
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 11: Comentar uma publicação");
                        //
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 12:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 12: Reagir a uma publicação");
                        //metodo Reagir a uma publicação
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 13:
                        opcaoMenu = -6;
                        String titulo = "";
                        String texto = "";
                        ///whiles para input
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 13: Criar Evento");
                        while (titulo.equals("")) {
                        System.out.println("Insira o titulo do evento: ");
                        titulo = scan.nextLine();
                        }
                        while (texto.equals("")) {
                        System.out.println("Insira a descrição do evento");
                        texto = scan.nextLine();
                        }
                        CriarEvento(rede1, titulo, texto);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 14:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 14: Editar Evento");
                        EditarEventos(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 15:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 15: Consultar Eventos criados pelo utilizador ativo");
                        listarEventosDoUtilizadorAtivo(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 16:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 16: Consultar todos os Eventos");
                        ListarTodosOsEventos(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;    
                        /* Consultar Calendário de enventos
                        case 16:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 16: Consultar os Eventos do meu Calendário");
                        ListarEventosAdicionadosCalendario(rede1);
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;   
                        */
                    case 17:
                        System.out.println("Escolheu opção 18: Voltar");
                        opcaoMenu = -1;
                        break;
                        
                        // Dados analiticos por print todos de uma vez
                        //Titulo -> Dados -> Titulo -> Dados
                    default:
                        System.out.println("Opção inexistente. Tente novamente.");
                        opcaoMenu = -3;
                }
            }
        }
    }
     
    public void reagirPublicacao(Rede rede, String nomeLogin) {
        //Perguntar pelo utilizador (amigo ou proprio)
        //listarPublicacoesDeUtilizadorEspecifico(String nome, Rede rede)
        //Mostrar o ID de cada publicacao
        // Dar a opcao de escolher o Id que quiser
        System.out.println("Escreva o utilizador do qual deseja ver publicações");
        String nomeUProcura= scan.nextLine();
        listarPublicacoesDeUtilizadorEspecifico(nomeUProcura,rede);
        System.out.println("Escreva o codigo da publicação que quer reagir");
        int codigoProcura= scan.nextInt();
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
   public void comentarPublicacao(Rede rede) {
        System.out.println("Escreva o utilizador do qual deseja ver publicações");
        String nomeUProcura= scan.nextLine();
        listarPublicacoesDeUtilizadorEspecifico(nomeUProcura,rede);
        System.out.println("Escreva o codigo da publicação que quer comentar");
        int codigoProcura = scan.nextInt();
        System.out.println("Escreva o seu comentario ");
        String corpoC = scan.nextLine();
        Comentario c = new Comentario(corpoC);
        procurarPublicacaoPaginas(rede,codigoProcura).adicionarComentario(c); //procura a publicacaopagina com o codigo inserido e adiciona o comentario
    }
   
   //SEMANA 4 airton
   public PublicacaoPaginas procurarPublicacaoPaginas(Rede r, int codigoAProcurar){
        
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
        System.out.println(p);
    }
    
    public static void ConsultarPaginaoOutro(Rede rede){
        String Utilizador = "";
        while (Utilizador.equals("")) {
        System.out.println("Nome do utlizador de que pretende ver a pagina?");
        Utilizador=scan.nextLine();
        }
        rede.procurarUtilizador2(Utilizador).getPagina();
    }

    //perguntar se está bem
    public static void fazerPublicacao(Rede rede, String nomeLogin) {
        String corpo = "";
        while (corpo.equals("")) {
            System.out.println("Escreva a sua publicação");
            corpo = scan.nextLine();
        }
        
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        Publicacao p = new Publicacao(corpo);
        u.adicionarPublicacoes(p);
        System.out.println(p);
                
        
        try {
            Publicacao p1 = (Publicacao) p.clone();  //Da erro quando utilizo o clone para fazer publicações-pagina
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
         
      
        int i = 0;
        for (Relacionamento re : u.getListaRelacionamentos()) {
            if (re.getNomeAmigo().equals(rede.getListaUtilizadores().get(i).getNome())) { //procura nome do amigo no array de utilizadores 
                PublicacaoPaginas pp = new PublicacaoPaginas(p, rede.getListaUtilizadores().get(i).getPagina());
                rede.adicionarPublicacaoPaginas(pp);
            }

            i++;
        }
    }

    //nomeLogin
    public static void listarPublicacoesDoUtilizador(Rede rede) {
        System.out.println("As suas publicações");
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        int i = 0;
        for (Publicacao p : u.getPublicacoes()) {
            System.out.println(u.getPublicacoes());
        //u.getPublicacoes().get(i).toString(); //fazer override de metodo toString
        }
    }

    public static void listarPublicacoesPartilhadasComUtilizador(Rede rede, String nomeLogin) {
        System.out.println("Publicações partilhadas consigo");
        Utilizador u = rede.procurarUtilizador2(nomeLogin); //utilizador ativo
        int i = 0;
        for (Relacionamento rel : u.getListaRelacionamentos()) {
            listarPublicacoesDeUtilizadorEspecifico(u.getListaRelacionamentos().get(i).getNomeAmigo(), rede);
     
                i++;
        }
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
    public int qtdLikesPublicacaoPagina(Rede rede, int codigo){
    int qtdLikes = procurarPublicacaoPaginas(rede,codigo).getQtdLikes();
    return qtdLikes;
    }
    //SEMANA 4 airton
    public int qtdDislikesPublicacaoPagina(Rede rede, int codigo){
    int qtdDislikes = procurarPublicacaoPaginas(rede,codigo).getQtdDislikes();
    return qtdDislikes;
    }
    // Comentarios por publicações, fazer medias
    public int qtdRelacionamentosDeUtilizador(Rede rede, String nome){
    int qtdR = rede.procurarUtilizador2(nome).getRelacionamentos().size();
    return qtdR;
    }
    public int qtdInteressesDeUtilizador(Rede rede, String nome){
    int qtdI= rede.procurarUtilizador2(nome).getInteresses().size();
    return qtdI;
    }
    public int qtdPublicacoesDeUtilizador(Rede rede, String nome){
    int qtdP= rede.procurarUtilizador2(nome).getPublicacoes().size();
    return qtdP;
    }
    public void likesVsDislikesPublicacao(Rede rede, int codigoP){
    int qtdLikes = qtdLikesPublicacaoPagina(rede, codigoP);
    int qtdDislikes = qtdDislikesPublicacaoPagina(rede,codigoP);
    int total = qtdLikes + qtdDislikes;
    
    double percentagemLikes = (qtdLikes * 100)/total;
    double percentagemDislikes = (qtdDislikes * 100)/total;
    
    System.out.println(percentagemLikes+"% de likes");
    System.out.println(percentagemDislikes+"% de dislikes");
    }
    public int likesTotaisUtilizador(Rede rede, String nome){
    Utilizador u = rede.procurarUtilizador2(nome);
    int likes= 0;
     for (Publicacao p : u.getPublicacoes()){
        likes+=qtdLikesPublicacaoPagina(rede,p.getCodPb());     
     }
     return likes;
    }
    public int dislikesTotaisUtilizador(Rede rede, String nome){
    Utilizador u = rede.procurarUtilizador2(nome);
    int dislikes= 0;
     for (Publicacao p : u.getPublicacoes()){
        dislikes+=qtdLikesPublicacaoPagina(rede,p.getCodPb());     
     }
     return dislikes;
    }
    public void likesVsDislikesUtilizador(Rede rede, String nome){
    int likes = likesTotaisUtilizador(rede,nome);
    int dislikes = dislikesTotaisUtilizador(rede,nome);
    int total= likes + dislikes;
    double percentagemLikes = (likes * 100)/total;
    double percentagemDislikes = (dislikes * 100)/total;
    
    System.out.println(percentagemLikes+"% de likes");
    System.out.println(percentagemDislikes+"% de dislikes");
    }
    //TESTAR
    public void amigosEmComum(Rede rede, String nomeLogin){
    Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin);
    System.out.println("Insira o amigo com o qual pretende ver os amigos em comum");
    String nomeAmigo= scan.nextLine();
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
    public void interessesEmComum(Rede rede, String nomeLogin){
    Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin);
    System.out.println("Insira o amigo com o qual pretende ver os interesses em comum");
    String nomeAmigo= scan.nextLine();
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
    
    
    
    public void listaDeAmigos(Rede rede, String nomeLogin){
     Utilizador u = rede.procurarUtilizador2(nomeLogin); //utilizador ativo
        int i = 0;
        for (Relacionamento rel : u.getListaRelacionamentos()) {        
           System.out.println(u.getListaRelacionamentos().get(i).getNomeAmigo());
           i++;
        }
        System.out.println("Tens "+u.getListaRelacionamentos().size()+" amigos!");
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
                if (input.equals(u.getNome())) {
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
        
        
        
        

    private static int escolheMenu1(Scanner scan) {
        int opcao = -1;
        while (opcao < 0) {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 1                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Login;");
            System.out.println("2: Registar;");
            System.out.println("3: Sair;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
            opcao = scan.nextInt();
        }

        return opcao;
    }

    private static int escolheMenu2(Scanner scan) {
        int opcao = -1;
        while (opcao < 0) {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 2                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Criar Utilizador;");
            System.out.println("2: Voltar;");
            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
            opcao = scan.nextInt();
        }

        return opcao;
    }

    private static int escolheMenu3(Scanner scan) {
        int opcao = -1;
        while (opcao < 0) {
            System.out.println("\n");
            System.out.println("________________________________________________\n");
            System.out.println("                    MENU 3                    ");
            System.out.println("________________________________________________");
            System.out.println("1: Editar Perfil;");
            System.out.println("2: Criar Página;");
            System.out.println("3: Consultar página do utilizador ativo;");
            System.out.println("4: Consultar página de outro utilizador;");
            System.out.println("5: Pedir Amizade;");
            System.out.println("6. Consultar Pedidos de Amizade Recebidos;");
            System.out.println("7: Fazer publicação;");
            System.out.println("8: Listar publicações do utilizador ativo;");
            System.out.println("9: Listar publicações partilhadas com o utilizador ativo;");
            System.out.println("10: Listar relacionamentos do utilizador ativo;");
            System.out.println("11: Comentar uma publicação;");
            System.out.println("12: Reagir a uma publicação;");
            System.out.println("13: Criar Evento;");
            System.out.println("14: Editar Evento;");
            System.out.println("15: Consultar Eventos criados pelo utilizador ativo;");
            System.out.println("16: Consultar todos os Eventos;");
            System.out.println("17: Voltar;");

            System.out.println("________________________________________________");
            System.out.println("Escolher opção: ");
            opcao = scan.nextInt();
        }

        return opcao;
    }

    public static void Login(Rede rede) {
        System.out.println("Username: ");
        String nome = "";
        while (nome.equals("")) {
            nome = scan.nextLine();
        }
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false) {
            System.out.println("nao existe");
        } else {
            System.out.println("Palavra-Passe: ");
            String pwd = scan.nextLine();
            boolean resp2 = rede.VerificarLogin(nome, pwd);
            if (resp2 == false) {
                System.out.println("Palavra passe errada");
            } else {
                System.out.println("Palavra passe correta");
                nomeLogin = nome;
                System.out.println("Logado");
                System.out.println(nomeLogin);
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
            System.out.println("Selecione o numero do que pretende editar");
            System.out.println("1-nome");
            System.out.println("2-data de Nascimento");
            System.out.println("3-Interesses");
            System.out.println("4-Login");
            System.out.println("5-Password");
            op = scan.nextInt();
        }
        switch (op) {
            case 1:
                String nomePretendido = "";
                while (nomePretendido.equals("")) {
                System.out.println("Nome pretendido?");
                nomePretendido = scan.nextLine();
                }
                rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), nomePretendido);
                break;
            case 2:
                String dataNascimento = "";
                while (dataNascimento.equals("")) {
                System.out.println("Data nasicmento pretendida?");
                dataNascimento = scan.nextLine();
                }
                rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), dataNascimento);
                break;
            case 3:
                int dec = 0;
                while (dec < 1 && dec > 2) {
                System.out.println("Pretende adicionar ou remover interesses?");
                System.out.println("1-Adicionar");
                System.out.println("2-Remover");
                dec = scan.nextInt();
                }
                String interesse = "";
                if (dec == 1) {
                    while (interesse.equals("")) {
                    System.out.println("Qual interesse pretende inserir?");
                    interesse = scan.nextLine();
                    }
                    rede.adicionarInteresses(rede.procurarUtilizador2(nomeLogin), new Interesse(interesse));
                } else {
                    while (interesse.equals("")) {
                    System.out.println("Qual interesse pretende remover?");
                    interesse = scan.nextLine();
                    }
                    rede.RemoverInteresses(rede.procurarUtilizador2(nomeLogin), interesse);
                }
                break;
            case 4:
                String NovoLogin = "";
                while (NovoLogin.equals("")) {
                System.out.println("Novo login?");
                NovoLogin = scan.nextLine();
                }
                rede.alterarLogin(rede.procurarUtilizador2(nomeLogin), NovoLogin);
                break;
            case 5:
                String pwd = "";
                while (pwd.equals("")) {
                System.out.println("Nova Password?");
                pwd = scan.nextLine();
                }
                rede.alterarPwd(rede.procurarUtilizador2(nomeLogin), pwd);
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
    public static void listarPedidosAmizadeRecebidos (String nomeLogin, Rede rede) {
        int contagem = 0;
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        for (Relacionamento r : u.getListaRelacionamentos()) {
            if (r.isEstado() == false) {
                contagem +=1;
                System.out.println("Pedidos Recebidos de:");
                System.out.println(contagem + ". " + r.getNomeAmigo());
            }
        }
    }
    public static void CriarEvento(Rede rede, String titulo, String texto){
        rede.adicionarEventos(nomeLogin, titulo, texto);
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
            System.out.println("1-nome");
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
                System.out.println("Nome pretendido?");
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
                System.out.println("descrição pretendida?");
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
        
        public static void AdicionarEventoCalendario (Rede rede, Eventos e) {
            int contagem = 0;
            int opcao = 0;
            LocalDate data = LocalDate.now();
            int comparacaoDatas = 0;
            for (Eventos ev : rede.getListaEventos()) {
                data.plusDays(30).compareTo(e.getDataEvento());
                if (comparacaoDatas > 0) {
                contagem ++;
                System.out.println(contagem + ". " + ev.getNomeEv());                
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


}
/*
        String nomeFicheiro = "RedeSocialRede.ser";
        String carregarFicheiro = "S";
        rede = lerFicheiro(nomeFicheiro);
        
        if (carregarFicheiro.equalsIgnoreCase("S")) {
            try {
                rede = lerFicheiro(nomeFicheiro);
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        } 

    public static ArrayList<Eventos> ListarEventosAdicionadosCalendario(Rede rede,String nome) {
        int i = 0;    
        for (Evento e : listaEventos) {
            if (e.getNomeLogin(
        }
    }









 */
     //   while (opcaoMenu > -5) {
