package org.biblioteca.test;

import java.util.List;
import org.biblioteca.control.MuestraBuscar;
import org.biblioteca.control.MuestraLibro;
import org.biblioteca.interfaces.Libro;

public class Test {
    private static final String ID = "0";
    private static final String TITULO = "1";
    private static final String DESCRIPCION = "2";
    
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
