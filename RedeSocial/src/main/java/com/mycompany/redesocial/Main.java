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
import java.util.Scanner;

/**
 *
 * @author OLAF
 */
public class Main implements Cloneable {

    static Scanner scan = new Scanner(System.in);
    private static String mail = "";

    /**
     * @param args the command line arguments
     */
    static String nomeLogin = "";
    int opcaoMenu = -0;

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {

        int opcaoMenu = -1;
        Rede rede = new Rede();

        String carregarFicheiro = "", nomeFicheiro = "", continuar = "";
        while (!(carregarFicheiro.equalsIgnoreCase("S") || carregarFicheiro.equalsIgnoreCase("N"))) {
            System.out.println("Deseja carregar de ficheiro? S/N");
            carregarFicheiro = scan.next();
        }

    }
    public void listarPublicacoesPartilhadasComUtilizador(Utilizador u, Rede r){
        u.getListaRelacionamentos().get(0).getNomeAmigo();
        System.out.println("Publicações partilhadas consigo");
     int i=0;
     for (Relacionamento re : u.getListaRelacionamentos()){
     u.getListaRelacionamentos().get(i).getNomeAmigo();
     i++;
     }
     
      for(PublicacaoPaginas p : r.getListaPubPag()){
        
      }
    
    }
    
