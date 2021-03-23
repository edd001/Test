package org.biblioteca.test;

import java.util.Arrays;
import java.util.List;
import org.biblioteca.control.MuestraBuscar;
import org.biblioteca.control.MuestraLibro;
import org.biblioteca.interfaces.Libro;

public class Test {
    private static int CLAVE = 0;
    private static int TITULO = 1;
    private static int DESCRIPCION = 2;
    
    public static void main(String[] args){
        
        String[] cvebusca = {Integer.toString(CLAVE), Integer.toString(TITULO), Integer.toString(DESCRIPCION)}; 
        MuestraBuscar mb = new MuestraBuscar();
        List<Libro> libros = null;
        
        try {
            libros = mb.buscar("0","Llanoes");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        if (libros != null && !libros.isEmpty()) { 
            for (Libro temp : libros) {
                System.out.println( ((MuestraLibro)temp).getInformacion() );
            }
        }
    }
}
