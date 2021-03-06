package cl.marvel.superhero.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "superHeroe")
public class SuperHeroe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5003264325492647751L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSuperHeroe;
	
	@Column(name = "nombreSuperHeroe", nullable = true, length = 30)
	private String nombreSuperHeroe;
	
	@Column(name = "super_heroe", nullable = true, length = 50)
	private String superHeroe;
	
	public SuperHeroe() {
	}

	public Long getIdSuperHeroe() {
		return idSuperHeroe;
	}

	public void setIdSuperHeroe(Long idSuperHeroe) {
		this.idSuperHeroe = idSuperHeroe;
	}
	
	public String getNombreSuperHeroe() {
		return nombreSuperHeroe;
	}

	public void setNombreSuperHeroe(String nombreSuperHeroe) {
		this.nombreSuperHeroe = nombreSuperHeroe;
	}

	public String getSuperHeroe() {
		return superHeroe;
	}

	public void setSuperHeroe(String superHeroe) {
		this.superHeroe = superHeroe;
	}
	
}
