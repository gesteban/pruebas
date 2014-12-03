package es.unizar.objetos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "puntuacion_campeones_roles")
public class Puntuacion implements Serializable {

	@Id
	@ManyToOne
	@JoinColumn(name = "id_campeones")
	public Campeon campeon;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_roles")
	public Rol rol;

	@Column(name = "puntuacion")
	public int puntuacion;

	public Puntuacion() {

	}

	public Puntuacion(Campeon campeon, Rol rol, int puntuacion) {
		super();
		this.campeon = campeon;
		this.rol = rol;
		this.puntuacion = puntuacion;
	}

	public Campeon getCampeon() {
		return campeon;
	}

	public void setCampeon(Campeon campeon) {
		this.campeon = campeon;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public String toString() {
		return "Puntuacion [rol=" + rol + ", puntuacion=" + puntuacion + "]";
	}
}
