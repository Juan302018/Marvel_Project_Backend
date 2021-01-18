package cl.marvel.superhero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.marvel.superhero.model.Pelicula;

public interface IPeliculaRepo extends JpaRepository<Pelicula, Long>{

}
