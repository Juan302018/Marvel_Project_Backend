package cl.marvel.superhero.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "superHeroe")
public class SuperHeroe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSuperHeroe;
	
	@Column(name = "idApiMarvelComics", nullable = true, length = 6)
	private Long idApiMarvelComics;
	
	@Column(name = "nombreSuperHeroe", nullable = true, length = 12)
	private String nombreSuperHeroe;
	
	
	public SuperHeroe() {
	}

	public Long getIdSuperHeroe() {
		return idSuperHeroe;
	}

	public void setIdSuperHeroe(Long idSuperHeroe) {
		this.idSuperHeroe = idSuperHeroe;
	}

	public Long getIdApiMarvelComics() {
		return idApiMarvelComics;
	}

	public void setIdApiMarvelComics(Long idApiMarvelComics) {
		this.idApiMarvelComics = idApiMarvelComics;
	}

	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}

	public void setNombreSuperHeroe(String nombreSuperHeroe) {
		this.nombreSuperHeroe = nombreSuperHeroe;
	}
	
	
}
