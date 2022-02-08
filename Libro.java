import java.util.Properties;

public class Libro { //clase

    //atributos: propiedades del objeto

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int numPag;

    public Libro(int pISBN, String pTitulo, String pAutor, int pnumPag){ //constructor

        ISBN=pISBN;
        Titulo=pTitulo;
        Autor=pAutor;
        numPag=pnumPag;

    }

    public String getAutor() { //devuelve el valor del atributo
        return Autor;
    }

    public void setAutor(String autor) { // modificar el valor del atributo
        this.Autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        this.ISBN = iSBN;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    @Override
    public String toString(){
        return "El libro "+ Titulo+ " con ISBN " +ISBN+ 
                " creado por el autor " + Autor+ " tiene "+
                numPag+ " páginas";
         
    }

    


    
}
