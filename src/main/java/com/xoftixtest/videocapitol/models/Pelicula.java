package com.xoftixtest.videocapitol.models;

public class Pelicula {
	private Integer id;
	private String titulo;
	private String descripcion;
	private String actores;
	private String director;
	private Integer cantidad;
	public Pelicula(Integer id, String titulo, String descripcion, String actores, String director, Integer cantidad) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.actores = actores;
		this.director = director;
		this.cantidad = cantidad;
	}
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
