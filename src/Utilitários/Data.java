/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilit·rios;

/**
 *
 * @author Mike
 */
import java.util.GregorianCalendar;  
public class Data  
{  
    public String dia, mes, ano, dia_semana;  
      
    /**
     *
     */
    public void le_data()  
    {  
        GregorianCalendar calendario = new GregorianCalendar();  
        dia = "" +calendario.get(GregorianCalendar.DATE);  
        mes = "" +(calendario.get(GregorianCalendar.MONTH)+1);    
        ano = "" +calendario.get(GregorianCalendar.YEAR);  
        dia_semana = "" +calendario.get(GregorianCalendar.DAY_OF_WEEK);   
        
        switch (calendario.get(GregorianCalendar.MONTH)){
            case 0: mes = "Janeiro"; break;
            case 1: mes = "Fevereiro"; break;
            case 2: mes = "Mar√ßo"; break;
            case 3: mes = "Abril"; break;
            case 4: mes = "Maio"; break;
            case 5: mes = "Junho"; break;
            case 6: mes = "Julho"; break;
            case 7: mes = "Agosto"; break;
            case 8: mes = "Setembro"; break;
            case 9: mes = "Outubo"; break;
            case 10: mes = "Novembro"; break;
            case 11: mes = "Dezembro"; break;                                       
        }
    }  
    public static void main (String [] args)  
    {  
        Data d = new Data();  
        d.le_data();  
        System.out.println(d.dia);  
        System.out.println(d.mes);  
        System.out.println(d.ano);  
        System.out.println(d.dia_semana);  
    }  
}  
