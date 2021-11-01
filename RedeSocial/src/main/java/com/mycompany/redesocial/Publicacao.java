/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;
import java.time.LocalDate;


/**
 *
 * @author airto
 */
public class Publicacao implements Serializable, Cloneable {

    private static int nrPb = 0;
    private int codPb;
    private String corpoPb;
    private LocalDate dataPb;
    private boolean visibilidade;

    boolean VISIBILIDADE_POR_OMISSAO = true; //true= publico, false=privado

    private String autor;

    public Publicacao(String corpoPb, String autor) {
        nrPb++;
        this.codPb = nrPb;
        this.corpoPb = corpoPb;
        dataPb = LocalDate.now();
        this.visibilidade = VISIBILIDADE_POR_OMISSAO;
        this.autor = autor;
    }

    public Publicacao(String corpoPb, boolean visibilidade, String autor) {
        nrPb++;
        this.codPb = nrPb; //int random de 0 a 300
        this.corpoPb = corpoPb;
        this.visibilidade = visibilidade;
        this.dataPb = LocalDate.now();
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(boolean visibilidade) {
        this.visibilidade = visibilidade;
    }

    public void editarPublicacao(String corpoPb) {
        this.corpoPb = corpoPb;
    }

    public int getCodPb() {
        return codPb;
    }

    public String getCorpoPb() {
        return corpoPb;
    }

    public LocalDate getDataPb() {
        return dataPb;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO: Your custom clone logic
        return super.clone();
    }
//    public void alterarVisibilidade(){
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Oprima 1 para visibilidade publica, e 2 para visibilidade privada");
//        int opcao= scan.nextInt();
//        
//       if (opcao==1){
//          this.visibilidade=true;    //melhorar metodo
//       }else visibilidade=false;
//    
//    }

    public int compareTo(Publicacao p, Publicacao p2) {
        return p2.getDataPb().compareTo(p.getDataPb());
    }

//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    @Override
    public String toString() {
        if (visibilidade==true) {
            return "\nPublicação:" + "\n Código da Publicação: " + codPb + "\n Corpo da Publicação: " + corpoPb + "\n Data da Publicação: " + dataPb + "\n Visibilidade: Pública" + "\n Autor: " + autor + "\n";
        }else{
        return "\nPublicação:" + "\n Código da Publicação: " + codPb + "\n Corpo da Publicação: " + corpoPb + "\n Data da Publicação: " + dataPb + "\n Visibilidade= Só para amigos" + "\n Autor: " + autor + "\n";
        }
    }

}