    public void listarPublicacoesDeUtilizador(String nome){
    
    
    }
    //SEMANA 4
    public void reagirPublicacao(PublicacaoPaginas p, Rede rede) {
       
        System.out.println("Escreva a publicação que pretende reagir");
        int codigoAProcurar= scan.nextInt(); 
        //AJUDA fazer que volte se não encontrar 
        //if(procurarPublicacaoPaginas(rede,codigoAProcurar).){} if(publicacao existe) 
        System.out.println("1-LIKE / 2-DISLIKE");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                procurarPublicacaoPaginas(rede,codigoAProcurar).adicionarReacao(new Reacao(true));
                break;
            case 2:
              procurarPublicacaoPaginas(rede,codigoAProcurar).adicionarReacao(new Reacao(false));
              break;                                                                             
        }
    }
    //SEMANA 4
    public PublicacaoPaginas procurarPublicacaoPaginas(Rede r, int codigoAProcurar){
        
         int i=0;
        for (PublicacaoPaginas p : r.getListaPubPag()){
        if(codigoAProcurar==r.getListaPubPag().get(i).getPublicacao().getCodPb()){
            return r.getListaPubPag().get(i);
          } 
        } 
       return null;
    }
    //SEMANA 4
    public void comentarPublicacao(Rede rede) {
        System.out.println("Escreva o codigo da publicação que quer comentar");
        int codigoProcura = scan.nextInt();
        //MESMA COISA QUE PARA O REAGIRPUBLICAO XD
        //PublicacaoPaginas pp = procurarPublicacaoPaginas(rede,codigoProcura);
        System.out.println("Escreva o seu comentario ");
        String corpoC = scan.nextLine();
        Comentario c = new Comentario(corpoC);
        procurarPublicacaoPaginas(rede,codigoProcura).adicionarComentario(c);
    }
    
    //SEMANA 4
    public static void fazerPublicacao(Rede rede, String nomeLogin)  {
        System.out.println("Escreva a sua publicação");
        String corpo = scan.nextLine();
        Publicacao p = new Publicacao(corpo);
       
        rede.procurarUtilizador2(nomeLogin).adicionarPublicacoes(p);
        /*
        try {
            Publicacao p1 = (Publicacao) p.clone();  //Da erro quando utilizo o clone para fazer publicações-pagina
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
             */        
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        int i = 0;
        for (Relacionamento re : u.getListaRelacionamentos()) {
            if (re.getNomeAmigo().equals(rede.getListaUtilizadores().get(i).getNome())) { //procura nome do amigo no array de utilizadores 
                PublicacaoPaginas pp = new PublicacaoPaginas(p, rede.getListaUtilizadores().get(i).getPagina());
                
            }

            i++;
        }
    }
    //SEMANA 4
    public int qtdPublicacoesDeUtilizador(Rede rede, String nomeLogin){
        int nroP = rede.procurarUtilizador2(nomeLogin).getPublicacoes().size();
        return nroP;
        
    }
    // SEMANA 4
    public int qtdRelacionamentosDeUtilizador(Rede rede, String nomeLogin){
     int nroR=rede.procurarUtilizador2(nomeLogin).getListaRelacionamentos().size();
     return nroR;
        
    }
    // SEMANA 4
    public int qtdLikesDePublicacao(Rede rede, String nomeLogin, int codigoPublicacao){
        
    int i=0;
      for (PublicacaoPaginas p : rede.getListaPubPag()){
         if(codigoPublicacao==rede.getListaPubPag().get(i))  
             i++;
      }    
    
        
    }
    
    
    //Pedir amizade - adicionar um objeto à lista de relacionamentos dos utilizadores ativos e destino
    //esse relacionamento terá data igual à data em que foi aceite
    //estado false enquanto nao foi aceite
    
    public void pedirAmizade (Rede r) {
        boolean sair = false;
        boolean estado = false;
        String input = "";
        String incorreto = "";
        String v = "v";
        while (input.equals("")) {
            System.out.println("\n");
            System.out.println("Escreva o nome do utilizador que pretende adicionar como amigo:");
            System.out.println("Escreva 'v' para voltar:");
            input = scan.next();
            if (input.equals(v)) {
                //volrar como??

        if (carregarFicheiro.equalsIgnoreCase("S")) {
            nomeFicheiro = perguntarNomeFicheiro(scan, "ler");
            try {
                rede = lerFicheiro(nomeFicheiro);
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);

            }
        } else if (carregarFicheiro.equalsIgnoreCase("N")) {
            System.out.println("A carregar dados predefinidos");
            rede = criarDados();
        }
        while (opcaoMenu == -1) {
           int opcaoMenu = -1;
            opcaoMenu = escolheMenu1(scan);
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Escolheu opção 1: Login");
                    Login(rede); // while com password. usar ficheiros com utilizadores
                    opcaoMenu = -3;
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Registar");
                    opcaoMenu = -2;
                    break;
                case 3:
                    System.out.println("Escolheu opção 3: Sair");
                    perguntaGuardar(scan,rede);
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
                    registarUtilizador(rede); //while dataNas
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
                    System.out.println("Escolheu opção 1: Editar Perfil");
                    EditarPerfil(rede);
                    break;
                case 2:
                    System.out.println("Escolheu opção 2: Criar Página");
                    CriarPaginaPessoal(rede);
                    break;
                case 3:
                    System.out.println("Escolheu opção 3: Consultar página do utilizador ativo");
                    // stand.by
                    break;
                case 4:
                    System.out.println("Escolheu opção 4: Consultar página de outro utilizador");
                    //stand by
                    break;
                case 5:
                    System.out.println("Escolheu opção 5: Pedir Amizade");
                    pedirAmizade(rede); // nao le os nomes. mandar mail a prof
                    break;
                case 6:
                    System.out.println("Escolheu opção 6: Fazer publicação");
                    fazerPublicacao(rede, nomeLogin); // tentar novamente quando tivermos persistencia de dados
                    break;
                case 7:
                    System.out.println("Escolheu opção 7: Listar publicações do utilizador ativo");
                    listarPublicacoesDoUtilizador(rede);
                    break;
                case 8:
                    System.out.println("Escolheu opção 8: Listar publicações partilhadas com o utilizador ativo");
                    //metodo Listar publicações partilhadas com o utilizador ativo
                    break;
                case 9:
                    System.out.println("Escolheu opção 9: Listar relacionamentos do utilizador ativo");
                    //listarRelacionamentos(r); nani?? listarRelacionamentos tem de estar na rede?
                    break;
                case 10:
                    System.out.println("Escolheu opção 10: Comentar uma publicação");
                    //metodo Comentar uma publicação
                    break;
                case 11:
                    System.out.println("Escolheu opção 11: Reagir a uma publicação");
                    //metodo Reagir a uma publicação
                    break;
                case 12:
                    System.out.println("Escolheu opção 12: Voltar");
                    opcaoMenu = -1;
                    break;
                default:
                    System.out.println("Opção inexistente. Tente novamente.");
                    opcaoMenu = -3;
            }
        }
    }
    }

    

    /*

public void reagirPublicacao(PublicacaoPaginas p){
     //PARA O MAIN
        Scanner scan = new Scanner(System.in);   
     System.out.println("1: like / 2: dislike");
     int r1 = scan.nextInt();
      switch(r1){
          case 1:
              p.adicionarReacao(new Reacao(true));
              break;
          case 2:
              p.adicionarReacao(new Reacao(false)); 
              break;
    }
}

public void comentarPublicacao(PublicacaoPaginas p){
        //PARA O MAIN
        System.out.println("Escreva o seu comentario:");
        Scanner scan = new Scanner(System.in);
        String c = scan.next();
        p.adicionarComentario(c);
    }

     */
    

    //throws CloneNotSupportedException
    
    

    //nomeLogin
    public static void listarPublicacoesDoUtilizador(Rede rede) {
        System.out.println("As suas publicações");
        Utilizador u = rede.procurarUtilizador2(nomeLogin);
        int i = 0;
        for (Publicacao p : u.getPublicacoes()) {
            u.getPublicacoes().get(i).toString(); //fazer override de metodo toString
        }
    }
    public static void listarPublicacoesPartilhadasComUtilizador (Rede r,String nome){
     System.out.println("Publicações partilhadas consigo");   
     Utilizador u = r.procurarUtilizador2(nome); //utilizador ativo
     int i=0;
     for (Relacionamento rel : u.getListaRelacionamentos()){
         listarPublicacoesDeUtilizadorEspecifico(u.getListaRelacionamentos().get(i).getNomeAmigo(), r);{
         i++;
             }
       }
    }
    public static void listarPublicacoesDeUtilizadorEspecifico(String nome, Rede r){
     Utilizador u = r.procurarUtilizador2(nome);
     for (Publicacao p : u.getPublicacoes()){
      u.getPublicacoes().get(0).toString();
     }
   
         
         }
    

    public static void pedirAmizade(Rede rede) {
        int opcaoMenu = -4;
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
            } 
            else {
                int i = 0;
                for (Utilizador u : rede.getListaUtilizadores()) {
                    if (input.equals(u.getNome())) {
                        u.adicionarRelacionamento(LocalDateTime.now(), false, input); //
                        System.out.println("Pedido de amizade enviado com sucesso ao utilizador: " + u.getNome());
                        opcaoMenu = -3;
                    } else {
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
                                } 
                                else {
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
            System.out.println("6: Fazer publicação;");
            System.out.println("7: Listar publicações do utilizador ativo;");
            System.out.println("8: Listar publicações partilhadas com o utilizador ativo;");
            System.out.println("9: Listar relacionamentos do utilizador ativo;");
            System.out.println("10: Comentar uma publicação;");
            System.out.println("11: Reagir a uma publicação;");
            System.out.println("12: Voltar;");

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
                String nomeLogin = nome;
                System.out.println("Logado");
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
            Data dataNas = new Data() {};
            rede.registarUtilizador(nome, dataNas, nomeLogin, pwd);
            System.out.println(dataNas);
        }
    }

    public static void CriarPaginaPessoal(Rede rede) {

        System.out.println("Nome da Pagina Pessoal?");
        String nomePagina = scan.nextLine();
        System.out.println("Estado da Pagina:");
        System.out.println("1 - Público");
        System.out.println("2 - Só amigos");
        int op = scan.nextInt();
        boolean estado = true;
        if (op == 1) {
            estado = true;
        }
        else {
            estado = false;
        }
        rede.CriarPagina(nomeLogin, nomePagina, estado);
    }

    public static void EditarPerfil(Rede rede) {
        System.out.println("Selecione o numero do que pretende editar");
        System.out.println("1-nome");
        System.out.println("2-data de Nascimento");
        System.out.println("3-Interesses");
        System.out.println("4-Login");
        System.out.println("5-Password");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                System.out.println("Nome pretendido?");
                String nomePretendido = scan.nextLine();
                rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), nomePretendido);
                break;
            case 2:
                System.out.println("Data nasicmento pretendida?");
                String dataNascimento = scan.nextLine();
                rede.alterarNomeUtilizador(rede.procurarUtilizador2(nomeLogin), dataNascimento);
                break;
            case 3:
                System.out.println("Pretende adicionar ou remover?");
                System.out.println("1-Adicionar");
                System.out.println("2-Remover");
                int dec = scan.nextInt();
                if (dec == 0) {
                    System.out.println("Qual interesse pretende inserir?");
                    String interesse = scan.nextLine();
                    rede.adicionarInteresses(rede.procurarUtilizador2(nomeLogin), interesse);
                } else {
                    System.out.println("Qual interesse pretende remover?");
                    String interesse = scan.nextLine();
                    rede.RemoverInteresses(rede.procurarUtilizador2(nomeLogin), interesse);
                }
                break;
            case 4:
                System.out.println("Novo login?");
                String NovoLogin = scan.nextLine();
                rede.alterarLogin(rede.procurarUtilizador2(nomeLogin), NovoLogin);
                break;
            case 5:
                System.out.println("Nova Password?");
                String pwd = scan.nextLine();
                rede.alterarPwd(rede.procurarUtilizador2(nomeLogin), pwd);
                break;

        }

    }
       
    /*
    private static void guardarFicheiro(Rede r, String nomeFicheiro) throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream(nomeFicheiro);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(r);
        out.close();
        fileOut.close();
        System.out.printf("Dados guardados em " + nomeFicheiro);
    }
    
    private static Rede lerFicheiro(String nomeFicheiro) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(nomeFicheiro);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Rede r = (Rede) in.readObject();
        in.close();
        fileIn.close();
        return r;
    }
    
    
    private static void perguntaGuardar(Scanner scan, Rede r) {
        String guardarAlteracoes = "S", nomeFicheiro = "RedeSocialRede.ser";
        if (guardarAlteracoes.equalsIgnoreCase("S")) {
            try {
                guardarFicheiro(r, nomeFicheiro);
            } catch (FileNotFoundException fnfex) {
                System.out.println("Ficheiro nao encontrado - " + fnfex);
            } catch (IOException ioex) {
                System.out.println("Erro de Input/Output - " + ioex);
            }
        }
    }
*/
    private static Rede criarDados() {
        Rede rede = new Rede();
        return rede;
    }
    
    private static void perguntaGuardar(Scanner scan, Rede rede) {
        String guardarAlteracoes = "", nomeFicheiro = "";
        while (!(guardarAlteracoes.equalsIgnoreCase("S") || guardarAlteracoes.equalsIgnoreCase("N"))) {
            System.out.println("Deseja guardar as alteraçoes? S/N");
            guardarAlteracoes = scan.next();
        }
        if (guardarAlteracoes.equalsIgnoreCase("S")) {
            nomeFicheiro = perguntarNomeFicheiro(scan, "guardar");
            try {
                guardarFicheiro(rede, nomeFicheiro);
            } catch (FileNotFoundException fnfex) {
                System.out.println("Ficheiro nao encontrado - " + fnfex);
            } catch (IOException ioex) {
                System.out.println("Erro de Input/Output - " + ioex);
            }
        }
    }

    public static String perguntarNomeFicheiro(Scanner sc, String tipo) {
        System.out.println("Introduza o nome do ficheiro para " + tipo + " (ex: tam.ser)");
        String nomeFicheiro = sc.next();
        return nomeFicheiro;
    }

    private static void guardarFicheiro(Rede a, String nomeFicheiro) throws FileNotFoundException, IOException {
        FileOutputStream fileOut = new FileOutputStream(nomeFicheiro);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(a);
        out.close();
        fileOut.close();
        System.out.printf("Dados guardados em " + nomeFicheiro);
    }

    private static Rede lerFicheiro(String nomeFicheiro) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(nomeFicheiro);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Rede a = (Rede) in.readObject();
        in.close();
        fileIn.close();
        return a;
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
        while (opcaoMenu > -5) {
