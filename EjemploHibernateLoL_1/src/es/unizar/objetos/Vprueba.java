package es.unizar.objetos;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "vprueba")
public class Vprueba implements Serializable {
    @Id
	@Column(name = "nombre")
	public String nombre;

	@Column(name = "rol")
	public String rol;

	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "puntuacion")
	private int puntuacion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Vprueba(String nombre, String rol, String tipo, int puntuacion) {
		super();
		this.nombre = nombre;
		this.rol = rol;
		this.tipo = tipo;
		this.puntuacion = puntuacion;
	}

	public Vprueba() {
		super();
	}

	@Override
	public String toString() {
		return "Vprueba [nombre=" + nombre + ", rol=" + rol + ", tipo=" + tipo + ", puntuacion=" + puntuacion + "]";
	}

	
	
}
