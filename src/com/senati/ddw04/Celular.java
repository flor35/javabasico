package com.senati.ddw04;

public class Celular {
	//Atributos de la clase
	int id;
	String modelo;
	float precio;
	//Constructor se emplea al momento de crear el objeto
	//Este constructor recive automaticamente los parametros de inicio para propiedad a cada obejeto
	public Celular(int id, String modelo, float precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
		
	//Constructor que no recibe parametros no porpiedad cada objeto
	}
	public Celular() {
		super();
	}
	// getter(envia la informacion) retorna y setters(dar informacion a la variable) recibe
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Celular [id=" + id + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
}
