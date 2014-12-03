package es.unizar.puto;

import java.io.Serializable;


public class newxml implements Serializable{

	int id;
	String link;
	String idplataforma;
	String peticion;
	String xml;
	String expediente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getIdplataforma() {
		return idplataforma;
	}

	public void setIdplataforma(String idplataforma) {
		this.idplataforma = idplataforma;
	}

	public String getPeticion() {
		return peticion;
	}

	public void setPeticion(String peticion) {
		this.peticion = peticion;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public String getExpediente() {
		return expediente;
	}

	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	public newxml(int id, String link, String idplataforma, String peticion, String xml, String expediente) {
		super();
		this.id = id;
		this.link = link;
		this.idplataforma = idplataforma;
		this.peticion = peticion;
		this.xml = xml;
		this.expediente = expediente;
	}

	public newxml() {
	}

}