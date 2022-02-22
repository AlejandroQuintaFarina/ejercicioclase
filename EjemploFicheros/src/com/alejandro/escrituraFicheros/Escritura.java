/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.escrituraFicheros;

import com.alejandro.lecturaFicheros.Lectura;
import ejemploficheros.Xogador;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex0
 */
public class Escritura {
    
    FileWriter fich;
    PrintWriter escritura;
    BufferedWriter bf;
    Xogador x;
    
    public void escribirNumeros(String nomeFicheiro){
        
        try {
            fich = new FileWriter(nomeFicheiro); //si le pongo false o nada despues de la coma es para escribir, y si le pongo true es para añadir
            escritura = new PrintWriter (fich);
            escritura.println(1);
            escritura.println(2);
            escritura.println(3);
            escritura.println(4);
            escritura.println(5);
            System.out.println(" FICHERO CREADO CON EXITO ");
        }
          catch (IOException ex) {
            System.out.println(" ERROR ESCITURA 1" + ex.getMessage());
        }
        
        finally{
            escritura.close();
        }
    }
    
     public void engadirNumeros(String nomeFicheiro){
        
        try {
            fich = new FileWriter(nomeFicheiro, true); //abrimos flujo para añadir 
            escritura = new PrintWriter (fich);
            escritura.println(1);
            escritura.println(2);
            escritura.println(3);
            escritura.println(4);
            escritura.println(5);
            System.out.println(" FICHERO CREADO CON EXITO ");
        }
          catch (IOException ex) {
            System.out.println(" ERROR ESCITURA 1" + ex.getMessage());
        }
        
        finally{
            escritura.close();
        }
    }
     
     public void escribirBuffer(String nomeFich){
         
        try {
            fich = new FileWriter(nomeFich, true);
            bf = new BufferedWriter(fich);
            bf.write(" aaaaa\n ");
            bf.write(" bbbbb\n ");
            bf.write(" ccccc\n ");
            bf.write(" ddddd\n ");
            bf.write(" eeeee\n ");
            bf.close();
            
            System.out.println(" ARCHIVO CREADO ");
        }   
          catch (IOException ex) {
            System.out.println(" ERRO DE ESCRITURA 3 " + ex.getMessage());
        }
        finally{
           
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println(" NO SE PUEDE CERRAR EL ARCHIVO ");
            }
        }
     }
     
     public void escribirObxetos(String nomeFich){
        
        try {
            fich = new FileWriter(nomeFich, true);
            escritura = new PrintWriter(fich);
            x = new Xogador (" aaaaa ", 11);
            escritura.println(x);
            escritura.println( new Xogador (" bbbbb", 22));
            x = new Xogador ( " ccccc", 33);
            escritura.println(x.getNome()+","+x.getDorsal());
            System.out.println(" FICHERO CREADO ");
            
        } catch (IOException ex) {
            System.out.println(" *** ");
     }
        finally{
            try {
                escritura.close();
                fich.close();
            }    
             catch (IOException ex) {
                 System.out.println(" NO SE PUEDE CREAR EL ARCHIVO ");
            }
        }
     }
     
     public void leerFicheroXogadores (String nomeFich){ 
         
        try {
           Lectura l = new Lectura();
           ArrayList<Xogador>lista = l.lerObxectosMeterArray(new File ("xogadores.txt"),"\\s");
           fich = new FileWriter("nomesX.txt");
           for(Xogador xo:lista)
               fich.write(xo.getNome());
        } catch (IOException ex) {
            System.out.println(" NO SE PUEDE CREAR EL ARCHIVO " + ex.getMessage());
        }
        finally{
            try {
                fich.close();
            } catch (IOException ex) {
                System.out.println(" NO SE PUEDE CERRAR EL FICHERO ");
            }
        }
     }
}
