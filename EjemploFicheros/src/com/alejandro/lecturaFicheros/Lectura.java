/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandro.lecturaFicheros;

import ejemploficheros.Xogador;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alex0
 */
public class Lectura {
    
    Scanner sc;
    
    public void leerLinea(File fich){
        String nom;
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                nom = sc.nextLine();
                System.out.println(nom);}
        }catch (FileNotFoundException ex) {
            System.out.println( " ERROR 1" + ex.getMessage());
        }
        finally{
            sc.close();
        }
    }
    
  /*  public void leerNome(File fich){
        
        try{
          
        sc = new Scanner(fich);
        while(sc.hasNext()){
            System.out.println(sc.next); //next lee hasta un espacio en blanco o un \n
        }
        catch(FileNotFoudException ex)
            System.out.println(" ERROR 2" + ex.toString());
        }
        finally{
                sc.close();
                }
        }
        
    public void leerConDelimitadores(File fich){
        
        sc = new Scanner(fich).useDelimiter(delimitador);//useDelimiter(" \\s* "+delimitador+" \\s* ");
        while(sc.hasNext()){
            System.out.println(sc.next());
        }
        
    }catch (FileNotFoundException ex){
    
            System.out.println(" ERROR 3 "+ ex.getMessage());
}   finally{
    sc.close();
}
*/
    public void amosarPares(File fich){
        
        String cadea;
        
        try {
            sc = new Scanner(fich);
            while(sc.hasNextLine()){
                cadea= sc.nextLine();
                String[]lista = cadea.split(",");
                for(int i =0; i <lista.length; i ++)
                    if(Integer.parseInt(lista[i])%2==0)
                    System.out.println(lista[i]);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(" ERROR ");
        }
        
        finally{
            sc.close();
        }
    } 
    
    public void lerObxectos(File fich){
        
        try {
        String cadea;//auxiliar para recibir el valor
        sc= new Scanner(fich);//abro el fichero en modo lectura
            
        while(sc.hasNextLine()){//mientras haya lineas para leer..
            cadea = sc.nextLine();//lo leo y lo meto en cadena
            System.out.println(cadea);
   /*       System.out.println( sc.nextLine()); es lo mismo que las dos lineas de arriba */
            
        }    
        } catch (FileNotFoundException ex) {
          System.out.println(" ERRO 5 " + ex.getMessage());//esto saldria en el caso de que no se pudiera leer el fichero
        }
        finally{
            sc.close();
        }
    }
     
    public ArrayList<Xogador> lerObxectosMeterArray (File fich, String delimitador){
        
        ArrayList <Xogador> lista= new ArrayList <Xogador>();
        Xogador xo;//hay que instanciarlo dentro del while
        
        try {
        String cadea;
        sc= new Scanner(fich);
            
        while(sc.hasNextLine()){
            cadea = sc.nextLine();
            String[]linea=cadea.split(delimitador);
            xo= new Xogador (linea[0], Integer.parseInt(linea[1]));
            lista.add(xo);  
        } 
        for(Xogador x: lista)
          System.out.println(x);
        }
          catch (FileNotFoundException ex) {
          System.out.println(" ERRO 5 " + ex.getMessage());
        }
        finally{
            sc.close();
        }
        return lista;
    }
}
