package cl.marvel.superhero.model;

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
@Table(name = "caracteristica")
public class Caracteristica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCaracteristica;
	
	@Column(name = "alias", nullable = true, length = 70)
	private String alias;
	
	@Column(name = "especieRaza", nullable = false, length = 12)
	private String especieRaza;
	
	@Column(name = "sexo", nullable = false, length = 12)
	private String sexo;
	
	@Column(name = "especialidadPoder", nullable = false, length = 150)
	private String especialidadPoder;
	
	@Column(name = "estado", nullable = true, length = 12)
	private String estado;

	@OneToOne
	@JoinColumn(name = "idSuperHeroe", nullable = true, foreignKey = @ForeignKey(name = "FK_superheroe")) // colocar el as para definir el alias FK de idSuperHeroe
	private SuperHeroe superheroe;

	
	public Caracteristica() {
	}

	public Long getIdCaracteristica() {
		return idCaracteristica;
	}

	public void setIdCaracteristica(Long idCaracteristica) {
		this.idCaracteristica = idCaracteristica;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEspecieRaza() {
		return especieRaza;
	}

	public void setEspecieRaza(String especieRaza) {
		this.especieRaza = especieRaza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEspecialidadPoder() {
		return especialidadPoder;
	}

	public void setEspecialidadPoder(String especialidadPoder) {
		this.especialidadPoder = especialidadPoder;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public SuperHeroe getSuperheroe() {
		return superheroe;
	}

	public void setSuperheroe(SuperHeroe superheroe) {
		this.superheroe = superheroe;
	}
	
}
