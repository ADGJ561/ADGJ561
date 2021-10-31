/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author airto
 */
public class Publicacao implements Serializable, Cloneable{
    
  private static int nrPb;
  private int codPb;
  private String corpoPb;
  private LocalDate dataPb; 
  private boolean visibilidade;
   
  boolean VISIBILIDADE_POR_OMISSAO= true; //true= publico, false=privado


    public Publicacao(String corpoPb) {
       nrPb++;
        this.codPb=nrPb; 
        this.corpoPb = corpoPb;
        dataPb= LocalDate.now();
        this.visibilidade=VISIBILIDADE_POR_OMISSAO;
    }

    public boolean isVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(boolean visibilidade) {
        this.visibilidade = visibilidade;
    }

    public Publicacao(String corpoPb, boolean visibilidade) {
        nrPb++;
        this.codPb=nrPb; //int random de 0 a 300
        this.corpoPb = corpoPb;
        this.visibilidade = visibilidade;
        this.dataPb= LocalDate.now();
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

    public int compareTo(Publicacao p,Publicacao p2) {
        return p2.getDataPb().compareTo(p.getDataPb());
    }
    
//    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  

    @Override
    public String toString() {
        return "\nPublicação{" + "\n Código da publicação=" + codPb + 
                "\n Conteúdo=" + corpoPb + 
                "\n Data de Publicação="+ dataPb+ '}';
        //.format(dtf) 
    }
    
    
}
