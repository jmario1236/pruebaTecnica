package com.xoftixtest.videocapitol.models;

public class Usuario {
	private int id;
	private String username;
	private String pass;
	private int tipo_user;
	private String cedula;
	private String nombre;
	private String direccion;
	private String telefono;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String username, String pass, int TIPO_USER, String cedula, String nombre, String direccion, String telefono ) {
		this.username = username;
		this.pass = pass;
		this.setTipo_user(TIPO_USER);
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuario: [ "+ this.nombre +"]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo_user() {
		return tipo_user;
	}

	public void setTipo_user(int tipo_user) {
		this.tipo_user = tipo_user;
	}

}
