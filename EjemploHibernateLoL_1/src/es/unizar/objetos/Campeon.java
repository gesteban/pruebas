package es.unizar.objetos;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "campeones")
public class Campeon implements Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	@Column(name = "nombre")
	public String nombre;

	@ManyToOne
	@JoinColumn(name = "id_tipo")
	private Tipo tipo;

	@OneToMany(mappedBy = "campeon")
	private Set<Puntuacion> puntuaciones;

	public Campeon() {

	}

	public Campeon(int id, String nombre, Tipo tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Campeon [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", puntuaciones=" + puntuaciones + "]";
	}

}
