package org.biblioteca.control;

import java.util.ArrayList;
import java.util.List;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

public class MuestraBuscar implements Buscar{
    private List<Object> libros;
    
    public MuestraBuscar() {
        creaLista();
    }

    private void creaLista(){
        this.libros = new ArrayList<Object>();
        this.libros.add(new MuestraLibro(152,"El Llano en llamas","Compilacion de cuentos escritos por Juan Rulfo",150));
        this.libros.add(new MuestraLibro(153,"Pedro Páramo","Primera novela del escritor mexicano Juan Rulfo",55));
        this.libros.add(new MuestraLibro(154,"Como agua para chocolate","Novela romántica escrita por Laura Esquivel",60));
        this.libros.add(new MuestraLibro(155,"El laberinto de la soledad","Ensayo publicado por el escritor mexicano Octavio Paz",20));
        this.libros.add(new MuestraLibro(156,"Las batallas en el desierto","Novela corta de José Emilio Pacheco",15));
        this.libros.add(new MuestraLibro(157,"Confabulario","Sucesivas recopilaciones de relatos escritos por Juan José Arreola",200));
        this.libros.add(new MuestraLibro(158,"La muerte de Artemio Cruz","Novela del escritor mexicano Carlos Fuentes",37));
    }
    
    @Override
    public List<Libro> buscar(String... palabrasClaves) throws Exception {
        List<Libro> resultados = new ArrayList<Libro>();
        
        if (palabrasClaves[0].equals("0")){
            this.porId(resultados, Integer.parseInt(palabrasClaves[1]));
        }else if (palabrasClaves[0].equals("1")){
            this.porTitulo(resultados, palabrasClaves[1]);
        } else if (palabrasClaves[0].equals("2")){
            this.porDesc(resultados, palabrasClaves[1]);
        }
        
        
        if (resultados != null && !resultados.isEmpty()) { 
            return resultados;
        }
        
        throw new Exception("Excepcion: Libro no encontrado.");
    }
    
    private void porId( List<Libro> rs, int clave ){
        //rs = new ArrayList<Libro>();
       for (Object ml : this.libros){
            if ( clave == ((MuestraLibro)ml).getId() ){
                rs.add((Libro)ml);
            }
        }
       //return rs;
    }
    
    private void porTitulo( List<Libro> rs, String titulo ){
        //rs = new ArrayList<Libro>();
        for (Object ml : this.libros){
            if ( titulo.equals( ((MuestraLibro)ml).getTitulo() ) ){
                rs.add((Libro)ml);
            }
        }
       //return rs;
    }
    
    private void porDesc( List<Libro> rs, String desc ){
        //rs = new ArrayList<Libro>();
        String minusculas;
        
        for (Object ml : this.libros){
            minusculas = ((MuestraLibro)ml).getDescripcion().toLowerCase();
            if ( minusculas.contains(desc.toLowerCase())){
                rs.add((Libro)ml);
            }
        }
       //return rs;
    }
    
    
}
