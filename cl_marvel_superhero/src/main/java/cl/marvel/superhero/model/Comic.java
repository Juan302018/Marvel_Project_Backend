package cl.marvel.superhero.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comic")
public class Comic implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idComic;
	
	@Column(name = "nombreComic", nullable = true, length = 70)
	private String nombreComic;

	@Column(name = "tomoComic", nullable = true, length = 70)
	private String tomoComic;
	
	@Column(name = "argumentoComic", nullable = true, length = 1000)
	private String argumentoComic;

	public Comic() {
	}

	

	public Long getIdComic() {
		return idComic;
	}



	public void setIdComic(Long idComic) {
		this.idComic = idComic;
	}



	public String getNombreComic() {
		return nombreComic;
	}

	public void setNombreComic(String nombreComic) {
		this.nombreComic = nombreComic;
	}

	public String getTomoComic() {
		return tomoComic;
	}

	public void setTomoComic(String tomoComic) {
		this.tomoComic = tomoComic;
	}

	public String getArgumentoComic() {
		return argumentoComic;
	}

	public void setArgumentoComic(String argumentoComic) {
		this.argumentoComic = argumentoComic;
	}
	
	
		
}
