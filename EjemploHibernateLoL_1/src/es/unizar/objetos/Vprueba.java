package es.unizar.objetos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@NamedNativeQueries({
		@NamedNativeQuery(name = "metodoX", query = "select c.nombre, r.nombre as rol, t.nombre as tipo, p.puntuacion from campeones c, puntuacion_campeones_roles p, roles r, tipo t where c.id_tipo = t.id and c.id = p.id_campeones and p.id_roles = r.id", resultClass = Vprueba.class),
		@NamedNativeQuery(name = "metodoY", query = "select c.nombre, r.nombre as rol, t.nombre as tipo, p.puntuacion from campeones c, puntuacion_campeones_roles p, roles r, tipo t where c.id_tipo = t.id and c.id = p.id_campeones and p.id_roles = r.id and p.puntuacion > :puntuacion", resultClass = Vprueba.class) })
public class Vprueba implements Serializable {

	@Id
	@Column(name = "nombre")
	public String nombre;

	@Id
	@Column(name = "rol")
	public String rol;

	@Id
	@Column(name = "tipo")
	private String tipo;

	@Id
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
