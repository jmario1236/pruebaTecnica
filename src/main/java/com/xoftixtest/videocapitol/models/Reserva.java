package com.xoftixtest.videocapitol.models;

import java.util.Date;

public class Reserva {
	private int id;
	private Date fechaReservaPelicula;
	private Date fechaRetornoPelicula;
	private Usuario usuario;
	private Pelicula pelicula;
	
	public Reserva(int id, Date fechaReservaPelicula, Date fechaRetornoPelicula, Usuario usuario, Pelicula pelicula) {
		super();
		this.id = id;
		this.fechaReservaPelicula = fechaReservaPelicula;
		this.fechaRetornoPelicula = fechaRetornoPelicula;
		this.usuario = usuario;
		this.pelicula = pelicula;
	}
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaReservaPelicula() {
		return fechaReservaPelicula;
	}
	public void setFechaReservaPelicula(Date fechaReservaPelicula) {
		this.fechaReservaPelicula = fechaReservaPelicula;
	}
	public Date getFechaRetornoPelicula() {
		return fechaRetornoPelicula;
	}
	public void setFechaRetornoPelicula(Date fechaRetornoPelicula) {
		this.fechaRetornoPelicula = fechaRetornoPelicula;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
}
