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

    private static ArrayList<Rede> rede = new ArrayList<>();

    private static boolean gravarFicheiro(String nomeFicheiro, ArrayList<Rede> rede) {
        try {
            FileOutputStream fout = new FileOutputStream(nomeFicheiro);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            try {
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
            System.out.println("tamanho: "+in.available());
            try {
                    rede = (ArrayList<Rede>) in.readObject();
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
            return rede;
        } else {
            return null;
        }
    }

}
