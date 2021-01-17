package cl.marvel.superhero.controller;

import java.net.URI;
import java.util.List;
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
import cl.marvel.superhero.model.Comic;
import cl.marvel.superhero.services.IComicService;

@RestController
@RequestMapping("/comic")
public class ComicControler {
	
	@Autowired
	private IComicService service;
	
	@GetMapping
	public ResponseEntity<List<Comic>> listarComics() {
		List<Comic> lista = service.listar();
		if (!lista.isEmpty()) {
			return new ResponseEntity<List<Comic>>(lista, HttpStatus.OK);
		} else {
			throw new ModelNotFoundException("DATA NO ENCONTRADA! " + lista.isEmpty());
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Comic> listarComicsPorId(@PathVariable("id") Long id){
		Comic comics = service.leerPorId(id);
		if (comics.getIdComic() == null) {
			throw new ModelNotFoundException("ID COMIC NO ENCONTRADO!" + id);
		}
		return new ResponseEntity<Comic>(comics, HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Comic> registrar(@RequestBody Comic comic){
		Comic objComic = service.registrar(comic);
		URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(comic.getIdComic()).toUri();
		return ResponseEntity.created(location).build();
     }
	@PutMapping
	public ResponseEntity<Comic> modificar(@RequestBody Comic comic){
		Comic objComic = service.modificar(comic);
		return new ResponseEntity<Comic>(objComic, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Comic> eliminar(@PathVariable("id") Long id) {
		Comic comics = service.leerPorId(id);
		if (comics.getIdComic() == null) {
			throw new ModelNotFoundException("ID COMIC NO ENCONTRADO!" + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Comic>(HttpStatus.OK);
	}


}
