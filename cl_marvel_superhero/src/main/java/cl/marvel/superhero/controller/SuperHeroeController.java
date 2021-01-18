package cl.marvel.superhero.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cl.marvel.superhero.exception.ModelNotFoundException;
import cl.marvel.superhero.model.SuperHeroe;
import cl.marvel.superhero.services.ISuperHeroeService;

@RestController
@RequestMapping("/superHeroe")
public class SuperHeroeController {

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
	public ResponseEntity<SuperHeroe> listarSuperHeroesPorId(@PathVariable("id") Long id){
		SuperHeroe superHeroe = service.leerPorId(id);
		if (superHeroe.getIdSuperHeroe() == null) {
			throw new ModelNotFoundException("ID SUPERHEROE NO ENCONTRADO!" + id);
		}
		return new ResponseEntity<SuperHeroe>(superHeroe, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<SuperHeroe> registrar(@Valid @RequestBody SuperHeroe superHeroe){
		SuperHeroe objSuperHeroe = service.registrar(superHeroe);
		URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(superHeroe.getIdSuperHeroe()).toUri();
		return ResponseEntity.created(location).build();
     }
	
	@PutMapping
	public ResponseEntity<SuperHeroe> modificar(@Valid @RequestBody SuperHeroe superHeroe){
		SuperHeroe objSuperHeroe = service.modificar(superHeroe);
		return new ResponseEntity<SuperHeroe>(objSuperHeroe, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<SuperHeroe> eliminar(@PathVariable("id") Long id) {
		SuperHeroe superHeroes = service.leerPorId(id);
		if (superHeroes.getIdSuperHeroe() == null) {
			throw new ModelNotFoundException("ID SUPERHEROE NO ENCONTRADO!" + id);
		}
		service.eliminar(id);
		return new ResponseEntity<SuperHeroe>(HttpStatus.OK);
	}
}