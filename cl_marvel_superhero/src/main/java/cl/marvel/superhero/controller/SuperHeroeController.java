package cl.marvel.superhero.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.marvel.superhero.exception.ModelNotFoundException;
import cl.marvel.superhero.model.SuperHeroe;
import cl.marvel.superhero.services.ISuperHeroeService;

@RestController
@RequestMapping("/superHeroe")
public class SuperHeroeController{

	@Autowired
	private ISuperHeroeService service;
	
	@GetMapping
	public ResponseEntity<List<SuperHeroe>> listarSuperHeroes() {
		List<SuperHeroe> lista = service.listar();
		if (lista.equals(true)) {
			return new ResponseEntity<List<SuperHeroe>>(lista, HttpStatus.OK);
		} else {
			throw new ModelNotFoundException("DATA NO ENCONTRADA! " + lista.isEmpty());
		}	
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SuperHeroe> listarSuperHeroesPorId(@PathVariable("id") Integer id){
		SuperHeroe superHeroes = service.leerPorId(id);
		if (superHeroes.getIdSuperHeroe() == null) {
			throw new ModelNotFoundException("ID SUPERHEROE NO ENCONTRADO!" + id);
		}
		return new ResponseEntity<SuperHeroe>(superHeroes, HttpStatus.OK);
	}
}