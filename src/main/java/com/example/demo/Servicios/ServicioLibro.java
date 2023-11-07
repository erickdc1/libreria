package com.example.demo.Servicios;

import com.example.demo.Entidades.Libros;
import com.example.demo.Repositorios.RepositorioLibro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioLibro {

    @Autowired
    RepositorioLibro rLibro;

    public List<Libros> obtenerTodosLosLibros() {
        return rLibro.findAll();
    }

    public boolean insertarLibro(Libros a) {
        boolean respuesta = false;
        try {
            rLibro.save(a);
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean actualizarLibro(Libros a) {
        boolean respuesta = false;
        try {
            rLibro.save(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

    public boolean eliminarLibro(Libros a) {
        boolean respuesta = false;
        try {
            rLibro.delete(a); //insert o update a nivel BD
        } catch (Exception ex) {
            respuesta = false;
        }
        return respuesta;
    }

}
