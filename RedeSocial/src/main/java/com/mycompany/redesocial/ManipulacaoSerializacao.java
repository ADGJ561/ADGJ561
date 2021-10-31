/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 *
 * @author OLAF
 */
public class ManipulacaoSerializacao {

    private static Rede rede;

    private static boolean gravarFicheiro(String nomeFicheiro,Rede rede) {
        try {
            FileOutputStream fout = new FileOutputStream(nomeFicheiro);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            try {
                System.out.println("gravar fiheiro: "+ rede);
                out.writeObject(rede);
                return true;
            } finally {
                out.close();
            }
        } catch (IOException ex) {
            return false;
        }
    }
    

    private static boolean lerFicheiro(String nomeFicheiro) {
        try {
            FileInputStream fin = new FileInputStream(nomeFicheiro);
            ObjectInputStream in = new ObjectInputStream(fin);
            
            try {
                    rede = (Rede) in.readObject();
                    System.out.println("Ler ficheiro: "+ rede);
                    return true;
            } finally {
                in.close();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Não conseguiu encontrar ficheiro");
            return false;
        } catch (IOException ex) {
            System.out.println("Erro na leitura do ficheiro");
            return false;
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro no carregamento da classe!!");
            return false;
        }
    }

    
    public static boolean gravarInformacaoFicheiro(String nomeFicheiro, Rede p) {
        return gravarFicheiro(nomeFicheiro, p);
    }

    public static Rede lerInformacaoFicheiro(String nomeFicheiro) {
        if (lerFicheiro(nomeFicheiro)) {
            return rede;
        } else {
            return null;
        }
    }

}
