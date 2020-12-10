package com.clearminds.dhm.dtos;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int numero;
	private int edad;
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Estudiante(String nombre, String apellido, int numero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
	}
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Estudiante() {

	}
	
	
	public Estudiante(String nombre, String apellido, int numero, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numero = numero;
		this.edad = edad;
	}
	
	
	public Estudiante(int edad,String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", edad=" + edad
				+ "]";
	}
	
	
}
