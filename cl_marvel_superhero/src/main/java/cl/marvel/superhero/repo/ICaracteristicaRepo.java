package cl.marvel.superhero.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.marvel.superhero.model.Caracteristica;

public interface ICaracteristicaRepo extends JpaRepository<Caracteristica, Integer> {

}
