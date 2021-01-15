package cl.marvel.superhero.services;

import java.util.List;

public interface ICRUD<M> {

	List<M> listar();

	M leerPorId(Integer id);
}
