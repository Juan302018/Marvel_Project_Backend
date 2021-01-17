package cl.marvel.superhero.controller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		SuperHeroe superHeroe = service.leerPorId(id);
		if (superHeroe.getIdSuperHeroe() == null) {
			throw new ModelNotFoundException("ID SUPERHEROE NO ENCONTRADO!" + id);
		}
		return new ResponseEntity<SuperHeroe>(superHeroe, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Validated @RequestBody SuperHeroe superHeroe) {
		SuperHeroe ObjCarac = service.registrar(superHeroe);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(superHeroe.getIdSuperHeroe()).toUri();
		return ResponseEntity.created(location).build(); 
	}
}