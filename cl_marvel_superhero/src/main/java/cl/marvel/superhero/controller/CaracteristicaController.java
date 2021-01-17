package cl.marvel.superhero.controller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cl.marvel.superhero.exception.ModelNotFoundException;
import cl.marvel.superhero.model.Caracteristica;
import cl.marvel.superhero.services.ICaracteristicaService;

@RestController
@RequestMapping("/caracteristica")
public class CaracteristicaController {
	
	@Autowired
	private ICaracteristicaService service;

	@GetMapping
	public ResponseEntity<List<Caracteristica>> listarCaracteristicas() {
		List<Caracteristica> lista = service.listar();
		if (lista.equals(true)) {
			return new ResponseEntity<List<Caracteristica>>(lista, HttpStatus.OK);
		} else {
			throw new ModelNotFoundException("DATA NO ENCONTRADA! " + lista.isEmpty());
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Caracteristica> listarCaracteristicasPorId(@PathVariable("id") Integer id){
		Caracteristica caracteristicas = service.leerPorId(id);
		if (caracteristicas.getIdCaracteristica() == null) {
			throw new ModelNotFoundException("ID CARACTERISTICA NO ENCONTRADO!" + id);
		}
		return new ResponseEntity<Caracteristica>(caracteristicas, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Object> registrar(@Validated @RequestBody Caracteristica caracteristica) {
		Caracteristica ObjCarac = service.registrar(caracteristica);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(caracteristica.getIdCaracteristica()).toUri();
		return ResponseEntity.created(location).build(); 
	}
	
}
