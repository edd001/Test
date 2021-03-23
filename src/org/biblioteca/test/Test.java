package org.biblioteca.test;

import java.util.Arrays;
import java.util.List;
import org.biblioteca.control.MuestraBuscar;
import org.biblioteca.control.MuestraLibro;
import org.biblioteca.interfaces.Libro;

public class Test {
    private static String ID = "0";
    private static String TITULO = "1";
    private static String DESCRIPCION = "2";
    
    public static void main(String[] args){
        
        String[][] cvebusca = {{ID,"152"},
            {TITULO,"Confabulario"},
            {DESCRIPCION,"Novela"},
            {ID,"100"}}; 
        MuestraBuscar mb = new MuestraBuscar();
        List<Libro> libros;
        
        for (int i = 0; i < 4; i++){
            libros = null;
            
            try {
                libros = mb.buscar(cvebusca[i][0],cvebusca[i][1]);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            if (libros != null && !libros.isEmpty()) { 
                for (Libro temp : libros) {
                    System.out.println( ((MuestraLibro)temp).getInformacion() );
                }
            }
            System.out.println("--------------------------------------------------");
        }
        
    }
}
