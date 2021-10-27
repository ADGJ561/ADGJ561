/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import com.mycompany.utilitarios.Data;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    }
    
    public Rede (String nomeR, LocalDate dataC, int qtdUt, ArrayList<Utilizador> listaUtilizadores, ArrayList<PublicacaoPaginas> listaPubPag) {
        this.nomeR = NOMEREDE;
        this.dataC = DATACRIACAO;
        this.qtdUt = qtdUt;
        this.listaUtilizadores = listaUtilizadores;
        this.listaPubPag = listaPubPag;
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
            if(u.getNome().compareTo(nome) == 0) {
                return true;
                
            }
            
        }return false;
    }
    public Utilizador procurarUtilizador2 (String nome) {
        for (Utilizador u : listaUtilizadores) {
            if(u.getNome().equals(nome)) {
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
    /*
    public Cliente procurarCliente(int codigo) {
        for (Cliente c : clientes) {
            if (c.getCodigoUnico() == codigo) {
                return c;
            }
        }
        return null;
    }
    */
    
    
    void adicionarInteresses(Utilizador u,String adicionar){
        u.getInteresses().add(adicionar);
    }
    
    void RemoverInteresses(Utilizador u,String i){
       u.getInteresses().remove(i);
    }
    
    
    
    public boolean VerificarLogin (String nome, String pwd) {
        for (Utilizador u : listaUtilizadores) 
            if(u.getNome().compareTo(nome)==0 && u.getPwd().compareTo(pwd)== 0) {
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
            Utilizador u = new Utilizador (nome, dataNas, login, pwd);
            listaUtilizadores.add(u);
        }
    }
        
    public void removerUtilizador (String nome, Data dataNas, String login, String pwd) {
        boolean x = procurarUtilizador(nome);
        if (x == false) {
            Utilizador u = new Utilizador (nome, dataNas, login, pwd);
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
    }
    
    public void CriarPagina(String nomeLogin,String nome,boolean estado){
       Utilizador x = procurarUtilizador2(nomeLogin);
       x.getPagina().setNomePg(nome);
       x.getPagina().setEstado(estado);
    }
    
    public void alterarNomeUtilizador(Utilizador x,String u){
        
        x.setNome(u);
    }
         public void alterarLogin(Utilizador x,String u){
        
        x.setLogin(u);
    }
         
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
        Utilizador uAmigo = rede.procurarUtilizador2(nomeAmigo); // 
        Utilizador uAtivo = rede.procurarUtilizador2(nomeLogin); // 
        System.out.println(rede.getListaUtilizadores());
        System.out.println(u.getListaRelacionamentos());
        boolean x = uAmigo.procurarRelacionamento(uAtivo, nomeAmigo);
        if (x == false) {
            Relacionamento rAtivo = new Relacionamento(LocalDateTime.now(), false, nomeAmigo);
            Relacionamento rAmigo = new Relacionamento(LocalDateTime.now(), false, nomeLogin);
            rede.adicionarRelacionamentoListaRelacionamentos(uAmigo, rAtivo);
            rede.adicionarRelacionamentoListaRelacionamentos(uAtivo, rAmigo);
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
    
    public void adicionarUtilizador(String nome, Data dataNas, String login, String pwd) {
        listaUtilizadores.add(new Utilizador(nome, dataNas,login,pwd));
    }
     
   public void adicionarUtilizador(Utilizador u1) {
        listaUtilizadores.add(u1);
    }
   
   void adicionarEventos(String nomeLogin,String titulo,String texto){
       Utilizador u = procurarUtilizador2(nomeLogin);
        int codigoCriador = u.getCodUT();
      listaEventos.add(new Eventos(titulo,texto,codigoCriador));
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
        
    




public ArrayList<Eventos> listarEventos () {
        int contagem = 0; 
        for (Eventos e: listaEventos) {
            contagem += 1;
            System.out.println(contagem + ". Nome do evento:" + e.getNomeEv()+"- Descrição do evento: "+e.getDescricaoEvento()+"Codigo Criador= "+e.getCodCriador()); 
        } return listaEventos;
    }
    
    public ArrayList<Eventos> listarEventos2 (ArrayList<Eventos> Eventos) {
        int contagem = 0; 
        for (Eventos e: Eventos) {
            contagem += 1;
            System.out.println(contagem + ". Nome do evento:" + e.getNomeEv()+"- Descrição do evento: "+e.getDescricaoEvento()); 
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

    @Override
    public String toString() {
        return "Rede{" + "listaUtilizadores=" + listaUtilizadores + ", listaEventos=" + listaEventos + ", listaPubPag=" + listaPubPag + ", qtdUt=" + qtdUt + ", nomeR=" + nomeR + ", dataC=" + dataC + '}';
    }

    
    
         
}
