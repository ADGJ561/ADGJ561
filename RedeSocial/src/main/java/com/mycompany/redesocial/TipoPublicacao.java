/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author airto
 */
public class TipoPublicacao implements Serializable  {
    private boolean visibilidade;
    
    boolean VISIBILIDADE_POR_OMISSAO= true; //true= publico, false=privado

    public TipoPublicacao() {
        this.visibilidade=VISIBILIDADE_POR_OMISSAO;
    }
    
    public void alterarVisibilidade(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Oprima 1 para visibilidade publica, e 2 para visibilidade privada");
        int opcao= scan.nextInt();
        
       if (opcao==1){
          this.visibilidade=true;    //melhorar metodo
       }else visibilidade=false;
    
    }
}
