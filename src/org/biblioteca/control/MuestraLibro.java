package org.biblioteca.control;

import org.biblioteca.interfaces.Libro;

public class MuestraLibro implements Libro{
    
    private int id;
    private String titulo;
    private String descripcion;
    private int unidadesdisponibles;

    public MuestraLibro(int id, String titulo, String descripcion, int unidadesdisponibles) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidadesdisponibles = unidadesdisponibles;
    }

    @Override
    public String getInformacion() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.titulo).append(" (");
        sb.append(this.descripcion).append(") - ");
        sb.append(Integer.toString(this.unidadesdisponibles)).append(" unidades disponibles. (");
        sb.append(this.id).append(")");
        return sb.toString();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidadesdisponibles() {
        return this.unidadesdisponibles;
    }

    public void setUnidadesdisponibles(int unidadesdisponibles) {
        this.unidadesdisponibles = unidadesdisponibles;
    }
    
}
