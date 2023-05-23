/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u6.unidad6poo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author ap550
 */
public class EJ3 {
    
        public static void main(String[] args) {
     
        String MensajeAEscribir="Esta frase tiene que escribirse y despues leerse";
        String MensajeLeido="Hola, es mi primera vez exportando archivos ";
        
        try{
            FileWriter fichero=new FileWriter("CursoBasicoJAVA,txt");
            fichero.write(MensajeAEscribir);
            fichero.close();
            
        }catch(Exception ex){ex.printStackTrace();}
        
        try{
            FileReader lector=new FileReader("CursoBasicoJAVA.txt");
            BufferedReader BR=new BufferedReader(lector);
            MensajeLeido=BR.readLine();
                        
        }catch(Exception ex){ex.printStackTrace();}
        
        System.out.println("El mensaje guardado en el texto es: \n"+MensajeLeido);
    }
}
