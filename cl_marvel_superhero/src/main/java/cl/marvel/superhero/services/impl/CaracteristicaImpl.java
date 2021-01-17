package cl.marvel.superhero.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.marvel.superhero.model.Caracteristica;
import cl.marvel.superhero.repo.ICaracteristicaRepo;
import cl.marvel.superhero.services.ICaracteristicaService;

@Service
public class CaracteristicaImpl implements ICaracteristicaService {
	
	@Autowired
	private ICaracteristicaRepo repo;

	
	/*
	 * Listar Caracteristicas
	 * @Lista todas las caracteristicas de un SuperHeroe
	 */
	
	@Override
	public List<Caracteristica> listar() {
		return repo.findAll();
	}

	
	/*
     * Listar Caracteristicas por Id
	 * @Lista todas las caracteristicas de un SuperHeroe por Id
	 */
	
	@Override
	public Caracteristica leerPorId(Integer id) {
		Optional<Caracteristica> op = repo.findById(id);
		return op.isPresent()?op.get(): new Caracteristica();
	}
	
	
	/*
	 * Registrar Caracteristicas
	 * @Registra todas las caracteristicas de un SuperHeroe
	 */

	@Override
	public Caracteristica registrar(Caracteristica obj) {
		return repo.save(obj);
	}
	


}
