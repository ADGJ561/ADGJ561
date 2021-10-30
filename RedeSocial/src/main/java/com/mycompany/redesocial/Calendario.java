/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.redesocial;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.time.format.DateTimeFormatter;

/**
 *
 * @author OLAF
 */
public class Calendario implements Serializable {
    
    private String calendario = "";
 
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    //E preciso classe calendario para que?
    //Talvez para adicionar eventos a cada dia do calendario aqui criado e chamar no main?
    
    //Calendario personalizado de eventos
        //Procurar todos os eventos
        //Adicionar ao array de eventos do utilizador
        //Listar eventos do utAtivo por ordem cronologica
    
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    Calendar cal = Calendar.getInstance();
    // array para listar data (1 semana)
    // procurar eventos data
    //
    public Calendario () {
    }
    
    public void getAno () {
        cal.get(Calendar.YEAR);
    }
    
    
    //cal.get(Calendar.YEAR)); MONTH; WEEK; HOUR; HOUR_OF_DAY


// Converter Data para Calendar
//Date date= new Date();
//Calendar cal1 = Calendar.getInstance();
//cal.setTime(date);

// Como criar um calendario com data especifica
//Calendar cal2 = new GregorianCalendar(2016, Calendar.JUNE, 21);

//Converter Calendar para Data
//Date d = cal2.getTime();


}
