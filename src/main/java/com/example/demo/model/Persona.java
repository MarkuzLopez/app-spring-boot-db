package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// se crea la entidad (modelo)
@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private String nombre;
	private int edad;
	
	public Persona() { }
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//getter y setters
	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; };
	public String getNombre() { return nombre;  }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public int getEdad() { return edad; }
	public void setEdad(int edad) { this.edad = edad; }	
		
}
