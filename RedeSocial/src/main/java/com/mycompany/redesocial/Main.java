/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author OLAF
 */
public class Main {
Scanner scan = new Scanner(System.in);
private static String mail="";
Rede r = new Rede(); // igual ao clone???

    /**
     * @param args the command line arguments
     */
    String nomeLogin = "";
         



    public void reagirPublicacao(PublicacaoPaginas p){
    System.out.println("1-LIKE / 2-DISLIKE");
    int opcao = scan.nextInt();
    switch(opcao){
        case 1:
            p.adicionarReacao(new Reacao(true));
            break;
        case 2:
            p.adicionarReacao(new Reacao(false));
    }
      }
    public void comentarPublicacao(PublicacaoPaginas p){
    System.out.println("Escreva o seu comentario ");
    String corpoC= scan.nextLine();
    p.adicionarComentario(new Comentario(corpoC));
     }
    
    public void fazerPublicacao(Utilizador u, Rede r){
    System.out.println("Escreva a sua publicação");
    String corpo= scan.nextLine();
    Publicacao p= new Publicacao(corpo);
    int i=0;
    for (Relacionamento re : u.getListaRelacionamentos()){
     if(re.getNomeAmigo().equals(r.getListaUtilizadores().get(i).getNome())){
       r.getListaUtilizadores().get(i); //ACABAR XD
         i++; 
     
     
     }
    
    
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
            }
            else {    
                int i=0;
                for (Utilizador u : r.getListaUtilizadores()) {
                    if (input.equals(u.getNome())) {
                        u.adicionarRelacionamento(LocalDateTime.now(), false, input); //
                    } 
                    else {
                        while (input.equals("")) {
                            System.out.println("Nome de utilizador não existe.");
                            System.out.println("1. Tentar Novamente;");
                            System.out.println("2. Voltar;");
                            System.out.println("Escolher opção: ");
                            incorreto.equals(scan.next());
                        }
                
                    }
                
                }
            }    
        }
    }
    
    
    
    
        int opcaoMenu = -1;
        while (opcaoMenu == -1) {
            opcaoMenu = escolheMenu1(scan);
            switch (opcaoMenu) {
                case 0:
                    System.out.println("Escolheu opção 1: Login");
                    //realizar Login
                    opcaoMenu = -3;
                    break;
                case 1:                    
                    System.out.println("Escolheu opção 2: Registar");
                    //realizar registo
                    opcaoMenu = -2;
                    break;
                case 2:
                    System.out.println("Escolheu opção 3: Sair");
                    //realizar saida do programa
                    break;
                default:
                    System.out.println("Opção inexistente. Tente novamente.");
                    opcaoMenu = -1;
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
    
        
        while (opcaoMenu == -2) {
            opcaoMenu = escolheMenu2(scan);
            switch (opcaoMenu) {
                case 0:
                    System.out.println("Escolheu opção 1: Criar Utilizador");
                    //criar utilizador
                    opcaoMenu = -3;
                    break;
                case 1:                    
                    System.out.println("Escolheu opção 2: Voltar");
                    //voltar ao menu 1
                    opcaoMenu = -1;
                    break;
                default:
                    System.out.println("Opção inexistente. Tente novamente.");
                    opcaoMenu = -2;
            }
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
    
        while (opcaoMenu == -3) {
            opcaoMenu = escolheMenu3(scan);
            switch (opcaoMenu) {
                case 0:
                    System.out.println("Escolheu opção 1: Editar Perfil");
                    //metodo editarperfil
                    break;
                case 1:                    
                    System.out.println("Escolheu opção 2: Criar Página");
                    //metodo criarpagina
                    break;
                case 2:                    
                    System.out.println("Escolheu opção 3: Consultar página do utilizador ativo");
                    //metodo Consultar página do utilizador ativo
                    break;
                case 3:                    
                    System.out.println("Escolheu opção 4: Consultar página de outro utilizador");
                    //metodo Consultar página de outro utilizador
                    break;
                case 4:                    
                    System.out.println("Escolheu opção 5: Pedir Amizade");
                    pedirAmizade(r);
                    break;
                case 5:                    
                    System.out.println("Escolheu opção 6: Fazer publicação");
                    //metodo Fazer publicação
                    break;
                case 6:                    
                    System.out.println("Escolheu opção 7: Listar publicações do utilizador ativo");
                    //metodo Listar publicações do utilizador ativo
                    break;
                case 7:                    
                    System.out.println("Escolheu opção 8: Listar publicações partilhadas com o utilizador ativo");
                    //metodo Listar publicações partilhadas com o utilizador ativo
                    break;
                case 8:                    
                    System.out.println("Escolheu opção 9: Listar relacionamentos do utilizador ativo");
                    //listarRelacionamentos(r); nani?? listarRelacionamentos tem de estar na rede?
                    break;
                case 9:                    
                    System.out.println("Escolheu opção 10: Comentar uma publicação");
                    //metodo Comentar uma publicação
                    break;
                case 10:                    
                    System.out.println("Escolheu opção 11: Reagir a uma publicação");
                    //metodo Reagir a uma publicação
                    break;
                case 11:                    
                    System.out.println("Escolheu opção 12: Voltar");
                    opcaoMenu = -2;
                    break;
                default:
                    System.out.println("Opção inexistente. Tente novamente.");
                    opcaoMenu = -3;
            }
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
    
    
    
    public static void main(String[] args) {

        /*
        private Rede rede = ManipulacaoSerializacao.lerInformacaoFicheiro("rede.obj");
        
        loginUtilizador(r);
        
        processarMenu(r);
        
        public void registarUtilicador(Rede rede) {
        
        //Pedir dados ao utilizador
        
        nome = ...
        
        rede.registarUtilizador(nome,...
        
        Login
        
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false)
        System.out.println("nao existe");
        else
        nomeLogin = nome;
        
        Passoword
        
        if (resp == false)
        System.out.println("pass incorreta");
        else
        pwdLogin = pwd;
        
        */
        
        
            
        }
    
    public void Login(Rede rede){
        System.out.println("Username: ");
        String nome = scan.nextLine();
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == false){
        System.out.println("nao existe");
        }else {
        System.out.println("Palavra-Passe: ");
        String pwd = scan.nextLine();
        boolean resp2 = rede.VerificarLogin(nome, pwd);
            if (resp2 == false) {
                System.out.println("Palavra passe errada");
            }else {
                System.out.println("Palavra passe correta");
                String nomeLogin = nome;
                System.out.println("Logado");
            }
        }
    }
    public void registarUtilizador(Rede rede){
        System.out.println("Insira username: ");
        String nome = scan.nextLine();
        boolean resp = rede.procurarUtilizador(nome);
        if (resp == true){
        System.out.println("username disponivel");
        }
        else {
       String nomeLogin = nome;
       System.out.println("Insira Palavra-passe: ");
        String pwd = scan.nextLine();
            System.out.println("Insira a sua data de nascimento");
            Data dataNas = new Data();
        rede.registarUtilizador(nome, dataNas, nomeLogin, pwd);
        }
    }
    
    public void CriarPaginaPessoal(Rede rede){
        
        System.out.println("Nome da Pagina Pessoal?");
        String nomePagina = scan.nextLine();
        System.out.println("Estado da Pagina:");
        String estado = scan.nextLine();
        rede.CriarPagina(nomeLogin, nomePagina, estado);
    }
    
    
    
    public void EditarPerfil(Rede rede){
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
                if (dec==0) {
                    System.out.println("Qual interesse pretende inserir?");
                    String interesse = scan.nextLine();
                    rede.adicionarInteresses(rede.procurarUtilizador2(nomeLogin),interesse);
                }else{
                     System.out.println("Qual interesse pretende remover?");
                     String interesse = scan.nextLine();
                    rede.RemoverInteresses(rede.procurarUtilizador2(nomeLogin),interesse);
                }
            break;
            case 4:
                System.out.println("Novo login?");
            String NovoLogin = scan.nextLine();
            rede.alterarLogin(rede.procurarUtilizador2(nomeLogin), NovoLogin);
            break;
            case 5:System.out.println("Nova Password?");
            String pwd = scan.nextLine();
            rede.alterarPwd(rede.procurarUtilizador2(nomeLogin),pwd);
            break;
        
        }
        
        
        
    }
    
}
