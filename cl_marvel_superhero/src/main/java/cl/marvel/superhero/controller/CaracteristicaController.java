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
}
