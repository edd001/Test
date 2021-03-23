package control;

import org.biblioteca.interfaces.Libro;

public class MuestraLibro implements Libro{

    @Override
    public String getInformacion() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        StringBuilder sb = new StringBuilder();
        sb.append("Captura{mp1=").append("");
        sb.append('}');
        return sb.toString();
    }
    
}
