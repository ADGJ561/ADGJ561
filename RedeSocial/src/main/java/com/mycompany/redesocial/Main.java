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

    private static String nomeFicheiro = "Social2.ser";

    /**
     * @param args the command line arguments
     */
    static String nomeLogin = "";
    int opcaoMenu = 0;
////////////////////////
    //private static ArrayList<Rede> yo = new ArrayList<>();

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
        
        System.out.println(nomeLogin);
        int opcaoMenu = -1;
        ArrayList<Rede> rede = new ArrayList<>();
        System.out.println(rede);
        Rede rede1 = new Rede();
        rede.add(rede1);
        
        
        Utilizador u1 = new Utilizador("ze", new Data(1999,1,1), "ze", "123");
        Utilizador u2 = new Utilizador("maria", new Data(1999,1,2), "maria", "123");
        rede.get(0).adicionarUtilizador(u1);
        rede.get(0).adicionarUtilizador(u2);
        System.out.println("Antes rede: "+rede1);
        //System.out.println(rede.getListaUtilizadores());
        //System.out.println(rede.ContarUtilizadores());
        
        
        // Gravar informacao para o ficheiro
        //ManipulacaoSerializacao.gravarInformacaoFicheiro(nomeFicheiro, rede);
        //yo.clear();
        // Ler informacao do ficheiro

        
        //rede = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);
        System.out.println(" == rede==\n" + rede1);
        System.out.println(" == Informação do ficheiro ==\n" + rede1.toString());

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
                        ManipulacaoSerializacao.gravarInformacaoFicheiro(nomeFicheiro, rede);
                        rede = ManipulacaoSerializacao.lerInformacaoFicheiro(nomeFicheiro);
                        System.out.println(rede1);
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
                        opcaoMenu = -3;
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
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 13: Criar Evento");
                        //metodo criar evento
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 14:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 14: Editar Evento");
                        //metodo editar evento
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 15:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 15: Consultar Eventos criados pelo utilizador ativo");
                        //metodo consultar eventos utAtivo
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;
                    case 16:
                        opcaoMenu = -6;
                        while (opcaoMenu == -6) {
                        System.out.println("Escolheu opção 16: Consultar todos os Eventos");
                        //metodo consultar todos eventos
                        System.out.println("Prima 1 para voltar");
                        opcaoMenu = scan.nextInt();
                        }
                        opcaoMenu = -3;
                        break;    
                    case 17:
                        System.out.println("Escolheu opção 18: Voltar");
                        opcaoMenu = -1;
                        break;
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
            {
                i++;
            }

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
                    rede.adicionarInteresses(rede.procurarUtilizador2(nomeLogin), interesse);
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

    public void listarPublicacoesPartilhadasComUtilizador(Utilizador u, Rede r) {
        u.getListaRelacionamentos().get(0).getNomeAmigo();
        System.out.println("Publicações partilhadas consigo");
        int i = 0;
        for (Relacionamento re : u.getListaRelacionamentos()) {
            u.getListaRelacionamentos().get(i).getNomeAmigo();
            i++;
            
        }

        for (PublicacaoPaginas p : r.getListaPubPag()) {

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
 */
     //   while (opcaoMenu > -5) {
