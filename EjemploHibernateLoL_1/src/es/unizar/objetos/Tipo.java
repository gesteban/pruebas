package es.unizar.objetos;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "tipo")
public class Tipo implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	@Column(name = "nombre")
	public String nombre;
	
	@OneToMany(mappedBy = "tipo")
	private Set<Campeon> campeones;

	public Tipo() {

	}

	public Tipo(int id, String nombre, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Tipo [id=" + id + ", nombre=" + nombre + "]";
	}

}
