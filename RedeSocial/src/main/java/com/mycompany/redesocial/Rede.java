/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
//import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author OLAF
 */
public class Rede implements Serializable {
       
    private static final String NOMEREDE = "Social Bit";
    //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    private static final LocalDate DATACRIACAO = java.time.LocalDate.now();
    private ArrayList<Utilizador> listaUtilizadores = new ArrayList<>();
    private ArrayList<Eventos> listaEventos = new ArrayList<>(); 
    private ArrayList<PublicacaoPaginas> listaPubPag = new ArrayList<>();
    private int qtdUt = listaUtilizadores.size(); //corrigir getQtdUt
    
    
    
    private String nomeR;
    private LocalDate dataC;
    
//Arrays
           

    
    public Rede () {
        this.nomeR = NOMEREDE;
        this.dataC = DATACRIACAO;
        this.qtdUt = qtdUt;
        this.listaUtilizadores = listaUtilizadores;
        this.listaPubPag = listaPubPag;
        listaEventos = listaEventos;
    }
    
    public Rede (String nomeR, LocalDate dataC, int qtdUt) {
        this.nomeR = NOMEREDE;
        this.dataC = DATACRIACAO;
        this.qtdUt = qtdUt;
        this.listaUtilizadores = listaUtilizadores;
        this.listaPubPag = listaPubPag;
        this.listaEventos = listaEventos;
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    public ArrayList<Eventos> getListaEventos() {
        return listaEventos;
    }

    //public SimpleDateFormat getFormatter() {
    //    return formatter;
    //}

    public int getQtdUt() {
        return qtdUt;
    }
    public int ContarUtilizadores() {
        int contador=0;
        for (int i = 0; i < listaUtilizadores.size(); i++) {
            contador++;
        }
        
        
        return contador;
    }
    public String getNomeR() {
        return nomeR;
    }

    public LocalDate getDataC() {
        return dataC;
    }

    public ArrayList<Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }

    public ArrayList<PublicacaoPaginas> getListaPubPag() {
        return listaPubPag;
    }
    
    public boolean procurarUtilizador (String nome) {
        for (Utilizador u : listaUtilizadores)  {
            if(u.getLogin().compareTo(nome) == 0) {
                return true;
                
            }
            
        }return false;
    }
    public Utilizador procurarUtilizador2 (String nome) {
        for (Utilizador u : listaUtilizadores) {
            if(u.getLogin().equals(nome)) {
                return u;  
            }
        }
        return null;
    }  
    // SEMANA 4 airton
    public PublicacaoPaginas procurarPublicacaoPaginas(int codigo){
        for (PublicacaoPaginas p: listaPubPag){
           if(p.getPublicacao().getCodPb()==codigo){
           return p;
           }
         }
        return null;
        }
    
    
    void adicionarInteresses(Utilizador u,Interesse adicionar){
        u.getInteresses().add(adicionar);
    }
    
    void RemoverInteresses(Utilizador u,int i){
       u.getInteresses().remove(i);
    }
    
    
    
    public boolean VerificarLogin (String nome, String pwd) {
        for (Utilizador u : listaUtilizadores) 
            if(u.getLogin().compareTo(nome)==0 && u.getPwd().compareTo(pwd)== 0) {
                return true;
            }return false;
        }
        //SEMANA 4
        public void adicionarPublicacaoPaginas(PublicacaoPaginas p){
         listaPubPag.add(p);
         
         }
        
     
    
        
    public void registarUtilizador (String nome, Data dataNas, String login, String pwd) {
        boolean x = procurarUtilizador(nome);
        if (x == false) {
            Utilizador u = new Utilizador (nome, login, pwd);
            listaUtilizadores.add(u);
        }
    }
        
    public void removerUtilizador (String nome, Data dataNas, String login, String pwd) {
        boolean x = procurarUtilizador(nome);
        if (x == false) {
            Utilizador u = new Utilizador (nome, login, pwd);
            listaUtilizadores.remove(u);
        }
    }
    
    public int contarUtilizadores (ArrayList<Utilizador> listaUtilizadores) {
        qtdUt = listaUtilizadores.size();
        return qtdUt;
    }
    
    public void listarUtilizadores () {
        int contagem = 0; // Para listar o numero ao utilizador para o selecionar no menu
        for (Utilizador u: listaUtilizadores) {
            contagem += 1;
            System.out.println(contagem + ". " + u.getNome()); 
        }
        System.out.println(listaUtilizadores.toString());
    }
    
    public void CriarPagina(String nomeLogin,String nome,boolean estado){
       Utilizador x = procurarUtilizador2(nomeLogin);
       x.getPagina().setNomePg(nome);
       x.getPagina().setEstado(estado);
    }
    
