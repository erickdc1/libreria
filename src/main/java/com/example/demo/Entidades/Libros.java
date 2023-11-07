
package com.example.demo.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="libro")
public class Libros {
    
    @Id
    private int id;
    @Column (length = 50)
    private String nLibro;
    private String Autor;
    private int numPag;
    private String Editorial;
    private String Idioma;

    public Libros() {
    }

    public Libros(int id, String nLibro, String Autor, int numPag, String Editorial, String Idioma) {
        this.id = id;
        this.nLibro = nLibro;
        this.Autor = Autor;
        this.numPag = numPag;
        this.Editorial = Editorial;
        this.Idioma = Idioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnLibro() {
        return nLibro;
    }

    public void setnLibro(String nLibro) {
        this.nLibro = nLibro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }
    
    
    
    
}
