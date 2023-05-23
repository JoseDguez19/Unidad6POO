/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u6.unidad6poo;
    import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ap550
 */
public class EJ2 {
    


    public static void main(String[] args) {

        File archivo;//Para manippular al archivo
        FileWriter escribir; //Para escribir en el archivo
        PrintWriter linea;//Para escribir en el archivo
        String nombre = "", dir = "", email = "";

        archivo = new File("Usuario.txt");//Preparando el archivo
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ",
                        "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa la dirección: ",
                        "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa la email: ",
                        "Solicitando datos", 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(EJ2.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre: ",
                        "Solicitando datos", 3);
                dir = JOptionPane.showInputDialog(null, "Ingresa la dirección: ",
                        "Solicitando datos", 3);
                email = JOptionPane.showInputDialog(null, "Ingresa la email: ",
                        "Solicitando datos", 3);

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(dir);
                linea.println(email);

                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(EJ2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
}