    public void alterarNomeUtilizador(Utilizador x,String u){
        
        x.setNome(u);
    }
        /* public void alterarLogin(Utilizador x,String u){
        
        x.setLogin(u);
        for (Relacionamento r : x.getListaRelacionamentos()) {
            r.setNomeAmigo(u);
        }
    }*/
         
         public void alterarPwd(Utilizador x,String u){
        x.setPwd(u);
    }
         
        
        
    public void adicionarRelacionamentoListaRelacionamentos (Utilizador u, Relacionamento re) {
        u.getListaRelacionamentos().add(re);
    }
    
    public void removerRelacionamentoListaRelacionamentos (Utilizador u, Relacionamento re) {
        u.getListaRelacionamentos().remove(re);
    }
    
    public void adicionarRelacionamento(Rede rede, Utilizador u, String nomeLogin, LocalDateTime dataAceitacao, boolean estado, String nomeAmigo) {
        Utilizador uAmigo = rede.procurarUtilizador2(nomeAmigo); // 
        Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin); // 
        boolean x = uAmigo.procurarRelacionamento(uAtivo, nomeAmigo);
        boolean y = uAtivo.procurarRelacionamento(uAtivo, nomeAmigo);
        if (x == true && y == true) {
            for (Relacionamento re : u.getListaRelacionamentos()) {
                if (uAtivo.getNome().equals(nomeLogin)) {
                    re.setEstado(true);
                    dataAceitacao = LocalDateTime.now();
                }
            }
            for (Relacionamento re2 : u.getListaRelacionamentos()) {
                if (uAmigo.getNome().equals(re2.getNomeAmigo())) {
                re2.setEstado(true);
                dataAceitacao = LocalDateTime.now();
                    }
                }
        }
            
        
    }

    public void adicionarRel(Rede rede, Utilizador u, String nomeLogin, String nomeAmigo) {
        Utilizador uAmigo = rede.procurarUtilizador2(nomeAmigo); // maria
        Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin); // ze
        //System.out.println(rede.getListaUtilizadores());
        //System.out.println(uAtivo.getListaRelacionamentos());
        boolean x = uAtivo.procurarRelacionamento(uAtivo, nomeAmigo);
        if (x == false) {
            Relacionamento rAtivo = new Relacionamento(LocalDateTime.now(), false, nomeAmigo, nomeLogin); //ze
            Relacionamento rAmigo = new Relacionamento(LocalDateTime.now(), false, nomeLogin, nomeLogin); // maira
            rede.adicionarRelacionamentoListaRelacionamentos(uAtivo, rAtivo);
            rede.adicionarRelacionamentoListaRelacionamentos(uAmigo, rAmigo);
            System.out.println(rede.getListaUtilizadores());
            System.out.println(u.getListaRelacionamentos().toString());
        }
    }
            
    public void removerRelacionamento(Relacionamento r, Rede rede, Utilizador u, String nomeLogin, LocalDateTime dataAceitacao, boolean estado, String nomeAmigo) {
        Utilizador uAmigo = rede.procurarUtilizador2(nomeAmigo); // 
        Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin); // 
        boolean x = uAmigo.procurarRelacionamento(uAmigo, nomeLogin);
        if (x == true) {
            for (Relacionamento re : u.getListaRelacionamentos()) {
                if (uAtivo.getNome().equals(nomeLogin)) {
                    rede.removerRelacionamentoListaRelacionamentos(u, re);
                }
                boolean y = uAtivo.procurarRelacionamento(uAtivo, nomeAmigo);
                if (y == true) {
                    if (uAmigo.getNome().equals(re.getNomeAmigo())) {
                        rede.removerRelacionamentoListaRelacionamentos(u, re);
                    }
                }

            }
        }

    }
    
    public void adicionarUtilizador(String nome, String login, String pwd) {
        listaUtilizadores.add(new Utilizador(nome, login,pwd));
    }
    
   public void adicionarUtilizador(Utilizador u1) {
        listaUtilizadores.add(new Utilizador(u1));
    }
   
   void adicionarEventos(String nomeLogin,String titulo,String texto, LocalDate dataEvento){
       Utilizador u = procurarUtilizador2(nomeLogin);
        int codigoCriador = u.getCodUT();
      listaEventos.add(new Eventos(titulo,texto,codigoCriador, dataEvento));
    }
    void adicionarEventos2(Eventos e){
      listaEventos.add(e);
    }
 public ArrayList<Eventos> procurarEventos (String nome) {
        Utilizador u = procurarUtilizador2(nome);
        ArrayList<Eventos> Eventos = new ArrayList<>();
        for (Eventos e : listaEventos) {
            if(u.getCodUT() == e.getCodCriador()) {
                Eventos.add(e);       
            }
        }return Eventos;
    }  
     public ArrayList<Eventos> procurarEventos2 (String nomeLogin) {
        Utilizador u = procurarUtilizador2(nomeLogin);
        ArrayList<Eventos> evento = new ArrayList<>();
        for (Eventos e : listaEventos) {
            if(u.getCodUT()== e.getCodCriador()) {
                evento.add(e);
               
            }return evento; 
        }
        return null;
    }  
        
    public boolean procurarRelacionamento (String nome, String nomeLogin) {
        Utilizador uAmigo = procurarUtilizador2(nome);
        //Utilizador uAtivo = procurarUtilizador2(nomeLogin);
        Relacionamento r1 = new Relacionamento();
        int i = 0;
        for (Relacionamento r : uAmigo.getRelacionamentos()) {
            if( nomeLogin.equals(uAmigo.getListaRelacionamentos().get(i).getNomeAmigo())) {
                if (uAmigo.getListaRelacionamentos().get(i).isEstado() == true) {
                    r1 = r;
                return true;
                }
            }
        i++;
        }
        return false;
    }  
    



