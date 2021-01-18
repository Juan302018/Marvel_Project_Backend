package cl.marvel.superhero.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.marvel.superhero.model.Pelicula;
import cl.marvel.superhero.repo.IPeliculaRepo;
import cl.marvel.superhero.services.IPeliculaService;

@Service
public class PeliculasServiceImpl implements IPeliculaService {
	
	@Autowired
	private IPeliculaRepo repo; 

	@Override
	public Pelicula registrar(Pelicula obj) {
		return repo.save(obj);
	}

	@Override
	public Pelicula modificar(Pelicula obj) {
		return repo.save(obj);
	}

	@Override
	public List<Pelicula> listar() {
		return repo.findAll();
	}

	@Override
	public Pelicula leerPorId(Long id) {
		Optional<Pelicula> op = repo.findById(id);
		return op.isPresent()?op.get(): new Pelicula();
	}

	@Override
	public boolean eliminar(Long id) {
		repo.deleteById(id);
		return true;
	}

}
