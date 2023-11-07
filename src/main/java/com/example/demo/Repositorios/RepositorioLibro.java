
package com.example.demo.Repositorios;

import com.example.demo.Entidades.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends JpaRepository<Libros, Integer> {
    
}