public ArrayList<Eventos> listarEventos () {
        int contagem = 0; 
        for (Eventos e: listaEventos) {
            contagem += 1;
            System.out.println(contagem + ". Nome do evento:" + e.getNomeEv()+"- Descri????o do evento: "+e.getDescricaoEvento()+"Codigo Criador= "+e.getCodCriador()+" Data: "+e.getDataEvento()); 
        } return listaEventos;
    }
    
    public ArrayList<Eventos> listarEventos2 (ArrayList<Eventos> Eventos) {
        int contagem = 0; 
        for (Eventos e: Eventos) {
            contagem += 1;
           System.out.println(contagem + ". Nome do evento:" + e.getNomeEv()+"- Descri????o do evento: "+e.getDescricaoEvento()+"Codigo Criador= "+e.getCodCriador()+" Data: "+e.getDataEvento()); 
         } return Eventos;
    }
    
    public void AlterarNomeEventos (Eventos x, String u) {
        x.setNomeEv(u);
    }
    
     public void alterarDescricaoEventos (Eventos x,String u){
        x.setDescricaoEvento(u);
    }
     public void removerEvento (String nome,int escolha) {
       Eventos e = procurarEventos(nome).get(escolha-1);
            listaEventos.remove(e);   
    }

     
     public void adicionarEventoListaEventos (Utilizador u, Eventos e) {
        u.getListaEventos().add(e);
    }
    
     public void removerEventoListaEventos (Utilizador u, Eventos e) {
        u.getListaEventos().remove(e);
    }
     
    public void adicionarListaEventosCalendario (Utilizador u, Eventos e) {
        u.getListaEventosCalendario().add(e);
    }
       
    public void removerListaEventosCalendario (Utilizador u, Eventos e) {
        u.getListaEventosCalendario().remove(e);
    }
     
     
     
     public boolean verificarPublicacaoPaginas(int codigo){
     for(PublicacaoPaginas p: listaPubPag){
       if(p.getPublicacao().getCodPb()==codigo){
       return true;
       }
     }
     return false;

    }
     
     public String listarEventos3 () {
        int contagem = 0; 
       String evento = "";
        for (Eventos e: listaEventos) {
            contagem += 1;
            System.out.println(contagem + ". Nome do evento:" + e.getNomeEv()+"\nDescri????o do evento: "+e.getDescricaoEvento()+"\nData: "+e.getDataEvento()+"\ndata cria????o: "+e.getDataCriacao()); 
        } return evento;
    }
     
     public void alterarDataNascimento(Utilizador x,Data u){

        x.setDataNas(u);
    }

//Metodo procurar pagina na listaPubPag com nome igual ao nome da pagina do utilizador desejado (get nomePg
     
    public ArrayList<PublicacaoPaginas> procurarPubPag (Rede rede, String nome) { // recebe nome - u.getPagina.getNomePg;
        ArrayList<PublicacaoPaginas> pubPag = new ArrayList<>();
        for (PublicacaoPaginas p : listaPubPag) {
            if (nome.equals(p.getPagina().getNomePg())) {
                pubPag.add(p);
            }
        }
        return pubPag;
    }
     
    
    
     
    @Override
    public String toString() {
        return "-----REDE-----\n " + "\n Quantidade de Utilizadores= " + qtdUt + " / Nome Da Rede: " + nomeR + " / Data de cria????o=" + dataC + "\n\n -----Lista de Utilizadores----- \n" + listaUtilizadores + "\n\n -----Lista de Eventos-----\n " + listaEventos + "\n\n -----Lista de Publica????es-P??gina-----\n " + listaPubPag + "\n\n____________Social Bit____________";
    }
     
    
         
}
