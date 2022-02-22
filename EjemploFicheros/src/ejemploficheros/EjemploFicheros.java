/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import com.alejandro.escrituraFicheros.Escritura;
import com.alejandro.lecturaFicheros.Lectura;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author alex0
 */
public class EjemploFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lectura obxLec = new Lectura();
            //File fich = new File ("nomes.txt");
        // File fich = new File ("C:\\Users\\alex0\\OneDrive\\Documentos\\NetBeansProjects\\EjemploFicheros\\nomes.txt");//pq está en el directorio raiz.
         //obxLec.leerLinea(fich);
     // File f = new File("C:\\Users\\alex0\\OneDrive\\Escritorio\\numeros.txt");
      //obxLec.leerLinea(f);
      
/*      File fich= new File("xogadores.txt");
      obxLec.lerObxectosMeterArray(fich, "\\s*,\\s*"); */
      
      Escritura esc = new Escritura();
 //     esc.engadirNumeros("numEnteiro.txt");
    //  esc.escribirBuffer("nomesBuff.txt");
      esc.escribirObxetos("escribirXogadores.txt");
    }
    
}
