package cl.marvel.superhero.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.marvel.superhero.model.Comic;
import cl.marvel.superhero.repo.IComicRepo;
import cl.marvel.superhero.services.IComicService;

@Service
public class ComicServiceImpl implements IComicService {
	
	@Autowired
	private IComicRepo repo; 

	@Override
	public Comic registrar(Comic obj) {
		return repo.save(obj);
	}

	@Override
	public Comic modificar(Comic obj) {
		return repo.save(obj);
	}

	@Override
	public List<Comic> listar() {
		return repo.findAll();
	}

	@Override
	public Comic leerPorId(Long id) {
		Optional<Comic> op = repo.findById(id);
		return op.isPresent()?op.get(): new Comic();
	}

	@Override
	public boolean eliminar(Long id) {
		repo.deleteById(id);
		return true;
	}

}
