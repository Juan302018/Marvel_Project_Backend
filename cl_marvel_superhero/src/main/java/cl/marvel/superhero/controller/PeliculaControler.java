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
import cl.marvel.superhero.model.Pelicula;
import cl.marvel.superhero.services.IPeliculaService;

@RestController
@RequestMapping("/pelicula")
public class PeliculaControler {
	
	@Autowired
	private IPeliculaService service;
	
	@GetMapping
	public ResponseEntity<List<Pelicula>> listarPeliculas() {
		List<Pelicula> lista = service.listar();
		if (lista.equals(true)) {
			return new ResponseEntity<List<Pelicula>>(lista, HttpStatus.OK);
		} else {
			throw new ModelNotFoundException("DATA NO ENCONTRADA! " + lista.isEmpty());
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pelicula> listarPeliculasPorId(@PathVariable("id") Long id){
		Pelicula peliculas = service.leerPorId(id);
		if (peliculas.getIdPelicula() == null) {
			throw new ModelNotFoundException("ID PELICULA NO ENCONTRADO!" + id);
		}
		return new ResponseEntity<Pelicula>(peliculas, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Pelicula> registrar(@Valid @RequestBody Pelicula pelicula){
		Pelicula objPelicula = service.registrar(pelicula);
		URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(pelicula.getIdPelicula()).toUri();
		return ResponseEntity.created(location).build();
     }
	
	@PutMapping
	public ResponseEntity<Pelicula> modificar(@Valid @RequestBody Pelicula pelicula){
		Pelicula objPelicula = service.modificar(pelicula);
		return new ResponseEntity<Pelicula>(objPelicula, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Pelicula> eliminar(@PathVariable("id") Long id) {
		Pelicula peliculas = service.leerPorId(id);
		if (peliculas.getIdPelicula() == null) {
			throw new ModelNotFoundException("ID PELICULA NO ENCONTRADO!" + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Pelicula>(HttpStatus.OK);
	}

}
