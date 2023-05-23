/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u6.unidad6poo;

/**
 *
 * @author ap550
 */
import java.io.File;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
public class EJ1 {
    public static void main(String[] args) {
       
        String nombre;
        //Paso 1
        File miArchivo;//Para manipular al archivo
        //Paso 2
        PrintWriter escribir;//Para escribir en el archivo
        //Paso 3
        miArchivo= new File("ejemploEscritura.txt");//Preparando al archivo
         //Paso 4
         if (!miArchivo.exists()){
             //Paso 4.1
             System.out.println("Archivo creado ok");
             try {
                 //Codigo donde pueden ocurrir errores (Excepciones)
                 miArchivo.createNewFile();
             } 
             catch (Exception e) {
             }
             
         }
         //Paso 4.2
         else{
             //Paso 4.2.1
             System.out.println("El archivo ya existe");
             try {
             escribir=new PrintWriter(miArchivo,"utf-8");
             nombre=JOptionPane.showInputDialog(null,"Ingresa tu nombre: ");
             escribir.println("Hola "+nombre+", bienvenido a la fiesta");
             System.out.println("Hola "+nombre+", bienvenido a la fiesta");
             escribir.close();
             }
             catch (Exception e) {
                 e.printStackTrace();
             }
         }
    }
    
}