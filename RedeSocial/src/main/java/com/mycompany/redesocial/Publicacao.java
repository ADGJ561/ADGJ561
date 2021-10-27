/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;
import java.time.LocalDateTime;
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
  private LocalDateTime dataPb; 
  private boolean visibilidade;
  
  
  
  boolean VISIBILIDADE_POR_OMISSAO= true; //true= publico, false=privado


    public Publicacao(String corpoPb) {
       nrPb++;
        this.codPb=nrPb; 
        this.corpoPb = corpoPb;
        dataPb= LocalDateTime.now();
        this.visibilidade=VISIBILIDADE_POR_OMISSAO;
    }

    public Publicacao(String corpoPb, boolean visibilidade) {
        Random rand= new Random();
        this.codPb=rand.nextInt(300); //int random de 0 a 300
        this.corpoPb = corpoPb;
        this.visibilidade = visibilidade;
        this.dataPb= LocalDateTime.now();
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

    public LocalDateTime getDataPb() {
        return dataPb;
    }

    @Override
    public String toString() {
        return "Publicacao{" + "codPb=" + codPb + ", corpoPb=" + corpoPb + ", dataPb=" + dataPb + ", visibilidade=" + visibilidade + ", VISIBILIDADE_POR_OMISSAO=" + VISIBILIDADE_POR_OMISSAO + '}';
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

    @Override
    public String toString() {
        return "\nPublicacao{" + "/ncodigo da publicação=" + codPb + 
                "\n conteudo=" + corpoPb + 
                "\n Data de Publicação="+ dataPb + 
                "\n visibilidade=" + visibilidade + 
                "\nVisibilidade=" + VISIBILIDADE_POR_OMISSAO + '}';
    }
    
    
}
