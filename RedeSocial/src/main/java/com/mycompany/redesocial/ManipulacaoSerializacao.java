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
import java.util.ArrayList;


/**
 *
 * @author OLAF
 */
public class ManipulacaoSerializacao {
    /*
     private static ArrayList<Rede> yo = new ArrayList<>();

    private static boolean gravarFicheiro(String nomeFicheiro, ArrayList<Rede> p) {
        try {
            FileOutputStream fout = new FileOutputStream(nomeFicheiro);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            try {
                for(Rede p1:p){
                    out.writeObject(p1);
                }
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
                while(in.available()>0){
                    Rede p1 = (Rede) in.readObject();
                    yo.add(p1);
                }
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

    public static boolean gravarInformacaoFicheiro(String nomeFicheiro, ArrayList<Rede> p) {
        return gravarFicheiro(nomeFicheiro, p);
    }

    public static ArrayList<Rede> lerInformacaoFicheiro(String nomeFicheiro) {
        if (lerFicheiro(nomeFicheiro)) {
            return yo;
        } else {
            return null;
        }
    }
*/
}