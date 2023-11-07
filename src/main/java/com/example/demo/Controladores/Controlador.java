
package com.example.demo.Controladores;

import com.example.demo.Entidades.Libros;
import com.example.demo.Servicios.ServicioLibro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libro")
public class Controlador {

    @Autowired
    ServicioLibro sLibro;

    @GetMapping("")
    public List<Libros> getTodosLosLibros() {

        return sLibro.obtenerTodosLosLibros();

    }

    @PostMapping("")
    public List<Libros> postInsertarLibros(@RequestBody Libros a) {
        if (sLibro.insertarLibro(a)) {
            return sLibro.obtenerTodosLosLibros();
        } else {
            return null;
        }
    }

    @PutMapping("")
    public List<Libros> actualizarLibro(@RequestBody Libros a) {
        if (sLibro.actualizarLibro(a)) {
            return sLibro.obtenerTodosLosLibros();
        } else {
            return null;
        }
    }

    @DeleteMapping("")
    public List<Libros> eliminarLibro(@RequestBody Libros a) {
        if (sLibro.eliminarLibro(a)) {
            return sLibro.obtenerTodosLosLibros();
        } else {
            return null;
        }
    }
}
