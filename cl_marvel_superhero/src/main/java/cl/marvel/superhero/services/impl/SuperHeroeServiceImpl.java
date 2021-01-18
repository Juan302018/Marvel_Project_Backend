package cl.marvel.superhero.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.marvel.superhero.model.SuperHeroe;
import cl.marvel.superhero.repo.ISuperHeroeRepo;
import cl.marvel.superhero.services.ISuperHeroeService;

@Service
public class SuperHeroeServiceImpl implements ISuperHeroeService {

	@Autowired
	private ISuperHeroeRepo repo;
	
	/*
	 * Listar SuperHeroes
	 * @Lista todos los SuperHeroes
	 */
	
	@Override
	public List<SuperHeroe> listar() {
		return repo.findAll();
	}

	
	/*
     * Listar SuperHeroe por Id
	 * @Lista todos los SuperHeroes por Id
	 */
	
	@Override
	public SuperHeroe leerPorId(Long id) {
		Optional<SuperHeroe> op = repo.findById(id);
		return op.isPresent()?op.get(): new SuperHeroe();
	}
	
	
	/*
	 * Registrar SuperHeroe
	 * @Registra un SuperHeroe
	 */

	
	@Override
	public SuperHeroe registrar(SuperHeroe obj) {
		return repo.save(obj);
	}

	@Override
	public SuperHeroe modificar(SuperHeroe obj) {
		return repo.save(obj);
	}

	@Override
	public boolean eliminar(Long id) {
		repo.deleteById(id);
		return true;
	}

}
