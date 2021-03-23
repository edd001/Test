package org.biblioteca.control;

import java.util.ArrayList;
import java.util.List;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

public class MuestraBuscar implements Buscar{
    private List<Object> libros;
    
    public MuestraBuscar() {
        libros = new ArrayList<Object>();
        creaLista();
    }

    private void creaLista(){
        libros.add(new MuestraLibro(152,"El Llano en llamas","Compilacion de cuentos escritos por Juan Rulfo",150));
        libros.add(new MuestraLibro(153,"Pedro Páramo","Primera novela del escritor mexicano Juan Rulfo",55));
        libros.add(new MuestraLibro(154,"Como agua para chocolate","Novela romántica escrita por Laura Esquivel",60));
        libros.add(new MuestraLibro(155,"El laberinto de la soledad","Ensayo publicado por el escritor mexicano Octavio Paz",20));
        libros.add(new MuestraLibro(156,"Las batallas en el desierto","Novela corta de José Emilio Pacheco",15));
        libros.add(new MuestraLibro(157,"Confabulario","Sucesivas recopilaciones de relatos escritos por Juan José Arreola",200));
        libros.add(new MuestraLibro(158,"La muerte de Artemio Cruz","Novela del escritor mexicano Carlos Fuentes",37));
    }
    
    @Override
    public List<Libro> buscar(String... palabrasClaves) throws Exception {
        List<Libro> resultados = new ArrayList<Libro>();
        
        for (Object ml : libros){
            if ( palabrasClaves[0].equals( ((MuestraLibro)ml).getTitulo() ) ){
                resultados.add((MuestraLibro)ml);
            }
        }
        
        if (resultados != null && !resultados.isEmpty()) { 
            return resultados;
        }
        
        throw new Exception("Excepcion: Libro no encontrado.");
    }
    
}
