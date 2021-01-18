package cl.marvel.superhero.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.marvel.superhero.model.Comic;

public interface IComicRepo extends JpaRepository<Comic, Long>{

}
