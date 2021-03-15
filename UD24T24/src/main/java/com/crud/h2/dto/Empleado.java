package com.crud.h2.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Empleado")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private float salario;

	
	//Constructores
	
	public Empleado() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(Long id, String nombre, String trabajo, float salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
	
	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the trabajo
	 */
	public String gettrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo the trabajo to set
	 */
	public void settrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	/**
	 * @return the salario
	 */
	public float getsalario() {
		return salario;
	}

	/**
	 * @param salario the salario to set
	 */
	public void setsalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}



	
	//Metodo impresion de datos por consola
	
	
	
	
	
	
}
