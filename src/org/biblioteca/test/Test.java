package org.biblioteca.test;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.biblioteca.control.MuestraBuscar;
import org.biblioteca.control.MuestraLibro;
import org.biblioteca.interfaces.Libro;

public class Test {
    public static void main(String[] args){
        MuestraBuscar mb = new MuestraBuscar();
        List<Libro> libros = null;
        
        try {
            libros = mb.buscar("El Llano en llamas");
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
