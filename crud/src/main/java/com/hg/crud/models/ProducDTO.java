package com.hg.crud.models;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class ProducDTO {
	@Id
	private String id;

	private String nombre;

	private double precio;

	private LocalDate fecha_expi;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getFecha_expi() {
		return fecha_expi;
	}

	public void setFecha_expi(LocalDate fecha_expi) {
		this.fecha_expi = fecha_expi;
	}

}
