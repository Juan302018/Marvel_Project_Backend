package cl.marvel.superhero.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.marvel.superhero.model.SuperHeroe;

public interface ISuperHeroeRepo extends JpaRepository<SuperHeroe, Integer> {

}
