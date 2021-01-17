package cl.marvel.superhero.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pelicula implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPelicula;
	
	@Column(name = "nombrePelicula", nullable = true, length = 70)
	private String nombrePelicula;

	@Column(name = "esSecuela", nullable = true)
	private boolean esSecuela;
	
	@Column(name = "argumentoPelicula", nullable = true, length = 1000)
	private String argumentoPelicula;

	public Pelicula() {
	}

	public Long getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(Long idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public boolean isEsSecuela() {
		return esSecuela;
	}

	public void setEsSecuela(boolean esSecuela) {
		this.esSecuela = esSecuela;
	}

	public String getArgumentoPelicula() {
		return argumentoPelicula;
	}

	public void setArgumentoPelicula(String argumentoPelicula) {
		this.argumentoPelicula = argumentoPelicula;
	}
	
	

}
